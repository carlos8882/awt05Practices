import java.util.Scanner;

public class Main {
    public static void main(String[] dhpp) {
        double primerOperando = 0, segundoOperando = 0;
        String operacion = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primer numero: ");
        primerOperando = sc.nextInt();

        System.out.println("Ingrese Segundo numero: ");
        segundoOperando = sc.nextInt();

        System.out.println("Ingrese caracter para operador(+,-,*,/): ");
        operacion = sc.next();

        double resultadoOperacion = ope(primerOperando,segundoOperando,operacion);
        System.out.println("Resultado: "+resultadoOperacion);

    }
    public static double ope(double j, double k, String op){
        double res = 0;
        switch (op){
            case "+": res = j+k;
            case "-": res = j-k;
            case "*": res = j*k;
            case "/": res = j/k;
            default: break;
        }
        return res;
    }
}
