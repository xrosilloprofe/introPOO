package geometria;

public class Punto {
    //ATTRIBUTES
    private int x;
    private int y;

    //CONSTRUCTORS
    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x){
        this.x=x;
        this.y=0;
    }

    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveUp(int distance){
        this.y += distance;
    }

    public void moveDown(int distance){
        this.y = this.y - distance;
    }

    public void moveRight(int distance){
        this.x += distance;
    }

    public void moveLeft(int distance){
        this.x = this.x - distance;
    }

    public Punto newPuntoUp(int distancia){
        return new Punto(x,y+distancia);
    }

    public Punto newPuntoDown(int distancia){
        return new Punto(x,y-distancia);
    }

    public Punto newPuntoLeft(int distancia){
        return new Punto(x-distancia,y);
    }
    public Punto newPuntoRight(int distancia){
        return new Punto(x+distancia,y);
    }

    public double distance(Punto puntoDestino){
        int difx = puntoDestino.getX() - this.x;
        int dify = puntoDestino.getY() - this.y;
        return Math.sqrt(Math.pow(difx,2)+Math.pow(dify,2));
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

}
