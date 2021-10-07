package JavaClass;

public class TesteEmpregado {

	public static void main(String[] args) {

		Empregado lista[] = new Empregado[3];
		
		lista[0] = new Empregado("Gabriel Mendes",3500);
		lista[1] = new Empregado("Luis Roberto",12000);
		lista[2] = new Empregado("Tia Jess",6000);
		
		for(Empregado a:lista) {
			a.print();
			System.out.println();
		}
		System.out.println("\n -----------------------------------------------------");
		
		for(Empregado a:lista) {
			a.aumentarSalario(20);
			a.print();
			System.out.println();
		}
	}
}
