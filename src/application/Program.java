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
		List<Shape> myShapes = new ArrayList<>();
		
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: "+ totalArea(myShapes));
	}
	
	// Método que recebe uma lista de Shape assim como qualquer subClass do Shape
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
