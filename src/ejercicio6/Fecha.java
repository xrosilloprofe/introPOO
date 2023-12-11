package ejercicio6;

/**
 * Ejercicio 6. Crea una clase Fecha. La clase contendrá además los métodos set y get y el método toString,
 * un método para comprobar si la fecha es correcta y otro para modificar la fecha actual por la del día siguiente.
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anyo;

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        if (!fechaOk()) {
            this.dia = 1;
            this.mes = 1;
            this.anyo = 1;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        int aux = this.dia;
        this.dia = dia;
        if (!fechaOk()) {
            this.dia = aux;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13)
            this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public boolean fechaOk() {
        if (mes <= 0 || mes > 12)
            return false;
        if (dia > 0 && dia < 32) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                return true;
            else if (mes == 2) {
                if (dia < 30 && ((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0))
                    return true;
                else if (dia < 29)
                    return true;
            } else if (dia < 31)
                return true;
        }
        return false;
    }

    public void aumentarDia() {
        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia == 31) {
            dia = 1;
            if (mes == 12) {
                mes = 1;
                anyo++;
            } else {
                mes++;
            }
        } else if (mes == 2 && dia >=28) {
            if (dia == 29 && ((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0)) {
                dia = 1;
                mes++;
            } else if (dia == 28 && !((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0)) {
                dia = 1;
                mes++;
            } else {
                dia++;
            }
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30) {
            dia = 1;
            mes++;
        } else {
            dia++;
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anyo;
    }
}
