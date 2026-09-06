public class Producto {

    // C: Atributos
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    // C: Constructor
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // D: Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // D: Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // D: toString
    @Override
    public String toString() {
        return "ID: " + id + " | " + nombre + " | $" + precio + " | Stock: " + stock;
    }
}