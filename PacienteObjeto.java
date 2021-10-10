package JavaClass;

public class PacienteObjeto {

	public static void main(String[] args) {
		
		PacienteClass pac = new PacienteClass("Gabriel Mendes",19,"Gripe");
		
		System.out.print("\n ------------------------------------");
		pac.print();
		System.out.print("\n ------------------------------------");
		pac.remedio();
		
	}
}
