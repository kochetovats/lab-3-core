package ru.luxoft.cources;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

       public static void main(String[] args) {
           Calc calc1 = new Calc();
           calc1.getInput();
           while(!"q".equals(calc1.operation)) {
               calc1.calculate(calc1.firstNumber, calc1.secondNumber, calc1.operation);
               calc1.getInput();
           }
         /*
                System.out.println("Your result: " + result);
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input data!");
                continue;
            }

        }*/
    }


}

