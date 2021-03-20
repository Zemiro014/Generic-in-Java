package application;

import java.util.ArrayList;
import java.util.List;

import entity.Circle;
import entity.Rectangle;
import entity.Shape;

// Usando curinga delimitado
public class Program {
	public static void main(String[] args) 
	{
		// Covari�ncia: Permite obter elementos de uma lista mas n�o permite adicionar elemento a ele.
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		Number x = list.get(0);
		list.add(20); // Erro de compila��o
		
		// Contravari�ncia: Permite adicionar elementos de uma lista mas n�o permite obter os elementos dela.
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		Number x = myNums.get(0); // Erro de compila��o
	}
	
}
