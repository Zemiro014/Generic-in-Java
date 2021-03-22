package application;

import java.util.HashSet;
import java.util.Set;

import entity.Product02;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Como o Set<T> faz a compara��o dos elementos?
		 * 
		 * Se na class "Product02" tiver declarado os m�todos HashCode Equals, ent�o o Set<T> far� a compa��o com base o HasCode Equals do Product02.
		 * Mas se n�o for implementado, ele far� a compara��o por refer�ncia das instancias
		 * 
		 * 
		 * */ 

		Set<Product02> set = new HashSet<>();
		set.add(new Product02("TV", 900.0));
		set.add(new Product02("Notebook", 1200.0));
		set.add(new Product02("Tablet", 400.0));
		Product02 prod = new Product02("Notebook", 1200.0);
		System.out.println(set.contains(prod));
	}
}
