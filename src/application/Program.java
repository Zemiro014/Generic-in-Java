package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entity.Client;

// ENtendendo o funcionamento do HashCode e Equals
public class Program {

	public static void main(String[] args) {
		
		Client maria = new Client("Maria", "maria@gmail.com");
		Client alex = new Client("Maria", "maria@gmail.com");
		
		System.out.println(maria.hashCode());
		System.out.println(alex.hashCode());
		
		System.out.println(maria.equals(alex)); // Faz a comparação do conteúdo dos 2 objectos
		System.out.println(maria==alex); // Faz a comparação das referências dos 2 objectos
	}
}
