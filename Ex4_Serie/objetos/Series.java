package objetos;

public class Series {
	private final int TEMPORADAS = 3;
	private final boolean ENTREGADO = false;

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Series() {
		this.titulo = "";
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}

	public Series(String titulo, String creador) {
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.titulo = titulo;
		this.creador = creador;
		this.genero = "";

	}

	public Series(String titulo, int temporadas, String genero, String creador) {
		this.entregado = ENTREGADO;
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Series: titulo=" + titulo + ", temporadas="
				+ temporadas + ", entregado=" + entregado + ", genero=" + 
				genero + ", creador=" + creador + "]";
	}
}
