import java.util.*;

public class Main {
    public static void main(String[] args) {
        TV Samsung = new TV();
        Samsung.info(50, "QLED", 99000,new int[] {148, 80});
        System.out.println(Samsung.infoString());

        TV Toshiba = new TV();
        Toshiba.info(50,"LED", 50000, new int[] {120,75});
        System.out.println(Toshiba.infoString());
    }

}



