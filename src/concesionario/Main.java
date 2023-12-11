package concesionario;

public class Main {

    public static void main(String[] args) {
        Vehiculo miIbiza = new Vehiculo("Seat","Ibiza","verde","9854BXT",false,5);
        Vehiculo miBmw = new Vehiculo("BMW", "I3","azul","9855BXT",true,5);
        Vehiculo miToyota = new Vehiculo("Toyota","Corolla","rojo","9856BXT",false);
        System.out.println(miIbiza.getMarca());
        System.out.println(miToyota.getMatricula());
        System.out.println("Marchas: " + miBmw.getNumMarchas());
        Taller t1 = new Taller("Taller IBIZAS");
        t1.cambioColor("rojo", miIbiza);
        System.out.println(miIbiza);
        t1.addVehiculo(miIbiza,miBmw);
        t1.addVehiculo(miToyota);
        System.out.println(t1);


        for (int i = 0; i < 6; i++) {
            miIbiza.subirMarcha();
        }
        System.out.println(miIbiza.getMarcha());
        for (int i = 0; i < 3; i++) {
            miIbiza.bajarMarcha();
        }
        System.out.println(miIbiza.getMarcha());

        System.out.println(miIbiza);
        System.out.println(miBmw);
    }
}