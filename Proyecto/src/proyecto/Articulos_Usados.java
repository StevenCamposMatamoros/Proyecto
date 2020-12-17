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
 //Atributos
 private String Titulo;
 private String Categoria;
 private int precio;
 private int opcion;
 
   //Metodo Constructor
   public Articulos_Usados(String Titulo, String Categoria, int precio, int opcion) 
    {
        this.Titulo = Titulo;
        this.Categoria = Categoria;
        this.precio = precio;
        this.opcion = opcion;
    }
    
    //Setters y Getters
    public String getTitulo() 
    {
        return Titulo;
    }

    public void setTitulo(String Titulo) 
    {
        this.Titulo = Titulo;
    }

    public String getCategoria() 
    {
        return Categoria;
    }

    public void setCategoria(String Categoria) 
    {
        this.Categoria = Categoria;
    }

    public int getPrecio() 
    {
        return precio;
    }

    public void setPrecio(int precio) 
    {
        this.precio = precio;
    }
 
 
 //Metodo Vender Articulo
 public void Vender_Articulo()
 {
    Titulo=JOptionPane.showInputDialog("Digite el nombre del articulo que desea vender:");
    precio=Integer.parseInt(JOptionPane.showInputDialog("Digite el precio en el que desea vender el articulo:"));
 do{    
 
 opcion=Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion para la categoria del ariculo a vender:"
                                                     +"\n1.Disco"
                                                     +"\n2.Instrumento"));
 
 switch(opcion)
 {
     case 1:
         Categoria="Disco";
     case 2:
         Categoria="Instrumento";
     
 }
         
 }while(opcion!=1 && opcion!=2);
 
 JOptionPane.showMessageDialog(null,"Su solicitud sera tramitada:"
                                     +"\n\nArticulo: "+Titulo
                                     +"\nCategoria: "+Categoria
                                     +"\nprecio: $"+precio);
        
 }
 
}
