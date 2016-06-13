package DTO;

public class DTOCierres {
	
	private int eAnio;
	private int eMes;
	private int eEstado;

	public DTOCierres () {
		
	}

	public DTOCierres(int eAnio, int eMes, int eEstado) {
		
		this.eAnio = eAnio;
		this.eMes = eMes;
		this.eEstado = eEstado;
	}


	public void setAnio (int eAnio) {
		
		this.eAnio = eAnio;
	}

	public void setMes (int eMes) {
		
		this.eMes = eMes;
	}

	public void setEstado (int eEstado) {
		
		this.eEstado = eEstado;
	}

	public int getAnio () {
		
		return eAnio;
	}

	public int getMes () {
		
		return eMes;
	}

	public int getEstado () {
		
		return eEstado;
	}


}