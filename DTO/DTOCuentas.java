package DTO;

public class DTOCuentas {

	private String sCuenta;
	private String sDescripcion;
	private String sTipo;

	
	public DTOCuentas () {
		
	}

	public DTOCuentas (String sCuenta, String sDescripcion, String sTipo) {

		this.sCuenta = sCuenta;
		this.sDescripcion = sDescripcion;
		this.sTipo = sTipo;
		
	}

	public void setCuenta(String sCuenta) {
			
		this.sCuenta = sCuenta;

	}

	public void setDescripcion(String sDescripcion){

		this.sDescripcion = sDescripcion;

	}

	public void setTipo(String sTipo){

		this.sTipo = sTipo;

	}

	public String getCuenta () {
		
		return sCuenta;

	}

	public String sDescripcion (){

		return sDescripcion;

	}

	public String sTipo (){

		return sTipo;

	}
	
	
}