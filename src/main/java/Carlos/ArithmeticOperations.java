package Carlos;

public class Operaciones {
    private double vUno, vDos, resultado;

    public Operaciones(double valorUno, double valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
    }

    public String sumar(){
        resultado = vUno + vDos;
        return("el resultado de la suma es: "+ resultado);
    }
    public String restar(){
        resultado = vUno - vDos;
        return("el resultado de la resta es: "+ resultado);
    }
    public String multiplicar(){
        resultado = vUno * vDos;
        return ("el resultado de la multiplicacion es: "+ resultado);
    }
    public String dividir(){
        resultado = vUno / vDos;
        return ("el resultado de la divicion es: "+ resultado);
    }


}
