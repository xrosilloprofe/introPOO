public class Vehiculo {

    //Aquí vienen los atributos
    private String marca;
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
    }

    public Vehiculo(String marca, String modelo, String color, String matricula, boolean cambioAutomatico, int numMarchas){
        this.marca =marca;
        this.modelo=modelo;
        this.color=color;
        this.matricula=matricula;
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
        this.cambioAutomatico = cambioAutomatico;
        if (cambioAutomatico)
            this.numMarchas = 0;
        else
            this.numMarchas = 5;
    }


}


