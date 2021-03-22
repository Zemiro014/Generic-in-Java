package application;

import java.util.Set;
import java.util.TreeSet;

import entity.Product02;

public class Program {

	public static void main(String[] args) {

		/*
		 * Como a implementa��o TreeSet<>() do conjunto Set<T> faz a compara��o dos
		 * elementos?
		 * 
		 * Se na class "Product02" tiver declarado o m�todo "CompareTo", ent�o o
		 * TreeSet<>() far� a compa��o com base a l�gica implementado no m�todo "compareTo". Mas se n�o for
		 * implementado, ele lan�ar� um ClassCastException
		 * 
		 * Para que o TreeSet<>() consiga ordenar os seus objectos, � preciso que a class do conjunto (Product02) implemente o Comparable
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
