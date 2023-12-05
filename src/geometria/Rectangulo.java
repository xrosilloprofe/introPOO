package geometria;

public class Rectangulo {

    private Punto inferiorIzquierda;
    private Punto inferiorDerecha;
    private Punto superiorIzquierda;
    private Punto superiorDerecha;

    public Rectangulo(Punto inferiorIzquierda, Punto superiorDerecha){
        this.inferiorIzquierda=inferiorIzquierda;
        this.superiorDerecha=superiorDerecha;
        this.superiorIzquierda=new Punto(inferiorIzquierda.getX(), superiorDerecha.getY());
        this.inferiorDerecha=superiorDerecha.newPuntoDown(superiorDerecha.getY()- inferiorIzquierda.getY());
    }

    public Rectangulo(Punto inferiorIzquierda, int base, int altura){
        this.inferiorIzquierda=inferiorIzquierda;
        this.inferiorDerecha=inferiorIzquierda.newPuntoRight(base);
        this.superiorIzquierda=inferiorIzquierda.newPuntoUp(altura);
        this.superiorDerecha=this.inferiorDerecha.newPuntoUp(altura);
    }

    public int getBase(){
        return (int)(inferiorIzquierda.distance(inferiorDerecha));
    }

    public int getAltura(){
        return (int)(inferiorIzquierda.distance(superiorIzquierda));
    }

    public int perimetro(){
        return 2*(getBase()+getAltura());
    }

    public void moveUp(int distance){
        inferiorIzquierda.moveUp(distance);
        inferiorDerecha.moveUp(distance);
        superiorIzquierda.moveUp(distance);
        superiorDerecha.moveUp(distance);
    }

    @Override
    public String toString(){
        return inferiorIzquierda.toString() + " " + superiorIzquierda.toString() + " " +
                superiorDerecha.toString() + " " + inferiorDerecha.toString();
    }
}
