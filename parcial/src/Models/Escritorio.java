package Models;

public class Escritorio extends Productos{
    public Double alto;
    public Double ancho;

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Escritorio(Integer stock, String nombre, Double precio, Double ancho, Double alto) {
        super(stock, nombre, precio);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public Double aumento(Double porcentaje){

        return porcentaje;
    }
}
