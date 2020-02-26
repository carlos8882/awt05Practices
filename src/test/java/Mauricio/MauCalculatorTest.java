package Mauricio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MauCalculatorTest {

    /*
    //En el caso que no tenga metodos con STATIC, debo crear un nuvo objeto y luego llamar al metodo de ese objeto,
    // es al cual le voy a pasar los parametros que quiero testear:
    @Test
    public void sumarDosNumerosTest () {
        //given
        int firstNumber=5;
        int secondNumber=3;
        ProjectCalcu calculadora = new ProjectCalcu();
        //when
        int result= calculadora.sumar(firstNumber,secondNumber);
        //then
        assertEquals(8, result);   //(resultado esperado, resultado obtenido)
    }
    */

    //Para el caso en el que tenemos metodos con Public static void, no necesitamos crear un objeto nuevo,
    // podemos llamar directamente a la funcion:
    @Test
    public void sumarDosNumerosTest() {
        //given
        int firstNumber = 5;
        int secondNumber = 3;
        //when
        int result = ProjectCalcu.sumar(firstNumber, secondNumber);
        //then
        assertEquals(8, result);   //(resultado esperado, resultado obtenido)
    }

    @Test
    public void restarDosNumerosTest() {
        //given
        int firstNumber = 5;
        int secondNumber = 3;
        //when
        int result = ProjectCalcu.restar(firstNumber, secondNumber);
        //then
        assertEquals(2, result);
    }

    @Test
    public void multiplicarDosNumeros() {
        //given
        int firstNumber =5;
        int secondNumber =3;
        //when
        int result=ProjectCalcu.multiplicar(firstNumber,secondNumber);
        //then
        assertEquals(12, result);
    }

    public void dividirDosNumeros() {
        //given
        int firstNumber =9;
        int secondNumber =3;
        //when
        int result=ProjectCalcu.multiplicar(firstNumber,secondNumber);
        //then
        assertEquals(3, result);
    }
}