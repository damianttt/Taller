public class App {
    public static void main(String[] args) {

        // Crear libros
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes");
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro libro4 = new Libro("La Odisea", "Homero");
        Libro libro5 = new Libro("El Alquimista", "Paulo Coelho");

        // Crear lectores
        Lector lector1 = new Lector("1", "Juan");
        Lector lector2 = new Lector("2", "María");
        Lector lector3 = new Lector("3", "Carlos");
        Lector lector4 = new Lector("4", "Ana");
        Lector lector5 = new Lector("5", "Pedro");

        // Préstamos
        lector1.prestarLibro(libro1);
        lector2.prestarLibro(libro2);
        lector3.prestarLibro(libro3);

        // Intentar prestar un libro ya prestado
        System.out.println("\nIntentando prestar un libro ya prestado:");
        lector4.prestarLibro(libro1);

        // Devolver libro
        System.out.println("\nDevolviendo libro:");
        lector1.devolverLibro();

        // Volver a prestar
        System.out.println("\nPrestando nuevamente el libro:");
        lector5.prestarLibro(libro1);

        // Cambiar de libro usando volverAPrestar
        System.out.println("\nPedro cambia de libro:");
        lector5.volverAPrestar(libro5);

        // Mostrar estado
        System.out.println("\nEstado final:");
        lector1.mostrarEstado();
        lector2.mostrarEstado();
        lector3.mostrarEstado();
        lector4.mostrarEstado();
        lector5.mostrarEstado();
    }
}