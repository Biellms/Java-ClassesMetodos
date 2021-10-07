package JavaClass;

public class Automovel {

	// Declaração de atributos da classe
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	// Construtor
	public Automovel (String nomeProprietario, String modelo, String placa, int ano) { // Parametros
		
		// Inicializando Construtor
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	
	// Declaração de Métodos
	public void printInfo() {
		System.out.println("\n "+nomeProprietario+" possui um(a) "+modelo+" com a placa "
				+ placa+" de ano "+ano);
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
