package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		
		Float f = 123F;
		Boolean bol = Boolean.parseBoolean("true");
		Double d = 123.547; 
		
		System.out.println(bol);
	}

}
