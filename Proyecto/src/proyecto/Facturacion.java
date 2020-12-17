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




    
}
