package carlos;
import java.util.Scanner;

public class Calculator {

      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String term, op;
        double a, b;
        System.out.println("Por favor introdusca la operacion que decea realizar: ");
        term = sc.nextLine();

        for(int i = 0; i< term.length(); i++) {
            if("/*-+".contains(term.charAt(i)+"")){
                a = Double.parseDouble(term.substring(0,i));
                op = term.substring(i,i+1);
                if (term.substring(i+1).length() != 0) {
                    b = Double.parseDouble(term.substring(i + 1));
                }else {
                    System.out.println("Operacion mal introducida");
                    break;
                }
               Operaciones operaciones = new Operaciones(a,b);
                switch (op){
                    case "+": operaciones.sumar();
                        break;
                    case "-": operaciones.restar();
                        break;
                    case "*": operaciones.multiplicar();
                        break;
                    case "/": operaciones.dividir();
                        break;
                    default:
                        System.out.println("Introduccion de datos erroneo");
                }
            }
            System.out.println("No se realizo ninguna operacion el numero introducido es: "+ term);
            break;
        }


    }
}
