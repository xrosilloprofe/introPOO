package ejercicios8y9;

/**
 * Ejercicio 9. A partir del ejercicio anterior, crea la clase Segmento. Dicha clase estará definida por dos puntos.
 * Sobrescribe el método toString() para poder representar un segmento de la forma (x1,y1) - (x2,y2).
 * Crea los constructores que creas oportunos.
 * Se debe poder desplazar cualquiera de los dos puntos, así como el segmento entero por todo el plano XY.
 */
public class Segmento {

    private Punto p1;
    private Punto p2;

    public Segmento(){
        p1 = new Punto();
        p2 = new Punto();
    }

    public Segmento(Punto p1, Punto p2){
        this.p1=p1;
        this.p2=p2;
    }

    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void moveUp(int distance){
        p1.moveUp(distance);
        p2.moveUp(distance);
    }

    public void moveDown(int distance){
        p1.moveDown(distance);
        p2.moveDown(distance);
    }

    public void moveLeft(int distance){
        p1.moveLeft(distance);
        p2.moveLeft(distance);
    }

    public void moveRight(int distance){
        p1.moveRight(distance);
        p2.moveRight(distance);
    }

    @Override
    public String toString(){
        return p1.toString() + " - " + p2.toString();
    }

}
