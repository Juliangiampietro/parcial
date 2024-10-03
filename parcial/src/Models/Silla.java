package Models;

import Interfaces.Descuento;

public class Silla  extends Productos implements Descuento {
    public boolean Ruedas;

    public boolean isRuedas() {
        return Ruedas;
    }

    public void setRuedas(boolean ruedas) {
        Ruedas = ruedas;
    }

    public Silla(Integer stock, String nombre, Double precio, boolean ruedas) {
        super(stock, nombre, precio);
        Ruedas = ruedas;
    }

    @Override
    public double descuentar(Double descuento) {
        return getPrecio()- ((descuento*getPrecio())/100);
    }
    @Override
    public String toString(){
        return "Nombre" + getNombre()
                + "\nPrecio: " + getPrecio()
                + "\nRuedas: " + isRuedas()
                + "\nStock: " + getStock()
                + "\nPrecio: " + getPrecio();
    }
    @Override
    public  Double aumento (Double porcentaje){

        return getPrecio() +((porcentaje*getPrecio())/100);
    }
}
