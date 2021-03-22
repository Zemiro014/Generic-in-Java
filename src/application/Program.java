package application;

import java.util.HashMap;
import java.util.Map;

import entity.Product;

public class Program {

	public static void main(String[] args) {

		/*
		 * Map<K, V>: é uma coleção de dados genérico baseado em pares Chave(K) / Valor(V)
		 * 
		 * Não admite repetições do objeto chave.
		 * Os elementos são indexados pelo objeto chave (não possuem posição).
		 * Acesso, inserção e remoção de elementos são rápidos
		 * 
		 * Uso comum: cookies, local storage, qualquer modelo chave-valor
		 * 
		 * 
		 * Principais implementações:
				• HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
				• TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
				compareTo do objeto (ou Comparator)
				• LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados
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
		 * O containsKey só compara os valores de 2 objectos se na class de conjunto (Product) for implementado o 'HashCode Equals', caso contrário fará a comparação por referência de ponteiro
		 * */ 
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps)); 
	}
}
