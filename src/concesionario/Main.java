package concesionario;

public class Main {

    public static void main(String[] args) {
        Vehiculo miIbiza = new Vehiculo("Seat","Ibiza","verde","9854BXT",false,5);
        Vehiculo miBmw = new Vehiculo("BMW", "I3","azul","9855BXT",true,5);
        Vehiculo miToyota = new Vehiculo("Toyota","Corolla","rojo","9856BXT",false);
        System.out.println(miIbiza.getMarca());
        System.out.println(miToyota.getMatricula());
        System.out.println("Marchas: " + miBmw.getNumMarchas());

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