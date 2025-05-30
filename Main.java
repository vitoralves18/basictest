package entities;

public class Main {

	public static void main(String[] args) {
		
		Computer c1 = new Computer ();
		
		c1.modelo = "BetaInf";
		c1.heartz = 144;
		c1.camera = false;
		c1.teclado = "Multilaser";
		
		c1.testeCam();
		
		c1.pcInformation();

	}

}
