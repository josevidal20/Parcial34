public class Biblioteca {
    public static void main(String[] args) {



        
        Libro libro1 = new Libro("la maquina", "faustino asprilla", 5);
        System.out.println("Libro 1 Creado ");
        System.out.println(libro1.toString());
        System.out.println("---\n");

        Libro libro2 = new Libro();
        libro2.prestamo(); 
        System.out.println("--Libro 2 Creado (con constructor vacío) ");
        System.out.println(libro2.toString());
        System.out.println("-----\n");

        
        System.out.println("--Probando Métodos con Libro 1 -");
        System.out.println("Intentando prestar el libro 1..");
        if (libro1.prestamo()) {
            System.out.println("Préstamo exitoso");
        } else {
            System.out.println("No se pudo prestar. No hay ejemplares disponibles.");
        }
        System.out.println(libro1.toString());
        System.out.println("Intentando devolver el libro 1..");
        if (libro1.devolucion()) {
            System.out.println("Devolución exitosa");
        } else {
            System.out.println("No se pudo devolver. No hay ejemplares prestados.");
        }
        System.out.println(libro1.toString());
        System.out.println("---\n");
    }
}