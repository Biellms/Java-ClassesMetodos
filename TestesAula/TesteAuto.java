package JavaClass;

public class TesteAuto {

	public static void main(String[] args) {
		
		// Instanciando um Objeto da classe Automóvel
		
		// Automóvel 1
		Automovel auto1 = new Automovel("Ronaldo Fenomeno","Pagani","GMS2002",2021);
		auto1.printInfo();
		System.out.println("\n --------------- TRANSFERÊNCIA DE PROPRIETARIO(A) -------------------");
		auto1.setNomeProprietario("Ronaldinho Gaucho");	// Atribuindo novo Nome Proprietário
		auto1.printInfo();
		
		// Automóvel 2
		Automovel auto2 = new Automovel("Kaká","Tesla","TMS2002",2021);
		auto2.printInfo();
		System.out.println("\n ------------------------ MUDANÇA DE PLACA --------------------------");
		auto2.setPlaca("PQP2000");	// Atribuindo nova Placa
		auto2.printInfo();
	}
}