import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, op;

        System.out.println("Ingrese el primer valor: ");
        a = sc.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        b = sc.nextInt();

        System.out.println("Escoja la operacion que decea realizar: \n" +
                "1:suma 2:Resta 3:Multiplicacion 4:Divicion");
        op = sc.nextInt();

        Operaciones operacion = new Operaciones(a, b);

        switch (op){
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
