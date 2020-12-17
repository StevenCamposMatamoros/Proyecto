/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Usuario
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;

import javax.swing.JOptionPane;

public class Usuario 
{
    //Atributos
    private String Nombre;
    private String Apellido;
    private String Direccion;

    //Constructor
    public Usuario(String Nombre, String Apellido, String Direccion) 
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    //Metodo Uusuario
    public void ObtenerInformacionUsuario()
    {
    Nombre=JOptionPane.showInputDialog("Ingrese su nombre:");
    Apellido=JOptionPane.showInputDialog("Ingrese su Apellido:");
    Direccion=JOptionPane.showInputDialog("Ingrese su Direccion con el formato Calle, Distrito, Canton, Provincia:");
    
    }
    
    
    
}
