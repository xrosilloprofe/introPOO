package ejercicios1y2;

public class Tarjeta {
    private static final String TIPO_TARJETA = "542397";
    private Cuenta cuentaAsociada;
    private String titular;
    private String numTarjeta;
    private static int num;
    private double saldo;
    private double limite;

    public Tarjeta(Cuenta cuentaAsociada, double limite){
        this.cuentaAsociada=cuentaAsociada;
        this.titular= cuentaAsociada.getTitular();
        this.numTarjeta=TIPO_TARJETA+num;
        num++;
        this.limite=limite;
        this.saldo=0;
    }

    public Tarjeta(Cuenta cuentaAsociada, double limite, String titular){
        this(cuentaAsociada,limite);
        this.titular=titular;
    }

    public Cuenta getCuentaAsociada(){
        return cuentaAsociada;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public void setLimite(double limite){
        this.limite=limite;
    }

    public boolean pagoDebito(double importe){
        return cuentaAsociada.reintegro(importe);
    }

    public boolean pagoCredito(double importe){
        if(importe>0 && (limite-saldo)>=importe){
            saldo+=importe;
            return true;
        }
        return false;
    }

    public boolean liquidacion(){
        if(cuentaAsociada.reintegro(saldo)){
            saldo = 0;
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        return numTarjeta + " de: " + titular + " limite: " + limite + " saldo: " + saldo + " \n cuenta asociada: " + cuentaAsociada.toString();
    }

}
