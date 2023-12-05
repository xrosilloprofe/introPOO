package ejercicio1y2;

public class BancoTester {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Cristóbal");
        Cuenta c2 = new Cuenta("Juan Carlos",0);
        Cuenta c3 = new Cuenta("Ian");

        c1.ingreso(1000);
        c1.transferencia(1,c2);
        c2.reintegro(50);
        c3.reintegro(20);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


    }
}
