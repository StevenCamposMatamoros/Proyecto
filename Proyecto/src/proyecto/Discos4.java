/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Discos Electrónica
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;

import javax.swing.JOptionPane;

public class Discos4 
{
    private int Precio;
    private String Nombre;
    private String Tipo;

    public int getPrecio() 
    {
        return Precio;
    }

    public void setPrecio(int Precio) 
    {
        this.Precio = Precio;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public String getTipo() 
    {
        return Tipo;
    }

    public void setTipo(String Tipo) 
    {
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
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el disco de electronica que desea:"
             + "\n1.Marshmello"
             + "\n2.Martin Garrix"
             + "\n3.Avicii"
             + "\n4. Salir"));
            
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
