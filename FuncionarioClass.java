package JavaClass;

import java.text.NumberFormat;

/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.*/

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

	// Métodos
	public void print() {
		System.out.printf("\n ------- FUNCIONÁRIO -------");
		System.out.print("\n Nome:"+nome);
		System.out.print("\n Cargo: "+cargo);
		System.out.print("\n Salário: "+this.formatarMoeda());
	}
	
	public String formatarMoeda() {	// Formatar Preço para R$ 0.000,00
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void aumentarSalario(double percentual) { salario *= 1 + percentual/100; } // Calcula aumento de salário
	
	// Get e Set
	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public String getCargo() { return cargo; }

	public void setCargo(String cargo) { this.cargo = cargo; }

	public double getSalario() { return salario; }

	public void setSalario(double salario) { this.salario = salario; }
	
}
