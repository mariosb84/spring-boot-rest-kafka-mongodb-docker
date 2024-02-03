package testingMyProjects;

/* СОБЕСЕДОВАНИЕ - ЗАДАЧА - НАЙТИ ПЕРВОЕ ПОВТОРЯЮЩЕЕСЯ ЧИСЛО В МАССИВЕ */

public class DuplicatesArray {

    public static void main(String[] args) {
       int result = 0;
       int[] arr = new int[]{4, 5, 1, 4, 8, 9, 10};

       for (int i = 0;i < arr.length - 1;i++) {
           int j = arr[i + 1];
           if(j == arr[i]) {
               result = j;
               break;
           }
           i++;
       }
        System.out.println("Первое повторяющееся число : " + result);
    }

}
