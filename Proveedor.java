// Modificado por Desarrollador J  Solucion a el problema 

public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String empresa;

    public Proveedor(int idProveedor, String nombre, String empresa) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.empresa = empresa;
    }

    public void mostrarDetalle() {
        System.out.println("Proveedor #" + idProveedor
                + " - Nombre: " + nombre
                + " - Empresa proveedor: " + empresa
                + " - Modificado por Desarrollador J");
    }
}
