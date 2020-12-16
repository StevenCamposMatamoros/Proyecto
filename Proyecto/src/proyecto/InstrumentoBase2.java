

package diagramametodo;

import javax.swing.JOptionPane;
public class InstrumentoBase2 
{
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
    
    public  InstrumentoBase2(int Precio,String Nombre,String Tipo)
    {
        this.Precio=Precio;
        this.Nombre=Nombre;
        this.Tipo=Tipo;
    }
        
      public void Pregunta()
      {
          InstrumentoBase2 Cuerda[]=new InstrumentoBase2[3];
           int opcion1=0;
           do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el instrumento de cuerda que desea:\n"
             + "1.Guitarra Electrica\n"
             + "2.Ukelele Tenor\n"
             + "3.Guitarra electroacustica\n"
                    + "4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                 Cuerda[0]=new InstrumentoBase2(240,"Guitarra Electrica","Cuerda");
                  break;
              case 2:
                  Cuerda[1]=new InstrumentoBase2(190,"Ukelele Tenor","Cuerda");
                  break;
              case 3:
                 Cuerda[2]=new InstrumentoBase2(380,"Guitarra electroacustica","Cuerda");
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
