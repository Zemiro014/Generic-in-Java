package application;

import java.util.Set;
import java.util.TreeSet;

import entity.Product02;

public class Program {

	public static void main(String[] args) {

		/*
		 * Como a implementação TreeSet<>() do conjunto Set<T> faz a comparação dos
		 * elementos?
		 * 
		 * Se na class "Product02" tiver declarado o método "CompareTo", então o
		 * TreeSet<>() fará a compação com base a lógica implementado no método "compareTo". Mas se não for
		 * implementado, ele lançará um ClassCastException
		 * 
		 * Para que o TreeSet<>() consiga ordenar os seus objectos, é preciso que a class do conjunto (Product02) implemente o Comparable
		 */

		Set<Product02> set = new TreeSet<>();
		set.add(new Product02("TV", 900.0));
		set.add(new Product02("Notebook", 1200.0));
		set.add(new Product02("Tablet", 400.0));

		for (Product02 p : set) {
			System.out.println(p);
		}
	}
}
