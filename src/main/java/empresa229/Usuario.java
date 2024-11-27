package empresa229;

public abstract class Usuario {
    private String nombre;
    private String email;
    private String rol;

    public Usuario(String nombre, String email, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getRol() {
        return rol;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Rol: " + rol);
    }
}
