
package proyecto;

import javax.swing.JOptionPane;


public class Reclamos 
{
  private String nombre;
private String apellidos;
private int cedula;
private int fecha;
private String descripcion;
private int articulo;
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
    public void ReclamoP()
    {
        JOptionPane.showInputDialog("Aqui usted podrá hacer el reclamo de su articulo");
      fecha= Integer.parseInt(JOptionPane.showInputDialog("En que fecha hizo la compra de su articulo:"));
      JOptionPane.showInputDialog("Su informacion es la siguiente:"+nombre +apellidos+cedula +"que se hizo en la fecha:"+fecha);
      articulo=Integer.parseInt(JOptionPane.showInputDialog("Digite el nombre del articulo con el que quieras hacer el reclamo:"));
      
      descripcion=JOptionPane.showInputDialog("Porque desea hacer el reclamo del articulo:"); 
   
      JOptionPane.showInputDialog("Usted quiere hacer un reclamo del articulo:"+articulo+nombre+apellidos+"de la fecha:"+fecha+"y su cedula es:"+cedula+ "por los motivos"+descripcion);
    
            JOptionPane.showInputDialog("Aqui se finaliza el reclamo:"+nombre+apellidos);
            
    }
}





