package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		
		/*
		 * Set<T> é uma interface genérica para estrutura de dados. Ela possui 3 implementações: 
 * 																						HashSet(mais rápido "O(1)" mas não ordena os elementos);
 * 																						TreeSet(menos rápido que o HashSet, mas ordena os elementos);
 * 																						LinkedHashSet (menos rápido retorno os elementos do jeito que foram colocado)
 * 
 *  Set<T> é uma estrutura que armazena elementos do tipo T sem posições.  Não permite buscar elementos por índices
		 */ 
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Tik Tok");
		set.add("Ta");
		set.add("Pa");
		
		//Algumas Operações
		set.remove("Tablet"); // Remove o elemento Tablet da estrutura de dados
		set.removeIf(x -> x.length() >= 3); // Remove os elementos que satisfazem as condições especificados
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
		System.out.println(p);
		}
	}
}
