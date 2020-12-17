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
private int IVA;
private float MontoIVA;
private int Subtotal;
private float Total;
Usuario usu1=new Usuario();
Catalogo cat=new Catalogo(0,"","");

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
    
    public void Facturar()
    {
    Subtotal=cat.getPrecio();
    MontoIVA=(Subtotal*13)/100;
    Total=Subtotal+MontoIVA;
    
    JOptionPane.showConfirmDialog(null, "♪♪♪♪♪♪♪♪♪ Tienda Musical Listen ♪♪♪♪♪♪♪♪♪" 
                                       +"\nCliente: "+usu1.getNombre()+" "+usu1.getApellido()
                                       +"\nDirección:  "+usu1.getDireccion()
                                       +"\n\nArticulo:  "+cat.getNombreArticulo()
                                       +"\nCategoria:   "+cat.getCategoria()
                                       +"\nPrecio:      $"+cat.getPrecio()
                                       +"\n\nSubtotal:  $"+Subtotal
                                       +"\nIVA 13%:   $"+MontoIVA
                                       +"\nTotal a pagar: $"+Total);
    
    
    }




    
}
