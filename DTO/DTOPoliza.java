package DTO;

public class DTOPoliza {

	

	private int eNumPoliza;
	private Fecha fechaPoliza;
	private DTOCliente cliente;
	private String descripcion;
	private DTOPagos pagos[];
	private DTOCuentas cuentas[];
	private float fSubTot;
	private float fIva;
	private float fTotal;
	

	
	



	public DTOPoliza(int eNumPoliza, Fecha fechaPoliza, DTOCliente cliente, String descripcion, DTOPagos[] pagos,
			float fSubTot, float fIva, float fTotal, DTOCuentas[] cuentas) {
		this.eNumPoliza = eNumPoliza;
		this.fechaPoliza = fechaPoliza;
		this.cliente = cliente;
		this.descripcion = descripcion;
		this.pagos = pagos;
		this.fSubTot = fSubTot;
		this.fIva = fIva;
		this.fTotal = fTotal;
		this.cuentas = cuentas;
	}



	public DTOCuentas[] getCuentas() {
		return cuentas;
	}



	public void setCuentas(DTOCuentas[] cuentas) {
		this.cuentas = cuentas;
	}



	public float getfSubTot() {
		return fSubTot;
	}



	public float getfIva() {
		return fIva;
	}



	public float getfTotal() {
		return fTotal;
	}



	public void setfSubTot(float fSubTot) {
		this.fSubTot = fSubTot;
	}



	public void setfIva(float fIva) {
		this.fIva = fIva;
	}



	public void setfTotal(float fTotal) {
		this.fTotal = fTotal;
	}



	public int geteNumPoliza() {
		return eNumPoliza;
	}



	public Fecha getFechaPoliza() {
		return fechaPoliza;
	}



	public DTOCliente getCliente() {
		return cliente;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public DTOPagos[] getPagos() {
		return pagos;
	}



	public void seteNumPoliza(int eNumPoliza) {
		this.eNumPoliza = eNumPoliza;
	}



	public void setFechaPoliza(Fecha fechaPoliza) {
		this.fechaPoliza = fechaPoliza;
	}



	public void setCliente(DTOCliente cliente) {
		this.cliente = cliente;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public void setPagos(DTOPagos[] pagos) {
		this.pagos = pagos;
	}


	
}