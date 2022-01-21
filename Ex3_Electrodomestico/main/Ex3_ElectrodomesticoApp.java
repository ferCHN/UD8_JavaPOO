package main;

import objetos.Electrodomesticos;

public class Ex3_ElectrodomesticoApp {

	public static void main(String[] args) {
		Electrodomesticos elec1 = new Electrodomesticos();
		Electrodomesticos elec2 = new Electrodomesticos(300, 16.8);
		Electrodomesticos elec3 = new Electrodomesticos(400, "azul", 'A', 20.5);
		Electrodomesticos elec4 = new Electrodomesticos(500, "negro", 'A', 20.5);
		
		System.out.println(elec1.toString());
		System.out.println(elec2.toString());
		System.out.println(elec3.toString());
		System.out.println(elec4.toString());

	}

}
