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
        return ("The multiplication total is: "+ result);
    }
    public String division(){
        if (secondValue == 0){
            return ("Can't divide by zero");
        }else {
            result = firstValue / secondValue;
            return ("The division total is: " + result);
        }
    }
    public String power(){
        result = Math.pow(firstValue, secondValue);
        return ("The power result is: "+ result);
    }
    public String root(){
        result = Math.pow(firstValue,1/secondValue);
        return ("The root result is: "+result);
    }


}
