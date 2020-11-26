/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;

import javax.swing.JOptionPane;

public class Proyecto 
{
int opcion;
       //instancia de clases
       Catalogo Menu=new Catalogo();
       
       public void Menu_Catalogo(){
        do
        {
        opcion=Integer.parseInt(JOptionPane.showInputDialog("******Bienvenidos al Catalogo******\n"
               + "Que desearia comprar??\n"
               + "1.Discos\n"
               + "2.Instrumentos\n"
               + "3.Exit\n"));
       
       switch(opcion)
       {
           case 1:
               Menu.MenuDisco();
               break;
           case 2:
               Menu.MenuInstrumentos();
               break;
           case 3:
               JOptionPane.showMessageDialog(null,"Muchas Gracias por su preferencia");
               break;
             default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion correcta");
              break;
             
       }
       }while(opcion!=3);
       }
       
    public static void main(String[] args) 
    {
     Menu Menu1=new Menu();
     Menu1.MenuPrincipal();
    
    }
    
}
