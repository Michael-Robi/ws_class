package Tutorial;

public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    
    public Producto(){
        
        this.codigo=0;
        this.nombre="";
        this.precio= 0.0;
    }

    public Producto(int pcodigo, String pnombre, double pprecio) {
        
        this.codigo=pcodigo;
        this.nombre=pnombre;
        this.precio= pprecio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}