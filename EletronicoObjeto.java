package JavaClass;

import java.util.Scanner;

public class EletronicoObjeto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int op;
		EletronicoClass produto = new EletronicoClass("Mouse","Logitech G PRO","Mouse Gamer Sem Fio "
				+ "Logitech G PRO Wireless LIGHTSPEED, RGB LIGHTSYNC,\n Ambidestro, 6 Botões Programáveis",599);
		
		produto.print();
		
		do {
		System.out.print("\n --------------------------------------------");
		System.out.printf("\n Escolha uma opção");	
		System.out.printf("\n 1) Ligar Eletronico");	
		System.out.printf("\n 2) Comprar");
		System.out.printf("\n 3) Descrição do Produto");
		System.out.printf("\n Opção: "); op = ler.nextInt();
		
		switch (op) {	// Chama os métodos da classe
		
		case 1: produto.ligar();
		System.out.printf("\n Digite 1 para desligar eletronico ou 2 para voltar: "); op = ler.nextInt();
			if (op == 1) { produto.desligar(); }
		break;
			
		case 2: produto.comprar(); break;
		
		case 3: produto.print(); 
		System.out.printf("\n Digite 1 para voltar: "); 
		op = ler.nextInt();
		break;
		
		default: System.out.println("\n VALOR INCORRETO!!"); break;
		
			}
		} while (op != 0);
	}
}
