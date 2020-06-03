package statics;

public class Vehiculo {
	private String matricula;
	
	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String toString() {
		return matricula;
	}
}
