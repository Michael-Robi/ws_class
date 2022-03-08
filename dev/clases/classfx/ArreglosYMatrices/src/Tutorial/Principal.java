package Tutorial;

import javax.swing.JOptionPane;

public class Principal {

    static Producto[] productos;
    static int n, m;

    public static void main(String args[]) {

        cargar();

        menu();
    }

    public static void cargar() {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de productos"));
        m = 3;
        productos = new Producto[n];

        for (int i = 0; i < n; i++) {
            JOptionPane.showMessageDialog(null, "Ingrese la información del producto " + (i+1) + ":");

            int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código del producto:"));

            String nombre = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nombre del producto:"));
            double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto:"));

            Producto nuevoProducto = new Producto(codigo, nombre, precio);

            productos[i] = nuevoProducto;
            
        }
        
        for (int i = 0; i < n; i++) {
            
             Producto p = new Producto();

            p = productos[i];
            
            System.out.print("Producto: " + p.getCodigo() + " " + p.getNombre() + " " + p.getPrecio());
        
        }
    }

    public static void menu() {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu: 1.Consultar 2. Actualizar"));

        if (n == 1) {
            consultar();
            
        } else if (n == 2) {
            actualizar();
        }
        
        menu();
    }

    public static void consultar() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a consultar:");

        for (int i = 0; i < n; i++) {

            Producto p = new Producto();

            p = productos[i];

            if (p.getNombre().equals(nombre)){

                JOptionPane.showMessageDialog(null, "Producto: " + p.getCodigo() + " " + p.getNombre() + " " + p.getPrecio());
                break;
            }else if(i==n-1){
                JOptionPane.showMessageDialog(null, "El Producto consultado no existe");
            }

        }
    }

    public static void actualizar() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del productoa a actualizar:");

        for (int i = 0; i < n; i++) {

            Producto p = new Producto();

            p = productos[i];

            if (p.getNombre().equals(nombre)){
                
                JOptionPane.showMessageDialog(null, "Va a actaulizar el producto " + p.getNombre() + ":");

            int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo código del producto:"));

            String pnombre = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del producto:"));
            
            double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio del producto:"));

            Producto nuevoProducto = new Producto(codigo, pnombre, precio);

            productos[i] = nuevoProducto;
            
            break;

                
            }else if(i==n-1){
                JOptionPane.showMessageDialog(null, "El Producto a actualizar no existe");
            }
            
        }
    }
}

