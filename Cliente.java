public class Cliente {
    private int idCliente;
    private String nombre;
    private String correo;

    public Cliente(int idCliente, String nombre, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void mostrarDetalle() {
        System.out.println("----- Detalle del Cliente -----");
        System.out.println("ID Cliente: " + idCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
    }
}