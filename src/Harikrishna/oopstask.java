package Harikrishna;
import java.util.Scanner;
// Abstract class
abstract class Operation {
    protected double operand1;
    protected double operand2;

    public Operation(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // Abstract method for performing the operation
    public abstract double performOperation();
}

// child class for each operation (inheritance)
class Addition extends Operation {
    public Addition(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double performOperation() {
        return operand1 + operand2;
    }
}

class Subtraction extends Operation {
    public Subtraction(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double performOperation() {
        return operand1 - operand2;
    }
}

class Multiplication extends Operation {
    public Multiplication(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double performOperation() {
        return operand1 * operand2;
    }
}

class Division extends Operation {
    public Division(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public double performOperation() {
        if (operand2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return operand1 / operand2;
    }
}0

// encapsulation
class Calculator {
    private double num1;
    private double num2;
    private char operationSymbol;

    public Calculator(double num1, double num2, char operationSymbol) {
        this.num1 = num1;
        this.num2 = num2;
        this.operationSymbol = operationSymbol;
    }

    public double calculate() {
        Operation operation = null;
        switch (operationSymbol) {
            case '+':
                operation = new Addition(num1, num2);
                break;
            case '-':
                operation = new Subtraction(num1, num2);
                break;
            case '*':
                operation = new Multiplication(num1, num2);
                break;
            case '/':
                operation = new Division(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
        return operation.performOperation();
    }
}

// Main class
public class oopstask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // User input for operation
        System.out.println("Choose operation (+, -, *, /): ");
        char operationSymbol = scanner.next().charAt(0);

        // Create a calculator object and perform the calculation
        Calculator calculator = new Calculator(num1, num2, operationSymbol);
        double result = calculator.calculate();

        // Display the result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
