package ejercicio10;

public class Juego {
    public static void main(String[] args) {
        Baraja b1 = new Baraja();
        System.out.println(b1);
        Carta sacada = b1.repartirEncima();
        System.out.println(sacada);
        System.out.println(b1);
        for (int i = 0; i < 10; i++) {
            sacada = b1.repartirDebajo();
            System.out.println(sacada);
        }
        System.out.println(b1);
    }
}
