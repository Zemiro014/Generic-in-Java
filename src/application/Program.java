package application;

import java.util.Map;
import java.util.TreeMap;

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
