package DTO;
public class DTOPagos{

	private int cantidad;
	private String sDescripcion;
	private float fUnitario;
	private float fImporte;

	
	public DTOPagos(int cantidad, String sDescripcion, float fUnitario, float fImporte) {
		
		this.cantidad = cantidad;
		this.sDescripcion = sDescripcion;
		this.fUnitario = fUnitario;
		this.fImporte = fImporte;
		
	}


	public int getCantidad() {
		return cantidad;
	}


	public String getsDescripcion() {
		return sDescripcion;
	}


	public float getfUnitario() {
		return fUnitario;
	}


	public float getfImporte() {
		return fImporte;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public void setsDescripcion(String sDescripcion) {
		this.sDescripcion = sDescripcion;
	}


	public void setfUnitario(float fUnitario) {
		this.fUnitario = fUnitario;
	}


	public void setfImporte(float fImporte) {
		this.fImporte = fImporte;
	}


	
}