public class Usuario {
    private int idUsuario;
    private String nombre;
    private String correo;

    public Usuario(int idUsuario, String nombre, String correo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void mostrarDetalle() {
        System.out.println("=== Detalle del Usuario ===");
        System.out.println("ID de usuario: " + idUsuario);
        System.out.println("Nombre completo: " + nombre.toUpperCase());
        System.out.println("Correo electrónico: " + correo);
        System.out.println("============================");
    }
}
