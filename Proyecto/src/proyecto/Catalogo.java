/*
Universidad Fidélitas
Curso Introducción a la progromación
Programa Tienda Musical Listen
Clase Catálogo
Integrantes:
Steven Campos Matamorros
Mauricio Chacón Viales
Jorge Ezquivel Poveda
3er Cuatrimetre 2020
 */
package proyecto;

import javax.swing.JOptionPane;

public class Catalogo 
{
   

   
   //Instnacia de clases y arreglos de objetos
   Discos Dis[]=new Discos[3];
   Discos Dis2[]=new Discos[3];
   Discos Dis3[]=new Discos[3];
   Discos Dis4[]=new Discos[3];
   InstrumentosBase Viento[]=new InstrumentosBase[3];
   InstrumentosBase Cuerda[]=new InstrumentosBase[3];
   InstrumentosBase Percusion[]=new InstrumentosBase[3];
   Facturacion fac=new Facturacion();

  //Metodos
   
   public void MenuDisco()
   {
       int opcion1;
       do{
           
       opcion1= Integer.parseInt(JOptionPane.showInputDialog("Inserte el genero que quiere"
               + "\n1.Salsa"
               + "\n2.Bachata"
               + "\n3.Reggueton"
               + "\n4.Electronica"
               + "\n5.Salir"));
      
          switch(opcion1)
          {
              case 1:
           do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el disco de salsa que desea:"
             + "\n1.Marc Anthony $40"
             + "\n2.Willie Colon $20"
             + "\n3.Celia Cruz   $80"
             + "\n4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                 Dis[0]=new Discos(40,"Marc Anthony","Salsa");
                fac.setPrecio(Dis[0].getPrecio());
                fac.setNombre_Articulo(Dis[0].getNombre());
                fac.setTipo(Dis[0].getTipo());
                fac.Facturar();
                  break;
              case 2:
                  Dis[1]=new Discos(20,"Willie Colon","Salsa");
                  fac.setPrecio(Dis[1].getPrecio());
                  fac.setNombre_Articulo(Dis[1].getNombre());
                  fac.setTipo(Dis[1].getTipo());
                  fac.Facturar();
                  break;
              case 3:
                 Dis[2]=new Discos(80,"Celia Cruz","Salsa");
                 fac.setPrecio(Dis[2].getPrecio());
                 fac.setNombre_Articulo(Dis[2].getNombre());
                 fac.setTipo(Dis[2].getTipo());
                 fac.Facturar();
                  break;
              case 4:
                   JOptionPane.showMessageDialog(null, "Muchas Gracias" );
                   break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion correcta");
                 break;
          }
       }while(opcion1!=4);
                  break;
              case 2:
                 do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el disco de bachata que desea:"
             + "\n1.Prince Royce $100"
             + "\n2.Romeo Santos $120"
             + "\n3.Aventura     $80"
             + "\n4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                 Dis2[0]=new Discos(100,"Prince Royce","Bachata");
                 fac.setPrecio(Dis2[0].getPrecio());
                 fac.setNombre_Articulo(Dis2[0].getNombre());
                 fac.setTipo(Dis2[0].getTipo());
                 fac.Facturar();
                  break;
              case 2:
                  Dis2[1]=new Discos(120,"Romeo Santos","Bachata");
                  fac.setPrecio(Dis2[1].getPrecio());
                  fac.setNombre_Articulo(Dis2[1].getNombre());
                  fac.setTipo(Dis2[1].getTipo());
                  fac.Facturar();
                  break;
              case 3:
                 Dis2[2]=new Discos(80,"Aventura","Bachata");
                 fac.setPrecio(Dis2[2].getPrecio());
                 fac.setNombre_Articulo(Dis2[2].getNombre());
                 fac.setTipo(Dis2[2].getTipo());
                 fac.Facturar();
                 break;
              case 4:
                   JOptionPane.showMessageDialog(null, "Muchas Gracias" );
                   break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion correcta");
                 break;
          }
       }while(opcion1!=4);
                  break;
              case 3:
                  do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el disco de reggueton que desea:"
             + "\n1.Bad Bunny $20"
             + "\n2.Ozuna     $25"
             + "\n3.Anuel     $30"
             + "\n4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                 Dis3[0]=new Discos(20,"Bad Bunny","reggueton");
                 fac.setPrecio(Dis3[0].getPrecio());
                 fac.setNombre_Articulo(Dis3[0].getNombre());
                 fac.setTipo(Dis3[0].getTipo());
                 fac.Facturar();
                  break;
              case 2:
                  Dis3[1]=new Discos(25,"Ozuna","reggueton");
                  fac.setPrecio(Dis3[1].getPrecio());
                  fac.setNombre_Articulo(Dis3[1].getNombre());
                  fac.setTipo(Dis3[1].getTipo());
                  fac.Facturar();
                  break;
              case 3:
                 Dis3[2]=new Discos(30,"Anuel","reggueton");
                 fac.setPrecio(Dis3[2].getPrecio());
                 fac.setNombre_Articulo(Dis3[2].getNombre());
                 fac.setTipo(Dis3[2].getTipo());
                 fac.Facturar();
                 break;
              case 4:
                   JOptionPane.showMessageDialog(null, "Muchas Gracias" );
                   break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion correcta");
                 break;
          }
       }while(opcion1!=4);
                  break;
              case 4:
                  do{
            opcion1= Integer.parseInt(JOptionPane.showInputDialog("Digite el disco de electronica que desea:"
             + "\n1.Marshmello       $70"
             + "\n2.Martin Garrix    $60"
             + "\n3.Avicii           $55"
             + "\n4. Salir"));
            
             switch(opcion1)
          {
              case 1:
                 Dis4[0]=new Discos(70,"Marshmello","electronica");
                 fac.setPrecio(Dis4[0].getPrecio());
                 fac.setNombre_Articulo(Dis4[0].getNombre());
                 fac.setTipo(Dis4[0].getTipo());
                 fac.Facturar();
                 break;
              case 2:
                  Dis4[1]=new Discos(60,"Martin Garrix","electronica");
                  fac.setPrecio(Dis4[1].getPrecio());
                  fac.setNombre_Articulo(Dis4[1].getNombre());
                  fac.setTipo(Dis4[1].getTipo());
                  fac.Facturar();
                  break;
              case 3:
                 Dis4[2]=new Discos(55,"Avicii","electronica");
                 fac.setPrecio(Dis4[2].getPrecio());
                 fac.setNombre_Articulo(Dis4[2].getNombre());
                 fac.setTipo(Dis4[2].getTipo());
                 fac.Facturar();
                 break;
              case 4:
                   JOptionPane.showMessageDialog(null, "Muchas Gracias" );
                   break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion correcta");
                 break;
          }
       }while(opcion1!=4);
                  break;
              case 5:
                  JOptionPane.showMessageDialog(null, "Muchas Gracias por su preferencia");
                  break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion valida");
                 break;
          }
          
      }while(opcion1!=5);
      
      
   }
      
    public void MenuInstrumentos()
    {
        int opcion2;
        do{
            
        opcion2=Integer.parseInt(JOptionPane.showInputDialog("Inserte el tipo de instrumento que quiere"
                + "\n1.Viento"
                + "\n2.Cuerda"
                + "\n3.Percusion"
                + "\n4.Salir"));
       
       
           switch(opcion2)
           {
              case 1:
                  do{
            opcion2= Integer.parseInt(JOptionPane.showInputDialog("Digite el instrumento de viento que desea:"
             + "\n1.Flatua Dulce $50"
             + "\n2.Saxofon      $300"
             + "\n3.Trompeta     $150"
             + "\n4. Salir"));
            
             switch(opcion2)
          {
              case 1:
                  Viento[0]=new InstrumentosBase(50,"Flauta Dulce","Viento");
                  fac.setPrecio(Viento[0].getPrecio());
                  fac.setNombre_Articulo(Viento[0].getNombre());
                  fac.setTipo(Viento[0].getTipo());
                  fac.Facturar();
                
                  break;
              case 2:
                 Viento[1]=new InstrumentosBase(300,"Saxofon","Viento");
                 fac.setPrecio(Viento[1].getPrecio());
                 fac.setNombre_Articulo(Viento[1].getNombre());
                 fac.setTipo(Viento[1].getTipo());
                 fac.Facturar();
                 break;
              case 3:
                 Viento[2]=new InstrumentosBase(150,"Trompeta","Viento");
                 fac.setPrecio(Viento[2].getPrecio());
                 fac.setNombre_Articulo(Viento[2].getNombre());
                 fac.setTipo(Viento[2].getTipo());
                 fac.Facturar();
                 break;
              case 4:
                   JOptionPane.showMessageDialog(null, "Muchas Gracias" );
                   break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion correcta");
                 break;
          }
       }while(opcion2!=4);
                  
                  break;
              case 2:
                  do{
            opcion2= Integer.parseInt(JOptionPane.showInputDialog("Digite el instrumento de cuerda que desea:"
             + "\n1.Guitarra Electrica         $240"
             + "\n2.Ukelele Tenor              $190"
             + "\n3.Guitarra electroacustica   $380"
             + "\n4. Salir"));
            
             switch(opcion2)
          {
              case 1:
                 Cuerda[0]=new InstrumentosBase(240,"Guitarra Electrica","Cuerda");
                 fac.setPrecio(Cuerda[0].getPrecio());
                 fac.setNombre_Articulo(Cuerda[0].getNombre());
                 fac.setTipo(Cuerda[0].getTipo());
                 fac.Facturar();
                 break;
              case 2:
                  Cuerda[1]=new InstrumentosBase(190,"Ukelele Tenor","Cuerda");
                  fac.setPrecio(Cuerda[1].getPrecio());
                  fac.setNombre_Articulo(Cuerda[1].getNombre());
                  fac.setTipo(Cuerda[1].getTipo());
                  fac.Facturar();
                  break;
              case 3:
                 Cuerda[2]=new InstrumentosBase(380,"Guitarra electroacustica","Cuerda");
                 fac.setPrecio(Cuerda[2].getPrecio());
                 fac.setNombre_Articulo(Cuerda[2].getNombre());
                 fac.setTipo(Cuerda[2].getTipo());
                 fac.Facturar();
                  break;
              case 4:
                   JOptionPane.showMessageDialog(null, "Muchas Gracias" );
                   break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion correcta");
                 break;
          }
       }while(opcion2!=4);
                  break;
              case 3:
                  do{
            opcion2= Integer.parseInt(JOptionPane.showInputDialog("Digite el instrumento de percusiom que desea:"
             + "\n1.Bombo              $140"
             + "\n2.Platillos Dobles   $200"
             + "\n3.Cajon              $80"
             + "\n4. Salir"));
            
             switch(opcion2)
          {
              case 1:
                 Percusion[0]=new InstrumentosBase(140,"Bombo","Percusion");
                 fac.setPrecio(Percusion[0].getPrecio());
                 fac.setNombre_Articulo(Percusion[0].getNombre());
                 fac.setTipo(Percusion[0].getTipo());
                 fac.Facturar();
                 
                  break;
              case 2:
                  Percusion[1]=new InstrumentosBase(200,"Platillos Dobles","Percusion");
                  fac.setPrecio(Percusion[1].getPrecio());
                  fac.setNombre_Articulo(Percusion[1].getNombre());
                  fac.setTipo(Percusion[1].getTipo());
                  fac.Facturar();
                  break;
              case 3:
                 Percusion[2]=new InstrumentosBase(80,"Cajon","Percusion");
                 fac.setPrecio(Percusion[2].getPrecio());
                 fac.setNombre_Articulo(Percusion[2].getNombre());
                 fac.setTipo(Percusion[2].getTipo());
                 fac.Facturar();
                  break;
              case 4:
                   JOptionPane.showMessageDialog(null, "Muchas Gracias" );
                   break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion correcta");
                 break;
          }
       }while(opcion2!=4);
                  break;
              case 4:
                  JOptionPane.showMessageDialog(null, "Muchas Gracias por su preferencia");
                  break;
              default:
                  JOptionPane.showMessageDialog(null,"Digite una opcion valida");
                 break;
           }
           
               
       }while(opcion2!=4);
        
        
    }

   

    
    
           
}
