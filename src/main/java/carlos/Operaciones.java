package carlos;

public class Operaciones {
    private double vUno, vDos, resultado;

    public Operaciones(double valorUno, double valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
    }

    public void sumar(){
        resultado = vUno + vDos;
        System.out.println("el resultado de la suma es: "+ resultado);
    }
    public void restar(){
        resultado = vUno - vDos;
        System.out.println("el resultado de la resta es: "+ resultado);
    }
    public void multiplicar(){
        resultado = vUno * vDos;
        System.out.println("el resultado de la multiplicacion es: "+ resultado);
    }
    public void dividir(){
        resultado = vUno / vDos;
        System.out.println("el resultado de la divicion es: "+ resultado);
    }


}
