package Mundo;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgendaTelefonica agendaTelefonica = new AgendaTelefonica();
		int opc;
		
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción \n"
					+"1. AgregarContacto \n"
					+"2. MostrarContactos \n"
					+"3. BuscarContacto \n"
					+"4. EliminarContacto \n"
					+"5. Contador numContactos \n"
					+"0. Salir"));
			
			switch (opc) {
			case 1: {
				agendaTelefonica.agregarContacto();
				break;
			}
			
			case 2:{
				agendaTelefonica.mostrarContactos();
				break;
			}
			
			case 3: {	
				
				Contacto contacto = agendaTelefonica.buscarContacto("pedro");
				
				if(contacto == null) {
					System.out.println("No existe el contacto");
				}
				
				else {
					System.out.println("Contacto encontrado: "+contacto);
				}
				break;
			}
			
			case 4: {
				boolean contacto = agendaTelefonica.eliminarContacto("pedro");
				
				if (contacto==true) {
					System.out.println("No existe el contacto");
				} else {
					System.out.println("Contacto eliminado");
				}
				
				break;
			}
			
			case 5: {
				int can = agendaTelefonica.cantidad();
				System.out.println("Cantidad Array: "+can);
				break;
			}
			
			default:
				break;
			}
			
		} while (opc!=0);
		
	}

}
