package objetos;

public class Persona {
	private final char SEXO = 'H';

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double altura;
	private double peso;

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = SEXO;
		this.altura = 0.0;
		this.peso = 0.0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.altura = 0.0;
		this.peso = 0.0;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, String dni, char sexo, double altura, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona: nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo
				+ ", altura=" + altura + ", peso=" + peso + "]";
	}
}
