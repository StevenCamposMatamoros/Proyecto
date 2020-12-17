/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Instrumentos
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;



public class InstrumentosBase 
{

    //Atributos
    private int Precio;
    private String Nombre;
    private String Tipo;
    
    //Setters y Getters
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

    public void setNombre(String Nombre) 
    {
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
    
   //Metodo Constructor
    public  InstrumentosBase(int Precio,String Nombre,String Tipo)
    {
        this.Precio=Precio;
        this.Nombre=Nombre;
        this.Tipo=Tipo;
        
        
    }
    
}
    

