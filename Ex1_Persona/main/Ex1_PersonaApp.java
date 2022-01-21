package main;

import objetos.Persona;

public class Ex1_PersonaApp {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Fernando", 21, 'H');
		Persona persona3 = new Persona("Fernando", 21,"3456783M", 'H', 1.80, 70);
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());

	}

}
