package ejercicio3;

import ejercicios1y2.Cuenta;

public class ContadorTester {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador(Contador.MAX_VALUE);

//        Cuenta cuenta1 = new Cuenta("Juan Luis");
//        System.out.println(cuenta1.getNumCuenta());


        for (int i = 0; i < 5; i++) {
            c1.incrementa();
            c2.incrementa();
        }

        c2.decrementa();

        System.out.println(c1);
        System.out.println(c2);

    }
}
