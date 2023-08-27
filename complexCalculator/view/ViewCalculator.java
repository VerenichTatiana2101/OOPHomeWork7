package complexCalculator.view;

import java.util.Scanner;

import complexCalculator.calc.Calculable;
import complexCalculator.model.Complex;

public class ViewCalculator {
    private final Calculable<Complex> calculator;

    public ViewCalculator(Calculable<Complex> calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            Complex firstNum = quest();
            Complex secondNum = quest();
            while (true) {
                String operation = prompt("Выберите операцию (+, -, *, /) : ");
                if (operation.equals("+")) {
                    System.out.println(String.format("Результат: (%s) + (%s) = (%s)", firstNum, secondNum,
                            calculator.sum(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("-")) {
                    System.out.println(String.format("Результат: (%s) - (%s) = (%s)", firstNum, secondNum,
                            calculator.difference(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("*")) {
                    System.out.println(String.format("Результат: (%s) * (%s) = (%s)", firstNum, secondNum,
                            calculator.multiplication(firstNum, secondNum)));
                    break;
                }
                if (operation.equals("/")) {
                    System.out.println(String.format("Результат: (%s) / (%s) = (%s)", firstNum, secondNum,
                            calculator.division(firstNum, secondNum)));
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equalsIgnoreCase("Y")) {
                continue;
            }
            break;
        }
    }

    static Complex quest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действительную часть комплексного числа: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Ошибка! Введите число: ");
            sc.next();
        }
        Double real = sc.nextDouble();
        System.out.println("Введите мнимую часть комплексного числа: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Ошибка! Введите число: ");
            sc.next();
        }
        Double imaginary = sc.nextDouble();
        return new Complex(real, imaginary);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
