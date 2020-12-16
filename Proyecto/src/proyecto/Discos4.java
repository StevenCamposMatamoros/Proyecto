/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramametodo;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Discos4 {
    private int Precio;
    private String Nombre;
    private String Tipo;

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
     public  Discos4(int Precio,String Nombre,String Tipo)
    {
        this.Precio=Precio;
        this.Nombre=Nombre;
        this.Tipo=Tipo;
    }
        
      public void Pregunta()
      {
           int opcion1=0;
            Discos4 Dis4[]=new Discos4[3];
           do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el disco de electronica que desea:\n"
             + "1.Marshmellow\n"
             + "2.Martin Garrix\n"
             + "3.Avicii\n"
                    + "4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                 Dis4[0]=new Discos4(70,"Marshmellow","electronica");
                  break;
              case 2:
                  Dis4[1]=new Discos4(60,"Martin Garrix","electronica");
                  break;
              case 3:
                 Dis4[2]=new Discos4(55,"Avicii","electronica");
                  break;
              case 4:
                   JOptionPane.showMessageDialog(null, "Muchas Gracias" );
                   break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion correcta");
                 break;
          }
       }while(opcion1!=4);
      }           
}
