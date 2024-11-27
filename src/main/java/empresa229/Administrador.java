package empresa229;


    public class Administrador extends Usuario {
        public Administrador(String nombre, String email) {
            super(nombre, email, "Administrador");
        }

        @Override
        public void mostrarDetalles() {
            super.mostrarDetalles();
            System.out.println("Permisos: Puede gestionar todos los usuarios.");
        }
    }


