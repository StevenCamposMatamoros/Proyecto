/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Discos Salsa
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;

import javax.swing.JOptionPane;


public class Discos 
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
    
     public  Discos(int Precio,String Nombre,String Tipo)
    {
        this.Precio=Precio;
        this.Nombre=Nombre;
        this.Tipo=Tipo;
    }
        
      public void Pregunta()
      {
           int opcion1=0;
            Discos Dis[]=new Discos[3];
           do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el disco de salsa que desea:\n"
             + "1.Marc Anthony\n"
             + "2.Willie Colon\n"
             + "3.Celia Cruz\n"
                    + "4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                 Dis[0]=new Discos(40,"Marc Anthony","Salsa");
                  break;
              case 2:
                  Dis[1]=new Discos(20,"Willie Colon","Salsa");
                  break;
              case 3:
                 Dis[2]=new Discos(80,"Celia Cruz","Salsa");
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
