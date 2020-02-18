import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valorUno, valorDos, seleccion;
        
        System.out.print("Ingrese el primer valor: ");
        valorUno = in.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        valorDos = in.nextInt();

        System.out.println("Escoja la operacion que decea realizar: \n" +
                "1:suma 2:Resta 3:Multiplicacion 4:Divicion");
        seleccion = in.nextInt();

        Operaciones operacion = new Operaciones(valorUno, valorDos);

        switch (seleccion){
            case 1: operacion.sumar();
                    break;
            case 2: operacion.restar();
                    break;
            case 3: operacion.multiplicar();
                    break;
            case 4: operacion.dividir();
                    break;
            default:
                System.out.println("Seleccion invalida");
        }

    }
}
