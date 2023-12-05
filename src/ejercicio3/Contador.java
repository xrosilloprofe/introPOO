package ejercicio3;

public class Contador {
    private int cont;

    public Contador(){
        this.cont=0;
    }

    public Contador(int cont){
        this.cont=cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont){
        this.cont = cont;
    }

    public void incrementa(){
        cont++;
    }

    public void decrementa(){
        cont--;
    }

    @Override
    public String toString(){
        return String.valueOf(cont);
    }

}
