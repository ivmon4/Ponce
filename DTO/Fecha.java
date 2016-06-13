package DTO;

public class Fecha {

	private int eDia, eMes, eAnio;

	public Fecha(){
		eDia = 0;
		eMes = 0;
		eAnio = 0;
	}

	public Fecha(int eDia, int eMes, int eAnio){
		this.eDia = eDia;
		this.eMes = eMes;
		this.eAnio = eAnio;
	}


	public void setDia(int eDia){
		this.eDia = eDia; //Se refiere al atributo del objeto actual
	}

	public void setMes (int eMes){
		this.eMes = eMes;
	}

	public void setAnio (int eAnio){
		this.eAnio = eAnio;
	}

	public int getDia(){
		return eDia;
	}

	public int getMes(){
		return eMes;
	}
	
	public int getAnio(){
		return eAnio;
	}

	 public String toString() { //Convierte a cadena
		
		return eDia + "/" + eMes + "/" + eAnio;
	}
}
