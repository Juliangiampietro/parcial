package Models;

public class ProductosInformaticos extends Productos {
    public String NombreDeFabricante;

    public String getNombreDeFabricante() {
        return NombreDeFabricante;
    }

    public void setNombreDeFabricante(String nombreDeFabricante) {
        NombreDeFabricante = nombreDeFabricante;
    }

    public ProductosInformaticos(Integer stock, String nombre, Double precio, String nombreDeFabricante) {
        super(stock, nombre, precio);
        NombreDeFabricante = nombreDeFabricante;
    }
    @Override
    public  Double aumento (Double porcentaje){

        return porcentaje;
    }
}
