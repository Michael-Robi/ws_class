package co.edu.uniquindio.model;

public class Venta {
	
	private String codigoVenta;
	
	private Producto producto;
	private String tipoPorducto;
	private Sede sede;
	private String departamento;
	private Cliente cliente;
	private int cantidad;
	
	public Venta(String tipoProducto, String departamento,int cantidad,Producto producto,Cliente cliente, String codigoVenta, Sede sede){
	
		this.cantidad = cantidad;
		this.cliente=cliente;
		this.codigoVenta= codigoVenta;
		this.departamento= departamento;
		this.producto= producto;
		this.sede= sede;
		
	}

	public String getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(String codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getTipoPorducto() {
		return tipoPorducto;
	}

	public void setTipoPorducto(String tipoPorducto) {
		this.tipoPorducto = tipoPorducto;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Venta [codigoVenta=" + codigoVenta + ", producto=" + producto + ", tipoPorducto=" + tipoPorducto
				+ ", sede=" + sede + ", departamento=" + departamento + ", cliente=" + cliente + ", cantidad="
				+ cantidad + "]";
	}
	
}
