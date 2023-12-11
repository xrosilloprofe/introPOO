package ejercicio7;

/**
 * Ejercicio 7. Crea una clase NIF. Los atributos serán el número de DNI y la letra.
 * La clase contendrá un método privado que calcule la letra del NIF a partir del número de DNI
 */
public class NIF {
    int numero;
    char letra;

    public NIF(int numero) {
        this.numero = numero;
        calcularLetra();
    }

    private void calcularLetra(){
        char[] letters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        letra = letters[numero%23];
    }

    public int getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    @Override
    public String toString() {
        return String.valueOf(numero) + letra;
    }
}
