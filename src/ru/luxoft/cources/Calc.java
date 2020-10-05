package ru.luxoft.cources;

import java.util.Scanner;

public class Calc {
    int firstNumber;
    int secondNumber;
    String operation = "";
    double result;

    Scanner scanner = new Scanner(System.in);

    public Calc() {
        this.firstNumber = 0;
        this.secondNumber = 0;
        this.result = 0;
    }

    //метод ничего не возвращает, поэтому не может называться get...
    public void getInput() {
        firstNumber = 0;
        secondNumber = 0;
        System.out.println("Please enter your example (format: a + b) or type 'q' for quit. \nSupported operations: + - / * !");
        if (scanner.hasNextInt()) {
            firstNumber = scanner.nextInt();
        } else if ("q".equals(scanner.next())) { // when 'q' was entered first for quit
            System.out.println("\nYou typed 'q' for quit.");
            operation = "q";
            return;
        }
        operation = scanner.next();
        if (!"!".equals(operation)) { // if not factorial then expect secondNumber
            if (scanner.hasNextInt()) {
                secondNumber = scanner.nextInt();
            }
        }
    }

    public void calculate(int num1, int num2, String op) {
        switch (operation) {
            case "+":
                result = plus(firstNumber, secondNumber);
                System.out.println("Result: " + result + "\n\n");
                break;
            case "-":
                result = minus(firstNumber, secondNumber);
                System.out.println("Result: " + result + "\n\n");
                break;
            case "*":
                result = ymn(firstNumber, secondNumber);
                System.out.println("Result: " + result + "\n\n");
                break;
            case "/":
                if (secondNumber != 0) {
                    result = del(firstNumber, secondNumber);
                    System.out.println("Result: " + result + "\n\n");
                } else System.out.println("Division by zero is not allowed!");
                break;
            case "!":
                result = fact(firstNumber);
                System.out.println("Result: " + result);
                break;
            default:
                result = 0;
                System.out.println("\nYou entered incorrect or unsupported operation! \n");
                break;
        }
    }

    private static int plus(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    private static int minus(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    private static int ymn(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    private static int del(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    private static int fact(int numberOne) {
        int res = 1;
        for (int i = 1; i <= numberOne; i++) {
            res *= i;
        }
        return res;
    }
}


