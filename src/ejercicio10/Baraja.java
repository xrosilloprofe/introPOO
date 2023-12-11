package ejercicio10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Ejercicio 10. Simula mediante la programación orientada a objetos una baraja española.
 * La baraja debe tener la funcionalidad de barajar (puedes consultar por la web como implementar esta funcionalidad),
 * repartir la carta que esta encima del montón, repartir la que esta debajo.
 * Se asume que una vez se ha empezado a repartir no se puede volver a barajar.
 * Para comprobar el correcto funcionamiento, deberás sobrescribir el método toString() para visualizar el estado de la baraja.
 */
public class Baraja {
    private Carta[] baraja;
    private final String[] palos = {"COPAS", "ESPADAS", "BASTOS", "OROS"};

    public Baraja() {
        baraja = new Carta[12 * 4];
        int j=0;
        for (String palo : palos)
            for (int i = 1; i <= 12; i++) {
                baraja[j++] = new Carta(palo, i);
            }
        barajar();
    }

    private void barajar(){
        List<Carta> listaCartas = Arrays.asList(baraja);
        Collections.shuffle(listaCartas);
        listaCartas.toArray(baraja);
    }

    /**
     * Repartir la carta que esta encima del montón
     * @return
     */
    public Carta repartirEncima(){
        Carta carta = null;
        if(baraja.length>0){
            carta=baraja[0];
            baraja = Arrays.copyOfRange(baraja,1,baraja.length);
        }
        return carta;
    }

    /**
     * Repartir la que esta debajo.
     * @return
     */
    public Carta repartirDebajo(){
        Carta carta = null;
        if(baraja.length>0){
            carta=baraja[baraja.length-1];
            baraja = Arrays.copyOfRange(baraja,0,baraja.length-1);
        }
        return carta;
    }


    @Override
    public String toString() {
        return Arrays.toString(baraja);
    }
}
