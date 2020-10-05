package ru.luxoft.cources;

public class Main {

    public static void main(String[] args) {
        Calc calc1 = new Calc();
        calc1.getInput();
        //нарушение инкапсуляции. Лучше сделать через getter
        while (!"q".equals(calc1.operation)) {
            //нет необходимости передавать параметры. Это поля инстанса того же объекта в котором находится метод
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

