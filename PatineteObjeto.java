package JavaClass;

import java.util.Scanner;

public class PatineteObjeto {

	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		PatineteClass pat = new PatineteClass("Skatenet Plus","Vermelho");
		
		pat.print();
		
		do {
		System.out.print("\n Escolha uma op��o");	
		System.out.print("\n 1) Acelerar");	
		System.out.print("\n 2) Frear");
		System.out.print("\n 3) Informa��es");
		System.out.print("\n Op��o: "); op = ler.nextInt();
		
		switch (op) {	// Intera��o com o Usu�rio
		
		case 1: pat.acelerar(); break;
		case 2: pat.frear(); break;
		case 3: pat.print(); break;
		
		default: System.out.println("\n VALOR INCORRETO!!"); break;
		
			}
		} while (op != 0);
	}
}
