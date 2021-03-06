package co.edu.uniquindio.model;

public class Producto {
	
	private String codigo;
	private String tipoProducto;
	private String nombre;
	private Double precio;
	private Sede sede;
	private Administrador admin;
	private int cantidad;
	
	Producto(){
		
	}

	public Producto(String codigo, String tipoProducto, String nombre, Double precio, Sede sede, Administrador admin,
			int cantidad) {
		this.codigo = codigo;
		this.tipoProducto = tipoProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.sede = sede;
		this.admin = admin;
		this.cantidad = cantidad;
	}


	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Sede getSede() {
		return sede;
	}
	public void setSede(Sede sede) {
		this.sede = sede;
	}
	public Administrador getAdmin() {
		return admin;
	}
	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", tipoProducto=" + tipoProducto + ", nombre=" + nombre + ", precio="
				+ precio + ", sede=" + sede + ", admin=" + admin + ", cantidad=" + cantidad + ", getCodigo()="
				+ getCodigo() + ", getTipoProducto()=" + getTipoProducto() + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getSede()=" + getSede() + ", getAdmin()=" + getAdmin()
				+ ", getCantidad()=" + getCantidad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
