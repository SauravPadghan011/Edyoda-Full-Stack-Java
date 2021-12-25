package edyoda.Assignment7;

import java.util.ArrayList;
import java.util.List;

public class EvenStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        List<Integer> res = new ArrayList<>(numbers);

        res.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
