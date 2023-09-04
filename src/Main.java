import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int[] leng = new int[]{1, 2, 3, 4, 5, 6};
    int res = sumArray(leng);
        System.out.println(res);
    }
    public static int sumArray(int[] arr){
        int sum = 0;
        for(int el : arr){
            sum+=el;
        }
        return sum;
    }
}



