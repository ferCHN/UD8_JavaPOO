package objetos;

public class Password {
	private String password;
	private int longitud;
	
	public Password() {
		this.password = "";
		this.longitud = 8;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.password = generarPassword(longitud); 
		//Se llama al metodo que genera una contrase�a aleatoria 
		//segun la longitud que indique el usuario
	}
	
	// METODO PARA GENERAR CONTRASE�A ALEATORIA
	private String generarPassword(int longitud) {
		String password = "";
		int num;
		
		int min = 32; // 32 caracter ascii con numero mas bajo
		int max = 126; // 126 lo mismo pero numero mas alto
		
		int rango = (max - min) + 1;

		for (int i = 0; i < longitud; i++) {
			num = (int)(Math.random() * rango) + min;
			password += (char)num; //Se hace un cast de int a char para coger el valor ASCII y se suma al String password
		}
		
		return password;
	}

	@Override
	public String toString() {
		return "Password: [" + password + "] - longitud=" + longitud + "]";
	}
}
