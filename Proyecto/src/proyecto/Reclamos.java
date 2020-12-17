/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Reclamos
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;

import javax.swing.JOptionPane;

public class Reclamos 
{
    //Atributos
    private String nombre;
    private String apellidos;
    private int cedula;
    private String fecha;
    private String descripcion;
    private String articulo;
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
    //Metodo Reclamo
    public void ReclamoP()
    {
  
      fecha= JOptionPane.showInputDialog("En que fecha hizo la compra de su articulo con el formato MM/DD/YYYY:");
      nombre=JOptionPane.showInputDialog("Ingrese su nombre:");
      apellidos=JOptionPane.showInputDialog("Ingrese sus apellidos:");
      cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cedula:"));
      articulo=JOptionPane.showInputDialog("Digite el nombre del articulo con el que quieras hacer el reclamo:");
      descripcion=JOptionPane.showInputDialog("Porque desea hacer el reclamo del articulo:"); 
   
      JOptionPane.showMessageDialog(null,"Usted a realizado el reclamo:"
                                  +"\nFecha de Compra: "+fecha
                                  +"\nArticulo: "+articulo
                                  +"\nMotivo: "+descripcion
                                  +"\nNombre"+nombre+apellidos
                                  +"\nCédula :"+cedula);
