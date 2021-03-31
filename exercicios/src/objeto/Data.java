package objeto;

public class Data {
	
	String resultado;
	
	Data(){
		resultado = dataFormatada(1, "Janeiro", 1970);
		
	}
	Data(int day, String month, int year){
		resultado = dataFormatada(day, month, year);
	}

	String dataFormatada(Integer day, String month, int year) {
		String result = day.toString().concat(" de ") + month.concat(" de ") + year;
		return result;
	}
}
