package JavaClass;

import java.util.Scanner;

public class ContaObjeto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int op;
		
		ContaClass cont = new ContaClass("Gabriel Mendes","S�o Paulo - SP","111222333-44","Nubank",0);

		cont.print();
		
		do {
		System.out.print("\n -----------------------------");
		System.out.print("\n Escolha uma op��o");	
		System.out.println("\n Saldo: "+cont.formatarMoeda());
		System.out.print("\n 1) Depositar");	
		System.out.print("\n 2) Sacar");
		System.out.print("\n 3) Dados Banc�rios");
		System.out.print("\n Op��o: "); op = ler.nextInt();
			
		switch (op) {	// Intera��o com o Usu�rio
			
		case 1: cont.depositar(); break;
		case 2: cont.sacar(); break;
		case 3: cont.print(); break;
		
		default: System.out.println("\n VALOR INCORRETO!!"); break;
		
			}
		} while (op != 0);
	}
}
