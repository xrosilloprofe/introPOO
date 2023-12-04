package concesionario;

public class Vehiculo {

    //Aquí vienen los atributos
    private String marca;
    private static final int NUM_MARCHAS=5;
    private String modelo;
    private String color;
    private String matricula;
    private int marcha;
    private boolean cambioAutomatico;
    private int numMarchas;

    //aquí vienen los constructores
    public Vehiculo(){
        marca = "";
        modelo = "";
        color = "";
        matricula = "";
        marcha = 0;
        cambioAutomatico = false;
        numMarchas = 0;
    }
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.marcha=0;
    }

    public Vehiculo(String marca, String modelo, String color, String matricula, boolean cambioAutomatico, int numMarchas){
        this.marca =marca;
        this.modelo=modelo;
        this.color=color;
        this.matricula=matricula;
        this.marcha=0;
        this.cambioAutomatico = cambioAutomatico;
        if (cambioAutomatico)
            this.numMarchas = 0;
        else
            this.numMarchas = numMarchas;
    }

    public Vehiculo(String marca, String modelo, String color, String matricula, boolean cambioAutomatico){
        this.marca =marca;
        this.modelo=modelo;
        this.color=color;
        this.matricula=matricula;
        this.marcha=0;
        this.cambioAutomatico = cambioAutomatico;
        if (cambioAutomatico)
            this.numMarchas = 0;
        else
            this.numMarchas = NUM_MARCHAS;
    }

    //accessor and mutator methods
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public boolean isCambioAutomatico(){
        return cambioAutomatico;
    }
    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }
    public int getNumMarchas(){
        return numMarchas;
    }
    public void setNumMarchas(int numMarchas){
        this.numMarchas = numMarchas;
    }
    public int getMarcha(){
        return marcha;
    }

    //functional methods
    public void subirMarcha(){
        if(!cambioAutomatico && marcha<numMarchas)
            marcha++;
    }

    public void bajarMarcha(){
        if(!cambioAutomatico && marcha>0)
            marcha--;
    }

    @Override
    public String toString(){
        String automatico = cambioAutomatico?"automático":"manual";
        return "marca: " + marca + " modelo: " + modelo +
                " color: " + color + " matricula: " + matricula +
                " tipo de cambio: " + automatico + " numero marchas: " +
                numMarchas + " marcha actual: " + marcha;
    }

}


