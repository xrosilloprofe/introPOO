package ejercicio4;

/**
 * Ejercicio 4. Crea una clase Libro con los métodos préstamo, devolución y toString. La clase contendrá los métodos getters y setters.
 */
public class Libro {
    private int numEjemplares;
    private String titulo;
    private String autor;
    private String ISBN;

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numEjemplares=0;
    }

    public Libro(String titulo, String autor, String ISBN, int numEjemplares) {
        this(titulo, autor, ISBN);
        this.numEjemplares=numEjemplares;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean prestamo(){
        if(numEjemplares>0){
            numEjemplares--;
            return true;
        }
        return false;
    }

    public void devolucion(){
        numEjemplares++;
    }

    @Override
    public String toString() {
        return "Título=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", numEjemplares=" + numEjemplares;
    }
}
