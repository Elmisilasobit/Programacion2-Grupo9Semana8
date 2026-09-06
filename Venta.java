public class Venta {
    private int idVenta;
    private String cliente;
    private double total;

    public Venta(int idVenta, String cliente, double total) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.total = total;
    }

    public void mostrarDetalle() {
        System.out.println("facture #" + idVenta + " - Cliente: " + cliente + " - Total: $" + total);
    }
}