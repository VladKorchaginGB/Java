import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        System.out.println("Типы данных");
//        byte num1 = 127;
//        short num2 = 32767;
//        int num3 = 2^31-1;
//        long num4 = 2^63-1;
//
//        float num5 = 3.45f;
//        double num6 = 3.456789;
//
//        char str1 = 'q';
//        String str2 = "qwerty";
//        boolean isHappy = true;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String userName = scan.nextLine();
        System.out.println("Привет! " + userName);
    }
}
