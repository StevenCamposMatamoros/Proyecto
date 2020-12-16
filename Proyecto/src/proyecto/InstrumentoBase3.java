/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramametodo;

import javax.swing.JOptionPane;


public class InstrumentoBase3 
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
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el instrumento de percusiom que desea:\n"
             + "1.Bombo\n"
             + "2.Platillos Dobles\n"
             + "3.Cajon\n"
                    + "4. Salir"));
            
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
