public class Venta {
    private int idVenta;
    private String nombreCliente;
    private double total;

    public Venta(int idVenta, String nombreCliente, double total) {
        this.idVenta = idVenta;
        this.nombreCliente = nombreCliente;
        this.total = total;
    }

    public void mostrarDetalle() {
        System.out.println("Venta #" + idVenta + " - Cliente: " + nombreCliente + " - Total: $" + total);
    }
}
