package JavaClass;

public class PatineteClass {
	
	// Atributos
	private String modelo;
	private String cor;
	
	// Construtor
	public PatineteClass (String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	
	// Métodos
	public void print() {
		System.out.println("\n ----------------------");
		System.out.print(" PATINETE");
		System.out.print("\n Modelo: "+modelo);
		System.out.print("\n Cor: "+cor);
		System.out.println("\n ----------------------");
	}
	
	public void acelerar() {
		System.out.print("\n ----------------------");
		System.out.print("\n VOCE ACELEROU!");
		System.out.print("\n ----------------------\n");}
	
	public void frear() { 
		System.out.print("\n ----------------------");
		System.out.print("\n VOCE FREOU!");
		System.out.print("\n ----------------------\n");}
	
	public void parar() { 
		System.out.print("\n ----------------------");
		System.out.print("\n VOCE PAROU!");
		System.out.print("\n ----------------------\n");}

	// Get e Set
	public String getModelo() {return modelo;}

	public void setModelo(String modelo) { this.modelo = modelo; }

	public String getCor() { return cor; }

	public void setCor(String cor) { this.cor = cor; }
	
}
