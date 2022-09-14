package calculator;

public class Calculator {

    public int addTwoNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println("The sum is: " + sum);
        return sum;
    }

    public int subtractTwoNumbers(int firstNumber, int secondNumber) {
        int subtract = firstNumber - secondNumber;
        System.out.println("The subtract is:" + subtract);
        return subtract;
    }

    public int divideTwoNumbers(int firstNumber, int secondNumber) {
        int divide = firstNumber / secondNumber;
        System.out.println("The divide is:" + divide);
        return divide;
    }

    public int multiplyTwoNumbers(int firstNumber, int secondNumber) {
        int multiply = firstNumber * secondNumber;
        System.out.println("The multiply is: " + multiply);
        return multiply;
    }
}