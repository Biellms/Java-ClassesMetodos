package JavaClass;

import java.util.Scanner;

public class FuncionarioObjeto {

	public static void main(String[] args) {
		
		double a;
		Scanner ler = new Scanner(System.in);
		
		FuncionarioClass func = new FuncionarioClass ("Gabriel Mendes","Dev Java Jr.",3600);
		
		func.print();
		
		System.out.printf("\n\n ----- Alterar salario -----");
		System.out.printf("\n Novo valor: "); a = ler.nextDouble(); func.aumentarSalario(a);
		func.setSalario(a);
		func.print();
	}

}
