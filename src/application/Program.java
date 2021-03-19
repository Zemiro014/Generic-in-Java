package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// O "Object" não é superTipo de "List"
		List<Object> myObject = new ArrayList<>();
		List <Integer> myInteger = new ArrayList<>();
		
		myObject = myInteger; // Erro de compilação
		
		
		// O "superTipo" de List é o "?"
		List<?> myObject1 = new ArrayList<>();
		List <Integer> myInteger1 = new ArrayList<>();
		
		myObject1 = myInteger1;

	}

}
