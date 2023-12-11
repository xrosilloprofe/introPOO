package ejercicio7;

import java.util.Scanner;

public class NIFTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el DNI: ");
        int numero = scanner.nextInt();
        NIF nif = new NIF(numero);
        System.out.println(nif);
    }
}
