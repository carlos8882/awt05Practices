package Mauricio;

import java.util.Scanner;

public class ProjectCalcu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calcu V2");
        int a = 0;
        int b = 0;
        int resp = 0;
        int caso = 1;
        int op=0;

        String ini="9+3";
        System.out.println("Ingrese la operacion:");
        ini = input.nextLine();
        char[] charArray = ini.toCharArray();

        for(int count=0;count<charArray.length;count++) {
            if(count==0)
                a=charArray[0];
            if(count==1)
                op=charArray[1];
            if(count==2)
                b=charArray[2];
        }

        if(op==43)
            caso=1;
        if(op==45)
            caso=2;
        if(op==42)
            caso=3;
        if(op==47)
            caso=4;

        a=Character.getNumericValue(a);
        b=Character.getNumericValue(b);

        /*
        for(int count=0;count<charArray.length;count++) {
            System.out.print(" "+charArray[count] );
        }
          */

        switch (caso) {
            case 1:
                resp = sumar(a, b);
                imprimir(resp);
                break;
            case 2:
                resp = restar(a, b);
                imprimir(resp);
                break;
            case 3:
                resp = multiplicar(a, b);
                imprimir(resp);
                break;
            case 4:
                resp = dividir(a, b);
                imprimir(resp);
                break;
        }
    }


    public static int sumar(int a, int b) {
        int resp;
        resp = a + b;
        return (resp);
    }

    public static int restar(int a, int b) {
        int resp;
        resp = a - b;
        return (resp);
    }

    public static int multiplicar(int a, int b) {
        int resp;
        resp = a * b;
        return (resp);
    }

    public static int dividir(int a, int b) {
        int resp;
        resp = a / b;
        return (resp);
    }

    public static void imprimir(int r) {
        System.out.print("El resultado es: ");
        System.out.print(r);
        System.out.println("!!!");
    }
}

