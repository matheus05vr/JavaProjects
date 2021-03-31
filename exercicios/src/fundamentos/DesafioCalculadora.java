package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {

		double resultado = 0;

		String numb1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String numb2 = JOptionPane.showInputDialog("Digite o segundo número");
		String op = JOptionPane.showInputDialog("Digite o operador ( + - * / % )");

		double num1 = Double.parseDouble(numb1);
		double num2 = Double.parseDouble(numb2);

		boolean eMais = "+".equals(op);
		boolean eMenos = "-".equals(op);
		boolean eVezes = "*".equals(op);
		boolean eDividido = "/".equals(op);
		boolean eMod = "%".equals(op);

		resultado = eMais == true ? num1 + num2 : resultado;
		resultado = eMenos == true ? num1 - num2 : resultado;
		resultado = eVezes == true ? num1 * num2 : resultado;
		resultado = eDividido == true ? num1 / num2 : resultado;
		resultado = eMod == true ? num1 % num2 : resultado;

		System.out.println(num1 + op + num2 + "=" + resultado);

	}

}
