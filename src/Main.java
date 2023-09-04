import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbersArray = new ArrayList<>();
        LinkedList<Integer> numbersLinked = new LinkedList<>();
        numbersArray.add(3);
        numbersArray.add(4);
        numbersArray.add(5);
        numbersArray.add(6);
        numbersArray.add(7);
        numbersLinked.add(10);
        numbersLinked.add(11);
        numbersLinked.add(12);
        numbersLinked.add(13);
        numbersLinked.add(14);
//        for (Integer el : numbersLinked) {
//            System.out.print(el + ", ");
//        }
//        for (Integer el : numbersArray) {
//            System.out.print(el + ", ");
//        }
        for (int i = numbersLinked.size() - 1; i >= 0; i--){
            System.out.println(numbersLinked.get(i));
        }
    }
}



