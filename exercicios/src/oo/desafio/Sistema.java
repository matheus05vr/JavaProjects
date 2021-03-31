package oo.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Compra  compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000), 1);
		
		Cliente cliente1 = new Cliente("Maria Julia Moraes");
		cliente1.adicionarCompra(compra1); //jeito diferente MATHEUS/PP
		cliente1.compras.add(compra2);
		
		System.out.println(cliente1.obterValorTotal());
	
		
	}

}
