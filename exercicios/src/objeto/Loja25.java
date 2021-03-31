package objeto;

public class Loja25 {
	public static void main(String[] args) {
		
		Produto product1 = new Produto("Caneta",1);
		Produto product2 = new Produto("Lapis",0.7);
		Produto product3 = new Produto("Caneca",10);
		Produto product4 = new Produto("Carteira",20);
		
		System.out.printf("Produto1: %s / Preço1: %.2f \n",product1.nome,product1.precoComDesconto());
		System.out.printf("Produto2: %s / Preço2: %.2f \n",product2.nome,product2.precoComDesconto());
		System.out.printf("Produto3: %s / Preço3: %.2f \n",product3.nome,product3.precoComDesconto());
		System.out.printf("Produto4: %s / Preço4: %.2f \n \n",product4.nome,product4.precoComDesconto());
		
		Produto.desconto = 0.5;
		
		System.out.printf("Produto1: %s / Preço1: %.2f \n",product1.nome,product1.precoComDesconto());
		System.out.printf("Produto2: %s / Preço2: %.2f \n",product2.nome,product2.precoComDesconto());
		System.out.printf("Produto3: %s / Preço3: %.2f \n",product3.nome,product3.precoComDesconto());
		System.out.printf("Produto4: %s / Preço4: %.2f \n",product4.nome,product4.precoComDesconto());
	}	
	
}
