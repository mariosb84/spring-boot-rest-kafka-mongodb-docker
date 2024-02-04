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

        HashSet<String> personHashSet = new HashSet<>();
        personHashSet.add(masha.name);
        personHashSet.add(nina.name);
        personHashSet.add(ira.name);
        personHashSet.add(masha1.name);

        HashSet<Person> personHashSet2 = new HashSet<>();
        personHashSet2.add(masha);
        personHashSet2.add(nina);
        personHashSet2.add(ira);
        personHashSet2.add(masha1);

        System.out.println(personHashSet.size());
        System.out.println(personHashSet2.size());
        System.out.println(personHashSet2.stream().findAny().get().name);


    }

}
