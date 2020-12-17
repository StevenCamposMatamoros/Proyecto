/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Menu
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;

import javax.swing.JOptionPane;

public class Menu
{
    private int Opcion;
  
public void MenuPrincipal()
{
    Proyecto cat=new Proyecto();
    Usuario usu1=new Usuario();
    Articulos_Usados usados=new Articulos_Usados("","",0,0);
    Reclamos Rec=new Reclamos();
do
 {
        Opcion=Integer.parseInt(JOptionPane.showInputDialog("******Bienvenido a la Tienda Musical Listen******\n"
               +"\nIngrese la opcion del tramite que desea realizar"
               +"\n1.Ver Catalogo"
               +"\n2.Comprar Articulo"
               +"\n3.Vender Articulo"
               +"\n0.Salir"));
       
       switch(Opcion)
       {
           case 1:
               usu1.ObtenerInformacionUsuario();
               cat.Menu_Catalogo();
               break;
           case 2:               
               usados.Vender_Articulo();
               break;
           case 3:
               Rec.ReclamoP();
               break;
           case 0:
               JOptionPane.showMessageDialog(null,"Gracias por visitar nuestra Tienda");
               break;        
             default:
               JOptionPane.showMessageDialog(null,"Digite una opcion valida");
              break;
             
       }
       }while(Opcion!=0); 
}

 
}
