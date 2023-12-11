package ejercicio5;

public class FraccionTester {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(5,5);
        System.out.println(f1);
        Fraccion f2 = new Fraccion(2,5);
//        f1.multiplicar(f2);
//        System.out.println(f1);
        Fraccion f3 = Fraccion.multiplicaS(f1,f2);
        System.out.println(f3);





//        Fraccion fr1 = new Fraccion(2,5);
//        System.out.println(fr1);
//        Fraccion fr2 = new Fraccion(7,3);
//        System.out.println(fr2);
//        Fraccion resultado = Fraccion.sumarFracciones(fr1,fr2);
//        System.out.println(resultado);
//        fr1.sumar(fr2);
//        System.out.println(fr1);
//        fr1.restar(fr2);
//        System.out.println(fr2);
//        fr1.multiplicar(fr2);
//        System.out.println(fr1);
//        fr1.dividir(fr2);
//        System.out.println(fr1);
    }
}
