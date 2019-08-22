package com.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class CalculatorDriver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Calculator!");

        System.out.print("Enter operand 1: ");
        Double op1 = scan.nextDouble();

        System.out.print("Enter operand 2:");
        Double op2 = scan.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        String operator = scan.next();

        Double result;
        switch (operator) {

            case "+" :
                result = op1 + op2;
                break;

            case "-" :
                result = op1 - op2;
                break;

            case "*" :
                result = op1 * op2;
                break;

            case "/" :
                result = op1 / op2;
                break;

            case "%" :
                result = op1 % op2;
                break;

            default :
                result = Double.NEGATIVE_INFINITY;

        }

        System.out.println(new StringBuilder().append("Result is: ").append(result).toString());
    }
}
