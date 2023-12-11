package ejercicio4;

public class LibroTester {
    public static void main(String[] args) {
        Libro quijote = new Libro("Don Quijote de la Mancha","Miguel de Cervantes","9788493806125",10);
        System.out.println(quijote);
        while(quijote.prestamo());
        System.out.println(quijote);
        quijote.devolucion();
        System.out.println(quijote);
    }
}
