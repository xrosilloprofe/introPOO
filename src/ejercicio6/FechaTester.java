package ejercicio6;

public class FechaTester {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(31,12,2023);
        System.out.println(fecha);
        Fecha fecha1 = new Fecha(29,2,2000);
        System.out.println(fecha1);
        Fecha fecha2 = new Fecha(29,2,1900);
        System.out.println(fecha2);
        for (int i = 0; i < 367; i++) {
            fecha1.aumentarDia();
            System.out.println(fecha1);
        }

    }
}
