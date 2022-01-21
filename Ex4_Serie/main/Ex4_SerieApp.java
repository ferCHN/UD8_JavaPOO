package main;

import objetos.Series;

public class Ex4_SerieApp {

	public static void main(String[] args) {
		Series serie1 = new Series();
		Series serie2 = new Series("Breaking Bad", " Vince Gilligan");
		Series serie3 = new Series("Breaking Bad", 5, "Drama", " Vince Gilligan");
		
		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());

	}

}
