import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int res;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // Считываем символ новой строки после ввода второго числа

        System.out.print("Введите оператор действия: ");
        String symbol = scanner.nextLine(); // Считываем оператор как строку

        if (symbol.equals("+")) {
            res = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + res);
        } else if (symbol.equals("-")) {
            res = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + res);
        } else if (symbol.equals("*")) {
            res = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + res);
        } else if (symbol.equals("/") && num2 != 0) {
            res = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + res);
        } else {
            System.out.println("Некорректный оператор или деление на ноль.");
        }




    }
}
