package objeto;

public class Pessoa {
	
	String nome;
	double peso;
	double pesoTotal = 0;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}

	
	void comer(Comida comida){
		
		if(pesoTotal == 0) {
			pesoTotal = comida.peso + peso;		
		}
		else {
			pesoTotal += comida.peso;
		}
		
	}

}
