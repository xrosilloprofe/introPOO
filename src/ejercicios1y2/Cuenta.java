package ejercicios1y2;

public class Cuenta {

    private static final String CODIGO_CUENTA="ES33";
    private double saldo;
    private String titular;
    private String numCuenta;
    private static int num;

    public Cuenta(String titular){
        this.titular=titular;
        saldo=50;
        numCuenta = CODIGO_CUENTA+num;
        num++;
    }

    public Cuenta(String titular, double saldo){
        this(titular);
        this.saldo=saldo;
    }

    public double getSaldo(){ return saldo;}
    String getTitular(){ return titular;}
    public String getNumCuenta(){return numCuenta;}
    public void setTitular(String titular){
        this.titular=titular;
    }

    public boolean ingreso(double cantidad){
        if(cantidad>0){
            saldo += cantidad;
            return true;
        }
        return false;
    }

    public boolean reintegro(double cantidad){
        if(cantidad>0 && saldo>=cantidad){
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public boolean transferencia(double cantidad, Cuenta cuentaDestino){
        if(reintegro(cantidad))
            if(cuentaDestino.ingreso(cantidad))
                return true;
        return false;
    }

    @Override
    public String toString(){
        return "Titular: " + titular + " NUMCuenta: " + numCuenta + " y con saldo: " + saldo;
    }

}
