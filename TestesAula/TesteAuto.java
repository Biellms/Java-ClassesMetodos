package JavaClass;

public class TesteAuto {

	public static void main(String[] args) {
		
		// Instanciando um Objeto da classe Autom�vel
		
		// Autom�vel 1
		Automovel auto1 = new Automovel("Ronaldo Fenomeno","Pagani","GMS2002",2021);
		auto1.printInfo();
		System.out.println("\n --------------- TRANSFER�NCIA DE PROPRIETARIO(A) -------------------");
		auto1.setNomeProprietario("Ronaldinho Gaucho");	// Atribuindo novo Nome Propriet�rio
		auto1.printInfo();
		
		// Autom�vel 2
		Automovel auto2 = new Automovel("Kak�","Tesla","TMS2002",2021);
		auto2.printInfo();
		System.out.println("\n ------------------------ MUDAN�A DE PLACA --------------------------");
		auto2.setPlaca("PQP2000");	// Atribuindo nova Placa
		auto2.printInfo();
	}
}