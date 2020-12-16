/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Discos Reggaetón
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */

package proyecto;

import javax.swing.JOptionPane;


public class Discos3 
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
    
     public  Discos3(int Precio,String Nombre,String Tipo)
    {
        this.Precio=Precio;
        this.Nombre=Nombre;
        this.Tipo=Tipo;
    }
        
      public void Pregunta()
      {
           int opcion1=0;
            Discos3 Dis3[]=new Discos3[3];
           do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el disco de reggueton que desea:\n"
             + "1.Bad Bunny\n"
             + "2.Ozuna\n"
             + "3.Anuel\n"
                    + "4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                 Dis3[0]=new Discos3(140,"Bad Bunny","reggueton");
                  break;
              case 2:
                  Dis3[1]=new Discos3(120,"Ozuna","reggueton");
                  break;
              case 3:
                 Dis3[2]=new Discos3(100,"Anuel","reggueton");
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
