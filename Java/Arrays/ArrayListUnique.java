//Java program to remove duplicates in a arraylist

import java.util.*;

class ArrayListUnique {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,40,50,30,30,60,10,40,20));
        ArrayList<Integer> unique = new ArrayList<>();
        for (int n : list) {
            if (!unique.contains(n))
                unique.add(n);
        }
        System.out.println(unique);
    }
}