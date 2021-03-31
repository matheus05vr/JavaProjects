package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String example = "Bom dia X"
				.replace("X", "Matheus")
				.toUpperCase()
				.concat("!");
		
		System.out.println(example);
	}
	
}
