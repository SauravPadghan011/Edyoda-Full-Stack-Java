package edyoda.Assignment5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: ");
        int num1 = scan.nextInt();
        if(list.contains(num1)) {
            System.out.println(num1 + " is present in list");
        } else {
            System.out.println(num1 + " is not present in list");
        }
    }
}
