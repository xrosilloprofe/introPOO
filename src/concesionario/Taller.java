package concesionario;

import java.util.Arrays;

public class Taller {
    private String nombre;
    private Vehiculo[] vehiculos;
    private int vehiculosTaller;

    public Taller(String nombre){
        this.nombre=nombre;
        vehiculos = new Vehiculo[10];
        this.vehiculosTaller=0;
    }

    public void addVehiculo(Vehiculo ... vehiculo) {

        if(vehiculosTaller+vehiculo.length<10){
            for (int i = 0; i < vehiculo.length; i++) {
                this.vehiculos[vehiculosTaller]=vehiculo[i];
                vehiculosTaller++;
            }
        }
    }

    public void cambioColor(String color, Vehiculo vehiculo){
        vehiculo.setColor(color);
    }

    @Override
    public String toString(){
        return Arrays.toString(vehiculos);
    }

}
