import java.util.Arrays;

public class ArraysExercises {
    static Person addPerson(Person[] people, Person person){
        return people[people.length + 1] = person;
    }
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

       Person[] people = new Person[3];

       people[0] = new Person("James");
       people[1] = new Person("Peter");
       people[2] = new Person("Linda");

       for (Person name : people){
           System.out.println(name.getName());
       }
    }

}
