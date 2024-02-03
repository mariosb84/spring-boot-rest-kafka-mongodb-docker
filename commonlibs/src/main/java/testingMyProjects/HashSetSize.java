package testingMyProjects;

import java.util.HashSet;

/*СОБЕСЕДОВАНИЕ - ЗАДАЧА - КАКОЙ РАЗМЕР ХЭШСЕТА  ВЫВЕДЕТСЯ */
public class HashSetSize {

    public static class  Person {
        String name;
        public Person(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Person masha = new Person("Masha");
        Person ira= new Person("Ira");
        Person nina = new Person("Nina");
        Person masha1 = new Person("Masha");

        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(masha);
        personHashSet.add(nina);
        personHashSet.add(ira);
        personHashSet.add(masha1);

        System.out.println(personHashSet.size());


    }

}
