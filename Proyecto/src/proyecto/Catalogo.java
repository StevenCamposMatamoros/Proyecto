/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Catálogo
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;

import javax.swing.JOptionPane;

public class Catalogo 
{
   //Atributos
   private int precio;
   private String NombreArticulo;


    public String getNombreArticulo() 
    {
        return NombreArticulo;
    }

    public void setNombreArticulo(String NombreArticulo) 
    {
        this.NombreArticulo = NombreArticulo;
    }

    public int getPrecio() 
    {
        return precio;
    }

    public void setPrecio(int precio) 
    {
        this.precio = precio;
    }

   

  
  //Metodos
   
   public void MenuDisco()
   {
       int opcion1;
       do{
           
       opcion1= Integer.parseInt(JOptionPane.showInputDialog("Inserte el genero que quiere\n"
               + "1.Bachata\n"
               + "2.Salsa\n"
               + "3.Reggueton\n"
               + "4.Electronica\n"
               + "5.Salir"));
      
          switch(opcion1)
          {
              case 1:
                  break;
              case 2:
                  break;
              case 3:
                  break;
              case 4:
                  break;
              case 5:
                  JOptionPane.showMessageDialog(null, "Muchas Gracias por su preferencia");
                  break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion valida");
                 break;
          }
          
      }while(opcion1!=5);
      
      
   }
      
    public void MenuInstrumentos()
    {
        int opcion2;
        do{
            
        opcion2=Integer.parseInt(JOptionPane.showInputDialog("Inserte el tipo de instrumento que quiere\n"
                + "1.Viento\n"
                + "2.Cuerda\n"
                + "3.Percusion\n"
                + "4.Salir"));
       
       
           switch(opcion2)
           {
              case 1:
                  break;
              case 2:
                  break;
              case 3:
                  break;
              case 4:
                  JOptionPane.showMessageDialog(null, "Muchas Gracias por su preferencia");
                  break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion valida");
                 break;
           }
           
               
       }while(opcion2!=4);
        
        
    }

    
    
           
}
