package Replits_Practice;
/*
  The LameCalculator class has instance methods that can do simple math operations on two numbers.

the methods are: plus, minus, multiply and divide .

all the methods get two ints then the method does the required math operation and returns the result as an int.

 */
public class CustomClass_193 {
    int number1;
    int number2;

    public int plus(int num1, int num2){
        number1 = num1;
        number2 = num2;
        return num1 + num2;
    }

    public int minus(int num1, int num2 ){
        number1 = num1;
        number2 = num2;
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        number1 = num1;
        number2 = num2;
        return num1 * num2;
    }

    public int divide(int num1, int num2){
        number1 = num1;
        number2 = num2;
        return num1/num2;
    }

}
