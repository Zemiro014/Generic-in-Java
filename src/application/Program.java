package application;

import java.util.HashMap;
import java.util.Map;

import entity.Product;

public class Program {

	public static void main(String[] args) {

		/*
		 * Map<K, V>: � uma cole��o de dados gen�rico baseado em pares Chave(K) / Valor(V)
		 * 
		 * N�o admite repeti��es do objeto chave.
		 * Os elementos s�o indexados pelo objeto chave (n�o possuem posi��o).
		 * Acesso, inser��o e remo��o de elementos s�o r�pidos
		 * 
		 * Uso comum: cookies, local storage, qualquer modelo chave-valor
		 * 
		 * 
		 * Principais implementa��es:
				� HashMap - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
				� TreeMap - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado pelo
				compareTo do objeto (ou Comparator)
				� LinkedHashMap - velocidade intermedi�ria e elementos na ordem em que s�o adicionados
		 * */
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		/*
		 * O containsKey s� compara os valores de 2 objectos se na class de conjunto (Product) for implementado o 'HashCode Equals', caso contr�rio far� a compara��o por refer�ncia de ponteiro
		 * */ 
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps)); 
	}
}
