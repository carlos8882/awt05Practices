public class Main {

    public static void main()
    {
        int a=2;
        int b=3;
        int resp=0;
        int caso=1;

        switch (caso){
            case 1:
                resp=sumar(a,b);
                System.out.print(resp);
                break;
            case 2:
                resp=restar(a,b);
                System.out.print(resp);
                break;
            case 3:
                resp=multiplicar(a,b);
                System.out.print(resp);
                break;
            case 4:
                resp=dividir(a,b);
                System.out.print(resp);
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

}
