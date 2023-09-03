import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Введите число в массив");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print("[" + arr[i] + "], ") ;
        }
        System.out.println(" Минимальное занчение: " + min);


    }
}
