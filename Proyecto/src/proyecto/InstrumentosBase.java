/*

 */
package diagramametodo;

import javax.swing.JOptionPane;

public class InstrumentosBase 
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
    
    public  InstrumentosBase(int Precio,String Nombre,String Tipo)
    {
        this.Precio=Precio;
        this.Nombre=Nombre;
        this.Tipo=Tipo;
    }
        
      public void Pregunta()
      {
          InstrumentosBase Viento[]=new InstrumentosBase[3];
           int opcion1=0;
           do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el instrumento de viento que desea:\n"
             + "1.Flatua Dulce\n"
             + "2.Saxofon\n"
             + "3.Trompeta\n"
                    + "4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                  Viento[0]=new InstrumentosBase(50,"Flauta Dulce","Viento");
                
                  break;
              case 2:
                 Viento[1]=new InstrumentosBase(300,"Saxofon","Viento");
                  break;
              case 3:
                 Viento[0]=new InstrumentosBase(150,"Trompeta","Viento");
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
    

