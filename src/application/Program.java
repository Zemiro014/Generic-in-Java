package application;

import entity.PrintService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciando uma class do tipo GENERIC
		
		PrintService<Integer> p = new PrintService<>();
		
		p.addValue(10);
		p.addValue(20);
		p.addValue(50);
		
		System.out.print("first value -> "+ p.first());
	}

}
