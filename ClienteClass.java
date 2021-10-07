package JavaClass;

/* Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
 * informações deste objeto no console. */

public class ClienteClass {

	// Atributos
	private String nome;
	private String email;
	private int telefone;
	private int CPF;

	// Contrutor
	public ClienteClass ( String nome, String email, int telefone, int CPF) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.CPF = CPF;
	}
	
	// Métodos
	public void print() {
		System.out.print(" Nome: "+nome+"\n Email: "+email+"\n Telefone: "+telefone+"\n CPF: "+CPF);
	}
	
	public void compra() {
		System.out.println("\n O cliente "+nome+" comprou!! ");
	}

	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }

	public int getTelefone() { return telefone; }

	public void setTelefone(int telefone) { this.telefone = telefone; }

	public int getCPF() { return CPF; }

	public void setCPF(int cPF) { CPF = cPF; }

}
