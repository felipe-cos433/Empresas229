package empresa229;
import java.util.ArrayList;
import java.util.List;

    public class GestorUsuarios {
        public static void main(String[] args) {
            // Crear lista de usuarios
            List<Usuario> usuarios = new ArrayList<>();

            // Agregar diferentes tipos de usuarios
            usuarios.add(new EmpleadoRegular("Juan Pérez", "juan@empresa.com"));
            usuarios.add(new Supervisor("Ana Gómez", "ana@empresa.com"));
            usuarios.add(new Administrador("Carlos Ruiz", "carlos@empresa.com"));

            // Mostrar detalles de los usuarios
            System.out.println("Detalles de los Usuarios:");
            for (Usuario usuario : usuarios) {
                usuario.mostrarDetalles();
                System.out.println("----------------------------");
            }
        }
    }


