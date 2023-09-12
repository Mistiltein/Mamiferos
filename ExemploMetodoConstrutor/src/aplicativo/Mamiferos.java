package aplicativo;

public class Mamiferos {
	
	boolean sangueQuente, vive;
	Mamiferos(){
		sangueQuente = true;
		vive = true;
		System.out.println("Vivendo!");
	}

	void movimento() {
		System.out.println("Procurando Comida...");
	}
	
	public static void main(String[] args) {
		Mamiferos exp = new Mamiferos();

	}

}
