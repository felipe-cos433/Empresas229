package empresa229;

   public class Supervisor extends Usuario {
        public Supervisor(String nombre, String email) {
            super(nombre, email, "Supervisor");
        }

        @Override
        public void mostrarDetalles() {
            super.mostrarDetalles();
            System.out.println("Permisos: Puede supervisar y gestionar datos de empleados.");
        }
    }




