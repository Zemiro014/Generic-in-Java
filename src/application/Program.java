package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		// Trabalhando com conjuntos: Uni�o, intercess�o e diferen�a
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		//union: adicionar ao conjunto "c" aqueles elementos do conjunto "a" que n�o existem no conjunto "c"
		c.addAll(b);
		System.out.println(c);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		//intersection: reter ao conjunto "d" s� aqueles elementos do conjunto que combinam com algum elemento do conjunto "b"
		d.retainAll(b);
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		//intersection: remover do conjunto "e" aqueles elementos do conjunto que n�o possuem combina��o com algum elemento do conjunto "b"
		e.removeAll(b);
		System.out.println(e);
	}
}
