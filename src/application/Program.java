package application;

import java.util.Map;
import java.util.TreeMap;

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
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		cookies.remove("email");
		cookies.put("phone", "99771133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); // Verificando se o Map contem a chave 'phone"
		System.out.println("Phone number: " + cookies.get("phone")); // pegando o valor da chave 'phone'
		System.out.println("Email: " + cookies.get("email")); // pegando o valor da chave 'email'
		System.out.println("Size: " + cookies.size()); // pegando o tamanho do Map cookies
		
		System.out.println("ALL COOKIES:");
		
		for (String key : cookies.keySet()) { // Listando todos os valores do cookies
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
