/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Articulos Usados
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;

import javax.swing.JOptionPane;

public class Articulos_Usados 
{
 private String Titulo;
 private String Categoria;
 private int precio;
 int opcion;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
 
 
 
 public void Vender_Articulo()
 {
 do{    
 Titulo=JOptionPane.showInputDialog("Digite el nombre del articulo que desea vender:");
 precio=Integer.parseInt(JOptionPane.showInputDialog("Digite el precio en el que desea vender el articulo:"));
 opcion=Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion para la categoria del ariculo a vender:"
                                                     +"\n1.Disco"
                                                     +"\n2.Instrumento"));
 
 switch(opcion)
 {
     case 1:
         Categoria="Disco";
     case 2:
         Categoria="Instrumento";
     default:
         JOptionPane.showMessageDialog(null, "Por Favor ingrese una opcion valida");
 }
         
 }while(opcion!=1 && opcion!=2);
 
 JOptionPane.showMessageDialog(null,"Su solicitud sera tramitada:"
                                     +"\n\nArticulo: "+Titulo
                                     +"\nCategoria: "+Categoria
                                     +"\nprecio: $"+precio);
        
 }
 
}
