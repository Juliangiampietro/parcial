package Models;

public class Notebook extends ProductosInformaticos{

    public Double memoriaGB;

    public Double getMemoriaGB() {
        return memoriaGB;
    }

    public void setMemoriaGB(Double memoriaGB) {
        this.memoriaGB = memoriaGB;
    }

    public Notebook(Integer stock, String nombre, Double precio, String nombreDeFabricante, Double memoriaGB) {
        super(stock, nombre, precio, nombreDeFabricante);
        this.memoriaGB = memoriaGB;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre() +"\nMarca: "+ getNombreDeFabricante() +"\nStock: "+getStock() + "\nPrecio: " +getPrecio() +"\nMemoria GB: " +getMemoriaGB() +"\n";
    }
    @Override
    public  Double aumento (Double porcentaje){

        return porcentaje;
    }
}
