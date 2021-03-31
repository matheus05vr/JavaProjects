package objeto;

public class Jantar {
	public static void main(String[] args) {
				
		var comida1 = new Comida("Arroz",0.2);
		var comida2 = new Comida("Feijão",0.1);
		var comida3 = new Comida("Carne",0.15);
		
		var pessoa1 = new Pessoa("Maria",55);
		var pessoa2 = new Pessoa("João",65);
		
		pessoa1.comer(comida1);
		pessoa1.comer(comida2);
		pessoa1.comer(comida3);
		
		pessoa2.comer(comida1);
		pessoa2.comer(comida2);
		pessoa2.comer(comida3);
		
		System.out.printf("Peso antes de comer: %.2f\n", pessoa1.peso);
		System.out.printf("Peso depois de comer: %.2f\n\n", pessoa1.pesoTotal);	
		
		System.out.printf("Peso antes de comer: %.2f\n", pessoa2.peso);
		System.out.printf("Peso depois de comer: %.2f\n", pessoa2.pesoTotal);
		
	}

}
