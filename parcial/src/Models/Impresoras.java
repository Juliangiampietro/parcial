package Models;

import Interfaces.Descuento;

public class Impresoras extends ProductosInformaticos implements Descuento {
    public Integer impresionesXMN;

    public Integer getImpresionesXMN() {
        return impresionesXMN;
    }

    public void setImpresionesXMN(Integer impresionesXMN) {
        this.impresionesXMN = impresionesXMN;
    }

    public Impresoras(Integer stock, String nombre, Double precio, String nombreDeFabricante, Integer impresionesXMN) {
        super(stock, nombre, precio, nombreDeFabricante);
        this.impresionesXMN = impresionesXMN;
    }
    @Override
    public double descuentar(Double descuento) {
        return getPrecio()- ((descuento*getPrecio())/100);
    }
    @Override
    public Double aumento (Double porcentaje){

        return porcentaje;
    }
}
