//Java program on Arraylist. Finding max and min elements in a ArrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(15, 89, 42, 7, 63));
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}