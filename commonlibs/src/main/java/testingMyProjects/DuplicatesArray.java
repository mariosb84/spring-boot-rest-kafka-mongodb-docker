package testingMyProjects;

/* СОБЕСЕДОВАНИЕ - ЗАДАЧА - НАЙТИ ПЕРВОЕ ПОВТОРЯЮЩЕЕСЯ ЧИСЛО В МАССИВЕ */

import java.util.*;

public class DuplicatesArray {

    public static void main(String[] args) {
       int[] arr = new int[]{4, 5, 1, 4, 7, 8, 9, 10, 8, 10};
       Set<Integer> set = new HashSet<>();
        System.out.println("Первый дубликат в массиве : "
                + (Arrays.stream(arr).boxed().filter(i -> !set.add(i)).findFirst()).get());
    }

}
