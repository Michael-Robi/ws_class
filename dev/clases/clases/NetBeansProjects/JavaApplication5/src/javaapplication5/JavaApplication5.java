/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Home
 */
public class JavaApplication5 {
 private Editorial edit[];
   private Autor aut[];
   private Libro lib[];
   private int contEd, contAu, contLib;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
   
   
   public javaapplication5(int numEdit)
   {
       contEd = 0;
       contAu = 0;
       contLib = 0;
       edit = new Editorial[numEdit];
       aut = new Autor[5];
       lib = new Libro[10];
   }
   
   public void setEdit(String c, String n)
   {
       edit[contEd] = new Editorial(c, n);
       contEd++;
   }
   
   public void setAut(String n, Nacionalidad nac)
   {
       aut[contAu] = new Autor(n, nac);
       contAu++;
   }
   
   public void setLib(String is, String tit, int np, float vr, Editorial e, Autor a[])
   {
       lib[contLib] = new Libro(is, tit, np, vr, e, a);
       contLib++;
   }

    public Editorial[] getEdit() {
        return edit;
    }

    public Autor[] getAut() {
        return aut;
    }

    public Libro[] getLib() {
        return lib;
    }

    public int getContEd() {
        return contEd;
    }

    public int getContAu() {
        return contAu;
    }

    public int getContLib() {
        return contLib;
    }
    
    public String[] getNombresAutores()
    {
        String nombresAutores[] = new String[contAu];
        
        for (int i=0; i<contAu;i++)
        {
            nombresAutores[i] = new String();
            nombresAutores[i] = aut[i].getNombre();
        }
        return nombresAutores;
    }
}


