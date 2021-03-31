package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double CONST = 5.0/9.0;
		double tempFahrenheit = 20;
		double resultado;
		resultado = (tempFahrenheit - 32.0) * CONST;
		System.out.println(resultado);
		
	}

}
