public class Lector {

    private String cedula;
    private String nombre;
    private Libro libroActual;

    public Lector(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Libro getLibroActual() {
        return libroActual;
    }

    public void prestarLibro(Libro libro) {

        if (libroActual != null) {
            System.out.println(nombre + " ya tiene prestado el libro \"" +
                    libroActual.getTitulo() + "\".");
            return;
        }

        if (libro.prestar()) {
            libroActual = libro;
            System.out.println(nombre + " tomó prestado \"" +
                    libro.getTitulo() + "\".");
        }
    }

    public void devolverLibro() {

        if (libroActual == null) {
            System.out.println(nombre + " no tiene libros prestados.");
            return;
        }

        libroActual.devolver();
        System.out.println(nombre + " devolvió \"" +
                libroActual.getTitulo() + "\".");
        libroActual = null;
    }

    // Función para volver a prestar
    public void volverAPrestar(Libro libro) {

        if (libroActual != null) {
            devolverLibro();
        }

        prestarLibro(libro);
    }

    public void mostrarEstado() {

        if (libroActual == null) {
            System.out.println(nombre + " no tiene ningún libro.");
        } else {
            System.out.println(nombre + " tiene el libro \"" +
                    libroActual.getTitulo() + "\".");
        }
    }
}