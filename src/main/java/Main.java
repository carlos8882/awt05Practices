import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calcuuuu");
        int a=0;
        int b=0;
        int resp=0;
        int caso=0;

        System.out.println("Ingrese valor a:");
        a=input.nextInt();
        System.out.println("Ingrese valor b:");
        b=input.nextInt();
        System.out.println("Sumar:1  Restar:2  Multiplicar:3  Dividir:4");
        caso=input.nextInt();

        switch (caso){
            case 1:
                resp=sumar(a,b);
                imprimir(resp);
                break;
            case 2:
                resp=restar(a,b);
                imprimir(resp);
                break;
            case 3:
                resp=multiplicar(a,b);
                imprimir(resp);
                break;
            case 4:
                resp=dividir(a,b);
                imprimir(resp);
                break;
        }
    }



    public static int sumar(int a,int b)
    {
        int resp;
        resp=a+b;
        return(resp);
    }

    public static int restar(int a,int b)
    {
        int resp;
        resp=a-b;
        return(resp);
    }
    public static int multiplicar(int a,int b)
    {
        int resp;
        resp=a*b;
        return(resp);
    }

    public static int dividir(int a,int b)
    {
        int resp;
        resp=a/b;
        return(resp);
    }

    public static void imprimir(int r)
    {
        System.out.print("El resultado es: ");
        System.out.println(r);
        System.out.println("!!!");
    }
}