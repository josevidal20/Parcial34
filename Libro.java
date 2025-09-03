public class Libro {
    protected  String titulo;
    protected String autor;
    protected int numeroEjemplares;
    protected int numeroDeEjemplaresPrestados;





    public Libro(String titulo, String autor, int numeroEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroDeEjemplaresPrestados = 0; 
    }

    public Libro() {
        this("", "", 0); 
    }

     public boolean prestamo() {
        if (numeroEjemplares > numeroDeEjemplaresPrestados) {
            numeroDeEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (numeroDeEjemplaresPrestados > 0) {
            numeroDeEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Número de Ejemplares: " + numeroEjemplares + "\n" +
               "Número de Ejemplares Prestados: " + numeroDeEjemplaresPrestados;
    }



}