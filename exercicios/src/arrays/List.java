package arrays;

import java.util.ArrayList;

public class List {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		
		lista.add(new Usuario("Matheus"));
		lista.add(new Usuario("Bia"));
		
		System.out.println(lista.get(0));
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Bia")));
		lista.add(new Usuario("Bia"));
		System.out.println(lista.remove(1));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}
}
