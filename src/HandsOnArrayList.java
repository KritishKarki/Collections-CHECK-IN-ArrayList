import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {
    ArrayList<String> students = new ArrayList<>();

    //Add at least 5 names to the list
    public void addStudent() {
        students.add("John");
        students.add("Jane");
        students.add("Bob");
        students.add("Mary");
        students.add("Jack");
        System.out.println(students);
    }

    public void listIndividualStudents() {
        for (String student : students) {
            System.out.println(student);
        }
    }

    public void removeStudent() {
        students.remove("John");
        System.out.println(students);
    }

    public void sortStudents() {
        Collections.sort(students);
        System.out.println(students);
    }

}
