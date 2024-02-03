package testingMyProjects;

import java.io.IOException;

/*СОБЕСЕДОВАНИЕ - ЗАДАЧА ПО EXEPTION - В КАКОМ ПОРЯДЕК ВЫВЕДУТСЯ EXEPTION*/
public class ExeptionPrint {

    public static void main(String[] args) throws IOException {

        System.out.println("Start");

      /*  try(method()) {
            System.out.println( " new  www IO Exeption");

        } catch (IOException);

        System.out.println( " new IO Exeption");*/
    }

    private   static void method() throws IOException {

        throw new RuntimeException("IO Exeption");
    }

}
