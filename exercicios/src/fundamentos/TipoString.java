package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		String name = "Matheus";
		
		System.out.println(name.charAt(1));
		System.out.println(name.startsWith("M"));
		System.out.println(name.length());
		System.out.println(name.equals("Matheus"));
		System.out.println(name.equalsIgnoreCase("MaThEus"));
		
		var nome = "Matheus";
		var sobrenome = "Rodrigues";
		
		System.out.printf("Nome: %s %s \n",nome, sobrenome);
		System.out.println(name.contains("Mat"));
		System.out.println(name.substring(2,6));
		
	}

}
