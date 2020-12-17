/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Facturación
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;

import javax.swing.JOptionPane;

public class Facturacion 
{
//Atributos
private String Nombre_Articulo;
private String Tipo;
private int precio;
private int IVA;
private float MontoIVA;
private int Subtotal;
private float Total;

//Instancia de clases
Usuario usu1=new Usuario("","","");

    public String getNombre_Articulo() {
        return Nombre_Articulo;
    }

    public void setNombre_Articulo(String Nombre_Articulo) {
        this.Nombre_Articulo = Nombre_Articulo;
    }

    public String getTipo() 
    {
        return Tipo;
    }

    public void setTipo(String Tipo) 
    {
        this.Tipo = Tipo;
    }

    public int getPrecio() 
    {
        return precio;
    }

    public void setPrecio(int precio) 
    {
        this.precio = precio;
    }

    public Usuario getUsu1() {
        return usu1;
    }

    public void setUsu1(Usuario usu1) {
        this.usu1 = usu1;
    }

    public int getIVA() 
    {
        return IVA;
    }

    public void setIVA(int IVA) 
    {
        this.IVA = IVA;
    }

    public float getMontoIVA() 
    {
        return MontoIVA;
    }

    public void setMontoIVA(float MontoIVA) 
    {
        this.MontoIVA = MontoIVA;
    }

    public int getSubtotal() 
    {
        return Subtotal;
    }

    public void setSubtotal(int Subtotal) 
    {
        this.Subtotal = Subtotal;
    }

    public float getTotal() 
    {
        return Total;
    }

    public void setTotal(float Total) 
    {
        this.Total = Total;
    }
    
    //Metodos
    public void Facturar()
    {
    usu1.ObtenerInformacionUsuario();
    Subtotal=precio;
    MontoIVA=(Subtotal*13)/100;
    Total=Subtotal+MontoIVA;
    
    JOptionPane.showMessageDialog(null, "♪♪♪♪♪♪♪♪♪ Tienda Musical Listen ♪♪♪♪♪♪♪♪♪" 
                                       +"\nCliente: "+usu1.getNombre()+" "+usu1.getApellido()
                                       +"\nDirección:  "+usu1.getDireccion()
                                       +"\n\nArticulo:  "+Nombre_Articulo
                                       +"\nCategoria:   "+Tipo
                                       +"\nPrecio:      $"+precio
                                       +"\n\nSubtotal:  $"+Subtotal
                                       +"\nIVA 13%:   $"+MontoIVA
                                       +"\nTotal a pagar: $"+Total);
    
    
    }
