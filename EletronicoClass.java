package JavaClass;

/*Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e 
 * apresente as informações deste objeto no console.*/

import java.text.NumberFormat;

public class EletronicoClass {

	// Atributos
	private String categoria;
	private String nome;
	private String info;
	private double preco;
	
	// Construtor
	public EletronicoClass (String categoria, String nome, String info, double preco) {
		this.categoria = categoria;
		this.nome = nome;
		this.info = info;
		this.preco = preco;
	}
	
	// Métodos
	public void ligar() { System.out.print("\n Eletronico Ligado!!"); }
	
	public void desligar() { 
		System.out.print("\n --------------------------------------------");
		System.out.print("\n Eletronico Desligado!!"); }
	
	public void comprar() { System.out.print("\n Produto Comprado!!"); }
	
	public void print() {
		System.out.print("\n --------------------------------------------");
		System.out.print("\n Categoria: "+categoria);
		System.out.print("\n Nome: "+nome);
		System.out.print("\n Preço: "+this.formatarMoeda());
		System.out.print("\n Descrição: "+info);
	}
	
	public String formatarMoeda() {	// Formatar Preço para R$ 0.000,00
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}

	// Get e Set
	public String getCategoria() {return categoria;}

	public void setCategoria(String categoria) {this.categoria = categoria;}

	public String getNome() {return nome;}

	public void setNome(String nome) { this.nome = nome;}

	public String getInfo() { return info; }

	public void setInfo(String info) { this.info = info;}

	public double getPreco() { return preco;}

	public void setPreco(double preco) { this.preco = preco;}
	
}
