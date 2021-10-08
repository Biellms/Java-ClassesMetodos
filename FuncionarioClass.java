package JavaClass;

import java.text.NumberFormat;

/*Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente 
 * as informa��es deste objeto no console.*/

public class FuncionarioClass {

	// Atributos
	private String nome;
	private String cargo;
	private double salario; 

	// Construtor
	public FuncionarioClass ( String nome, String cargo, double salario ) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	// M�todos
	public void print() {
		System.out.printf("\n ------- FUNCION�RIO -------");
		System.out.print("\n Nome:"+nome);
		System.out.print("\n Cargo: "+cargo);
		System.out.print("\n Sal�rio: "+this.formatarMoeda());
	}
	
	public String formatarMoeda() {	// Formatar Pre�o para R$ 0.000,00
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void aumentarSalario(double percentual) { salario *= 1 + percentual/100; } // Calcula aumento de sal�rio
	
	// Get e Set
	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public String getCargo() { return cargo; }

	public void setCargo(String cargo) { this.cargo = cargo; }

	public double getSalario() { return salario; }

	public void setSalario(double salario) { this.salario = salario; }
	
}
