package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: \n");
		String salario1 = entrada.nextLine();
		
		System.out.print("Digite o segundo salário: \n");
		String salario2 = entrada.nextLine();
		
		System.out.print("Digite o terceiro salário: \n");
		String salario3 = entrada.nextLine();
		
		String salario1f = salario1.replace(",", ".");
		String salario2f = salario2.replace(",", ".");
		String salario3f = salario3.replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1f);
		double sal2 = Double.parseDouble(salario2f);
		double sal3 = Double.parseDouble(salario3f);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("A média dos 3 salários é: %f \n" ,media);	
		
		entrada.close();
				
		
	}

}
