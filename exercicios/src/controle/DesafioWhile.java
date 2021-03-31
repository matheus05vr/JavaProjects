package controle;

import javax.swing.JOptionPane;

public class DesafioWhile {
	
	public static void main(String[] args) {

		String input = "0";
		int counter = 0;
		double total = 0, average = 0;

		while (!input.equals("-1")) {
			
			input = JOptionPane.showInputDialog("Digite uma nota válida");

			double inputDouble = Double.parseDouble(input);
			
			if(inputDouble >=0 && inputDouble <= 10) {
				
				total += inputDouble;
				counter++;
				
			}
		}
		
		average = total / counter;
		
		System.out.println("Total de notas válidas: " + counter);
		System.out.println("Soma das notas válidas: " + total);
		System.out.println("Média das notas válidas: " + average);
	}

}
