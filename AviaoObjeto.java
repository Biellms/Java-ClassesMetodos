package JavaClass;

import java.util.Scanner;

public class AviaoObjeto {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		String a,b;
		
		AviaoClass aviao = new AviaoClass("Airbus A380-800","AirFrance","Branco",750.0,"Indefinido","Indefinido");
		
		System.out.print(" ----------- INFORMAÇÕES DO AVIÃO -----------");
		aviao.print();
		System.out.print("\n --------------------------------------------");
		
		System.out.print("\n Qual o local de PARTIDA: "); a = ler.next();
		aviao.setLocalDecolagem(a);
		
		System.out.print(" Qual o DESTINO: "); b = ler.next();
		aviao.setLocalDestino(b);
		
		System.out.print("\n --------- INFORMAÇÕES DE DECOLAGEM ---------");
		aviao.print();
		System.out.print("\n --------------------------------------------");
		
		aviao.iniciarVoou();
		System.out.print("\n --------------------------------------------");
		aviao.Pousar();
	}
}
