package FreeStyle;

import java.util.ArrayList;
import java.util.Scanner;

public class WrapperClassArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers || Enter -5 to exit: ");
        int value;

        do {
            value = scanner.nextInt();
            if(!list.contains(value) && (value != -5)) {list.add(value);}
        } while (value != -5);

        System.out.println(list);
    }
}
