import Models.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Impresoras impresora = new Impresoras(10,"Impresora",1000.00,"HP",20);
        Notebook notebook = new Notebook(10, "Notebook",25000.00,"Asus",16.0);
        Silla Silla = new Silla(20,"Silla",200.00,true);
        Productos Escritorio = new Escritorio(10,"Escritorio",1200.00,20.00,10.00);
         List<Productos> lista = new ArrayList<>();

         lista.add(notebook);
         lista.add(Silla);


         for(Productos productos : lista){
             System.out.println(productos);
             System.out.println("El tipo de instancia es: "+productos.getClass().getSimpleName());
         }

         for (Productos productos : lista) {

             if(productos instanceof Silla){
                 System.out.println("Con descuento la silla te quedan en: $" + ((Silla)productos).descuentar(10.00)+".");
             }
         }
        System.out.println("");
        System.out.println("Precios con aumento y sin aumento");

        for(Productos productos : lista){
            if(productos instanceof Silla){
                System.out.println("Precio SIN desc de la SILLA: " +productos.getPrecio());
                productos.setPrecio(productos.aumento(5.00));
                System.out.println("Precio CON desc de la SILLA: " +productos.getPrecio());
            }
        }


    }
}