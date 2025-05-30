package entities;

public class Computer {
	
	String modelo;
	int heartz;
	String teclado;
	Boolean camera;
	
	void ligar () {
		System.out.print("Ligando o pc " + this.modelo);
	}
	
	void desligar () {
		System.out.print("Desligando o pc " + this.modelo);
	}
	
	void testeCam() {
		if (camera == true) {
			System.out.println("A camera está ligada!");
		} else {
			System.out.println("A camera está desligada!");
		}
	}
	
	void marcaTeclado() {
		System.out.print("A marca do teclado é: " + this.teclado);
	}
	
	void qtHeartz() {
		System.out.print("A quantidade de heartz é: " + this.heartz);
	}
	
	void pcInformation() {
		System.out.println("O computador " + 
						this.modelo + " tem " +
						this.heartz + " heartz, usa o teclado " +
						this.teclado + " e a camera está " +
						this.camera);
					
		}
	
}
