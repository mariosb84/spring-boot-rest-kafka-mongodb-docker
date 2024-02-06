package testingMyProjects;

import java.io.IOException;

/*СОБЕСЕДОВАНИЕ - ЗАДАЧА ПО EXEPTION - В КАКОМ ПОРЯДЕК ВЫВЕДУТСЯ EXEPTION*/
public class ExeptionPrint {

    public static void main(String[] args) {

        System.out.println("Start");

        try {
            System.out.println( " new  IO Exeption");
            System.out.println( " new  1 IO Exeption");
            System.out.println( " new  11 IO Exeption");
            method();
            System.out.println( " new  111 IO Exeption");
            System.out.println( " new  1111 IO Exeption");
            System.out.println( " new  11111 IO Exeption");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println( " new 222 IO Exeption");
        System.out.println( " new 333 IO Exeption");
        System.out.println( " new 444 IO Exeption");
    }

    private static void method() throws IOException {

        throw new IOException("new method IO Exeption");
    }

}
