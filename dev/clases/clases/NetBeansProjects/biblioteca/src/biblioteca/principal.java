/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class principal {
   private Biblioteca bi;
    
    public static void main(String [] args)
   {
       MenuPrincipal mp = new MenuPrincipal();

}

    public  class MenuPrincipal {

        public MenuPrincipal() {
        }
        menu();
    }
    public void menu()
   {
       int numEdit = Integer.parseInt(JOptionPane.showInputDialog("Cuantas editoriales quiere: "));
       
       bi = new Biblioteca(numEdit);
       String n, t, is, c, ne;
       int opc, i, j, np, na;
       float vr;
       Editorial ed= null;
       Autor a, aa[];
       Nacionalidad nac[];
       
       do
       {
           opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n  1. Ingresar Editoriales "
                   + "\n  2. Ingresar Autores \n  3. Ingresar Libros \n  4. Listar Editoriales \n  "
                   + "5. Listar Autores \n  6. Listar Libros \n  7. Salir "));
           
           switch (opc)
           {
               case 1: c = JOptionPane.showInputDialog("Ingrese el codigo de la editorial: ");
                       n = JOptionPane.showInputDialog("Ingrese el nombre de la editorial: ");
                       bi.setEdit(c, n);
                       JOptionPane.showMessageDialog(null,"Editorial creada");
                       break;
                       
               case 2: n = JOptionPane.showInputDialog("Ingrese el nombre del autor: ");
                       Nacionalidad nacional = (Nacionalidad)JOptionPane.showInputDialog(null, "Seleccione nacionalidad: ", "titulo", JOptionPane.QUESTION_MESSAGE, null, Nacionalidad.values(), "?");
                       
                       bi.setAut(n, nacional);
                       JOptionPane.showMessageDialog(null,"Autor creado");
                       break;    
                       
               case 3: is = JOptionPane.showInputDialog("Ingrese el isbn: ");
                       t = JOptionPane.showInputDialog("Ingrese el Titulo: "); 
                       np = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de paginas del libro: "));
                       vr = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor: "));
                       c = JOptionPane.showInputDialog("Ingrese el codigo de la editorial: ");
                       boolean encontrado = false;
                       for(i=0;i<bi.getEdit().length && encontrado == false;i++)
                       {
                           if (c.equals(bi.getEdit()[i].getCodigo()))
                           {
                               ed = bi.getEdit()[i];
                               encontrado = true;
                           }
                           
                       }
                       na = Integer.parseInt(JOptionPane.showInputDialog("Cuantos autores tiene el libro: "));
                       aa = new Autor[na];
                       
                       for(i=0;i<aa.length;i++)
                       {
                           encontrado = false;
                           
                           n=(String)JOptionPane.showInputDialog(null, "Seleccione autor: ", "titulo", JOptionPane.QUESTION_MESSAGE, null, bi.getNombresAutores(), "?");
                           
                           for(j=0;j<bi.getAut().length && encontrado == false;j++)
                           {
                              if (n.equals(bi.getAut()[j].getNombre()))
                              {
                                aa[i] = bi.getAut()[j];
                                encontrado = true;
                              }
                           }
                       }
                       bi.setLib(is, t, np, vr, ed, aa);
                       JOptionPane.showMessageDialog(null,"Libro creado");
                       break;
                       
               case 4: String listedi="";
                       for(i=0;i<bi.getContEd();i++)
                       {
                           listedi += bi.getEdit()[i].getCodigo() + "  " + bi.getEdit()[i].getNombre() + "\n";
                       }
                       JOptionPane.showMessageDialog(null, listedi);
                   
                       break;
               
               case 5: String listau="";
                       for(i=0;i<bi.getContAu();i++)
                       {
                           listau += bi.getAut()[i].getNombre() + "  " + bi.getAut()[i].getNac() + "\n";
                       }
                       JOptionPane.showMessageDialog(null, listau);
                       break;
                       
                       
               case 6: String lisli="";
                       for(i=0;i<bi.getContLib();i++)
                       {
                           lisli += bi.getLib()[i].getTitulo() + "  " + bi.getLib()[i].getValor() + "\n";
                           for(j=0;j<bi.getLib()[i].getAut().length;j++)
                           {
                              lisli += bi.getLib()[i].getAut()[j].getNombre()+ "\n";
                           }
                           lisli +="\n\n";
                       }
                       JOptionPane.showMessageDialog(null, lisli);
                       break;
                       
               case 7: JOptionPane.showMessageDialog(null, "Cerrando aplicación");
                       break;   
                       
               default: JOptionPane.showMessageDialog(null, "Opción incorrecta");
                       break;         
           }                   
       }
       while(opc!=7);
   }
   
}


