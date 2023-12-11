package ejercicio5;

/**
 * Ejercicio 5. Crea una clase Fraccion con métodos para sumar, restar, multiplicar y dividir fracciones.
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(){
        this.numerador=0;
        this.denominador=0;
    }

    public Fraccion(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void sumar(Fraccion fr){
        numerador=(numerador* fr.getDenominador())+(fr.getNumerador()*denominador);
        denominador=denominador* fr.getDenominador();
        simplificar();
    }

    public static Fraccion sumarFracciones(Fraccion fr1, Fraccion fr2){
        int nume=(fr1.getNumerador()*fr2.getDenominador())+(fr2.getNumerador()* fr1.getDenominador());
        int deno=fr1.getDenominador()*fr2.getDenominador();
        Fraccion resultado = new Fraccion(nume,deno);
        return simplificarFracciones(resultado);
    }

    public void restar(Fraccion fr){
        numerador=(numerador* fr.getDenominador())-(fr.getNumerador()*denominador);
        denominador=denominador* fr.getDenominador();
        simplificar();
    }

    public void multiplicar(Fraccion fr){
        numerador *= fr.getNumerador();
        denominador *= fr.getDenominador();
        simplificar();
    }

    public void dividir(Fraccion fr){
        numerador *= fr.getDenominador();
        denominador *= fr.getNumerador();
        simplificar();
    }

    private void simplificar(){
        int min = (numerador<denominador)?numerador:denominador;
        for (int i = min; i >1; i--) {
            if(numerador%i==0 && denominador%i==0){
                numerador /= i;
                denominador /= i;
            }
        }
    }

    private static Fraccion simplificarFracciones(Fraccion fr){
        int min = (fr.getNumerador()<fr.getDenominador())?fr.getNumerador():fr.getDenominador();
        int nume=fr.getNumerador();
        int deno=fr.getDenominador();
        for (int i = min; i >1; i--) {
            if(fr.getNumerador()%i==0 && fr.getDenominador()%i==0){
                nume /= i;
                deno /= i;
            }
        }
        return new Fraccion(nume,deno);
    }


    @Override
    public String toString(){
        return numerador + "/" + denominador;
    }

    public static Fraccion multiplicaS(Fraccion f1, Fraccion f2){
        int nume = f1.getNumerador() * f2.getNumerador();
        int deno = f1.getDenominador()*f2.getDenominador();
        return simplificarFracciones(new Fraccion(nume,deno));
    }

}
