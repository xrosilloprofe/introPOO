package ejercicios8y9;

public class Geo {
    public static void main(String[] args) {
        Punto p1 = new Punto(3,2);
        Punto p2 = new Punto(10);
        System.out.println(p1);
        p2.moveRight(33);
        System.out.println(p2);
        p1.moveDown(15);
        System.out.println(p1);
        Punto p3 = p1.newPuntoRight(50);
        System.out.println(p3);
        System.out.println(p3.distance(p1));
        System.out.println(p2.distance(p3));

        Rectangulo r1 = new Rectangulo(p1,p2);
        System.out.println(r1);
        r1.moveUp(13);
        System.out.println(r1);
        System.out.println(r1.perimetro());

        Segmento s1 = new Segmento(p1, p2);
        System.out.println(s1);
        s1.getP1().moveUp(5);
        s1.getP2().moveLeft(6);
        System.out.println(s1);
        s1.moveRight(10);
        System.out.println(s1);

    }
}
