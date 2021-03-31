package fundamentos;

import javax.swing.JOptionPane;

public class DesafioTrabalhoLogico {
	public static void main(String[] args) {
		
//		Trabalho na terça (V ou F)
//		Trabalho na quinta (V ou F)
//		Se ambos forem V = comprar tv de 50"
//		Se apenas 1 for V = comprar tv de 32"
//		Se comprar qualquer tv = ir ao shopping tomar sorvete
		
		String trabalhoTerca = JOptionPane.showInputDialog("Houve o trabalho da terça? (S/N)");
		String trabalhoQuinta = JOptionPane.showInputDialog("Houve trabalho na quinta? (S/N)");
		
		char trabT = trabalhoTerca.charAt(0), trabQ = trabalhoQuinta.charAt(0);
		
		
		if(trabT == 'S' ^ trabQ == 'S') {
			System.out.println("TV 32\" e sorvete");
		}
		else if(trabT == 'S' && trabQ == 'S') {
			System.out.println("Tv de 50\" e sorvete");
		}
		else {
			System.out.println("Nada de tv nem sorvete");;
		}
		
		
	}

}
