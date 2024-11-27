package empresa229;

    public class EmpleadoRegular extends Usuario {
        public EmpleadoRegular(String nombre, String email) {
            super(nombre, email, "Empleado Regular");
        }

        @Override
        public void mostrarDetalles() {
            super.mostrarDetalles();
            System.out.println("Permisos: Solo puede gestionar sus propios datos.");
        }
    }





