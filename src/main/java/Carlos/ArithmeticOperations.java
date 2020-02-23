package Carlos;

public class ArithmeticOperations {
    private double firstValue;
    private double secondValue;
    private double result;

    public ArithmeticOperations(double firstValue, double secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public String sum(){
        result = firstValue + secondValue;
        return("The sum total is: "+ result);
    }
    public String subtraction(){
        result = firstValue - secondValue;
        return("The subtraction total is: "+ result);
    }
    public String multiplication(){
        result = firstValue * secondValue;
        return ("The multiplication total is: : "+ result);
    }
    public String division(){
        result = firstValue / secondValue;
        return ("The division total is: "+ result);
    }


}
