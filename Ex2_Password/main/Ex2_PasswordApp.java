package main;

import objetos.Password;

public class Ex2_PasswordApp {

	public static void main(String[] args) {
		Password password1 = new Password();
		Password password2 = new Password(5);
		
		System.out.println(password1.toString());
		System.out.println(password2.toString());
	}

}
