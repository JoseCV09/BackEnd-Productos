package pe.edu.upeu.sysventas_blue.entity;

public class Rol { 

	private int idrol;
	private String nomrol;
	
	public Rol() {
		super();
	}

	public Rol(int idrol, String nomrol) {
		super();
		this.idrol = idrol;
		this.nomrol = nomrol;
	}

	public int getIdrol() {
		return idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getNomrol() {
		return nomrol;
	}

	public void setNomrol(String nomrol) {
		this.nomrol = nomrol;
	}
	
}

