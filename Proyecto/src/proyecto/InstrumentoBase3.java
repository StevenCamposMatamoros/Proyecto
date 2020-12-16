/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Instrumentos de Percusión
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package diagramametodo;

import javax.swing.JOptionPane;


public class InstrumentoBase3 
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

    public void setNombre(String Nombre) {
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
    
     public  InstrumentoBase3(int Precio,String Nombre,String Tipo)
    {
        this.Precio=Precio;
        this.Nombre=Nombre;
        this.Tipo=Tipo;
    }
        
      public void Pregunta()
      {
           int opcion1=0;
            InstrumentoBase3 Percusion[]=new InstrumentoBase3[3];
           do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el instrumento de percusiom que desea:"
             + "\n1.Bombo"
             + "\n2.Platillos Dobles\n"
             + "\n3.Cajon"
             + "\n4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                 Percusion[0]=new InstrumentoBase3(140,"Bombo","Percusion");
                  break;
              case 2:
                  Percusion[1]=new InstrumentoBase3(200,"Platillos Dobles","Percusion");
                  break;
              case 3:
                 Percusion[2]=new InstrumentoBase3(80,"Cajon","Percusion");
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
