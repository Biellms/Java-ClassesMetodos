package JavaClass;

/*  Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
 *  em seguida crie um objeto avião, defina as instancias deste objeto e apresente 
 *  as informações deste objeto no console.*/

public class AviaoClass {

	// Atributos
	private String nomeAv;
	private String marca;
	private String cor;
	private double velocidadeMax;
	private String localDecolagem;
	private String localDestino;
	
	// Construtor
	public AviaoClass (String nomeAv, String marca, String cor, double velocidadeMax, String localDecolagem, String localDestino) {
		this.nomeAv = nomeAv;
		this.marca = marca;
		this.cor = cor;
		this.velocidadeMax = velocidadeMax;
		this.localDecolagem = localDecolagem;
		this.localDestino = localDestino;
	}
	
	// Métodos
	public void iniciarVoou() {	
		int i;
		for (i = 3; i >= 1; i--) {	// Contador de decolagem
			System.out.print("\n "+i);
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			}
		System.out.printf("\n O AVIÃO DECOLOU!!");
		}
	
	public void Pousar() {
		int i;
		for (i = 1; i <= 3; i++) {	// Contador da viagem
			System.out.print("\n "+i);
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			}
		System.out.printf("\n O AVIÃO CHEGOU AO DESTINO!!"); 
		}
	
	public void print() {
		System.out.print("\n Nome: "+nomeAv);
		System.out.print("\n Marca: "+marca);
		System.out.print("\n Cor: "+cor);
		System.out.print("\n Velocidade Máxima: "+velocidadeMax+"Km/h");
		System.out.print("\n Local de Partida: "+localDecolagem);
		System.out.print("\n Local de Destino: "+localDestino);
	}

	// Get & Set
	public String getNomeAv() { return nomeAv; }

	public void setNomeAv(String nomeAv) { this.nomeAv = nomeAv; }

	public String getMarca() { return marca; }

	public void setMarca(String marca) { this.marca = marca; }

	public String getCor() { return cor; }

	public void setCor(String cor) { this.cor = cor; }

	public double getVelocidadeMax() { return velocidadeMax; }

	public void setVelocidadeMax(double velocidadeMax) { this.velocidadeMax = velocidadeMax; }

	public String getLocalDecolagem() { return localDecolagem; }

	public void setLocalDecolagem(String localDecolagem) { this.localDecolagem = localDecolagem; }

	public String getLocalDestino() { return localDestino; }

	public void setLocalDestino(String localDestino) { this.localDestino = localDestino; }
	
	
	
}
