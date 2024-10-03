package Models;

public abstract class Productos {
    public Integer stock;
    public String nombre;
    public Double precio;

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Productos(Integer stock, String nombre, Double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract Double aumento (Double porcentaje);

}
