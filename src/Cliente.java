
public class Cliente {
	private String nombre;
	private Integer dni;
	private boolean isMujer;
	
	
	public Cliente(String nombre, Integer dni, boolean isMujer) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.isMujer = isMujer;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public boolean isMujer() {
		return isMujer;
	}


	public void setMujer(boolean isMujer) {
		this.isMujer = isMujer;
	}


	@Override
	public String toString() {
		String sexo= this.isMujer? "mujer": "Hombre"; 
		return "Cliente [nombre= " + nombre + ", dni= " + dni + ", sexo= " + sexo + "]";
	}
	
	
	


}
