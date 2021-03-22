package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		
		/*
		 * Set<T> � uma interface gen�rica para estrutura de dados. Ela possui 3 implementa��es: 
 * 																						HashSet(mais r�pido "O(1)" mas n�o ordena os elementos);
 * 																						TreeSet(menos r�pido que o HashSet, mas ordena os elementos);
 * 																						LinkedHashSet (menos r�pido retorno os elementos do jeito que foram colocado)
 * 
 *  Set<T> � uma estrutura que armazena elementos do tipo T sem posi��es.  N�o permite buscar elementos por �ndices
		 */ 
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Tik Tok");
		set.add("Ta");
		set.add("Pa");
		
		//Algumas Opera��es
		set.remove("Tablet"); // Remove o elemento Tablet da estrutura de dados
		set.removeIf(x -> x.length() >= 3); // Remove os elementos que satisfazem as condi��es especificados
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
		System.out.println(p);
		}
	}
}
