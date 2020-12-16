
package diagramametodo;

import javax.swing.JOptionPane;


public class Discos2 {
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
    
     public  Discos2(int Precio,String Nombre,String Tipo)
    {
        this.Precio=Precio;
        this.Nombre=Nombre;
        this.Tipo=Tipo;
    }
        
      public void Pregunta()
      {
           int opcion1=0;
            Discos2 Dis2[]=new Discos2[3];
           do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el disco de bachata que desea:\n"
             + "1.Prince Royce\n"
             + "2.Romeo Santos\n"
             + "3.Aventura\n"
                    + "4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                 Dis2[0]=new Discos2(100,"Marc Anthony","Bachata");
                  break;
              case 2:
                  Dis2[1]=new Discos2(120,"Romeo Santos","Bachata");
                  break;
              case 3:
                 Dis2[2]=new Discos2(80,"Aventura","Bachata");
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
