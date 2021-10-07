package JavaClass;

public class ClienteObjeto {

	public static void main(String[] args) {
		
		ClienteClass cliente = new ClienteClass ("Gabriel", "biell@gmail.com",2324253,1231234444);

		System.out.println(" ---------- CLIENTE ---------");
		cliente.print();
		
		System.out.println("\n\n Mudando CPF e TELEFONE do cliente");
		cliente.setCPF(1999999999);
		cliente.setTelefone(34993390);
		System.out.println("\n ---------- CLIENTE ---------");
		cliente.print();
		cliente.compra();
	}
}
