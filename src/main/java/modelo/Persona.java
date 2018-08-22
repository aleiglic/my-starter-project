package modelo;

public class Persona {
	private Integer dni;
	private String nombre;
	
	public Persona() {
		
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return this.getDni() + " - " + this.getNombre();
	}
}
