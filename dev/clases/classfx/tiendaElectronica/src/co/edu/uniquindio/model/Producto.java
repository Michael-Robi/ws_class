package co.edu.uniquindio.model;

public class Producto {

	private String tipoProducto;
	private String nombre;
	private String codigo;
	private Double precio;

	public Producto(String producto, String nombre, String codigo, double precio) {
		this.tipoProducto = producto;
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [tipoProducto=" + tipoProducto + ", nombre=" + nombre + ", codigo=" + codigo + ", precio="
				+ precio + "]";
	}

}
