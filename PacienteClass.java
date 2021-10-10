package JavaClass;

import java.util.Scanner;

public class PacienteClass {

	// Atributos
	private String nome;
	private int idade;
	private String sintoma;
	
	Scanner ler = new Scanner(System.in);
	
	// Construtor
	public PacienteClass (  String nome, int idade, String sintoma) {
		this.nome = nome;
		this.idade = idade;
		this.sintoma = sintoma;
	}
	
	// Métodos
	public void print() {
		System.out.print("\n PACIENTE");
		System.out.print("\n Nome: "+nome);
		System.out.print("\n Idade: "+idade);
		System.out.print("\n Sintoma: "+sintoma);
	}

	public void remedio() {	// Opções de remédios para usuário receitar	
		int a;
		String b = "Paracetomol e Dipirona", c = "Cimegripe", d = "Dramin", e = "Dorflex", 
		f = "Paroxetina";
		
		System.out.print("\n Escolha qual remédio irá receitar");
		System.out.print("\n 1) "+b);
		System.out.print("\n 2) "+c);
		System.out.print("\n 3) "+d);
		System.out.print("\n 4) "+e);
		System.out.print("\n 5) "+f);
		System.out.print("\n Opção: "); a = ler.nextInt();
		
		System.out.print("\n ------------------------------------");
		System.out.print("\n Voce receitou ");
		if (a == 1) { System.out.print(b); } 
		if (a == 2) { System.out.print(c); } 
		if (a == 3) { System.out.print(d); } 
		if (a == 4) { System.out.print(e); }
		if (a == 5) { System.out.print(f); }
		if (a < 1 || a > 5) { System.out.print("\n Opção Inválida!!"); }
		System.out.print("\n ------------------------------------");
	}
	
	// Get e Set
	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public int getIdade() { return idade; }

	public void setIdade(int idade) { this.idade = idade; }

	public String getSintoma() { return sintoma; }

	public void setSintoma(String sintoma) { this.sintoma = sintoma; }	
	
	
}
