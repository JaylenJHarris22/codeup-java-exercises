package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();
        Student student = new Student("James" );
        student.addGrade(78);
        student.addGrade(84);
        student.addGrade(97);
        student.recordAttendance("2020-09-22", "A");
        student.recordAttendance("2020-09-23", "P");
        student.recordAttendance("2020-09-24", "P");
        Student student2 = new Student("Donnny" );
        student2.addGrade(58);
        student2.addGrade(75);
        student2.addGrade(95);
        student2.recordAttendance("2020-09-22", "P");
        student2.recordAttendance("2020-09-23", "P");
        student2.recordAttendance("2020-09-24", "P");
        Student student3 = new Student("Sam" );
        student3.addGrade(90);
        student3.addGrade(99);
        student3.addGrade(97);
        student3.recordAttendance("2020-09-22", "P");
        student3.recordAttendance("2020-09-23", "A");
        student3.recordAttendance("2020-09-24", "P");
        Student student4 = new Student("Kevin" );
        student4.addGrade(45);
        student4.addGrade(88);
        student4.addGrade(79);
        student4.recordAttendance("2020-09-22", "A");
        student4.recordAttendance("2020-09-23", "A");
        student4.recordAttendance("2020-09-24", "P");
        Scanner scanner = new Scanner(System.in);
        String user;
        String cont;

        students.put("Jman4572", student);
        students.put("YoungDon2Drippy", student2);
        students.put("SamWise.brain", student3);
        students.put("Kevo4Prez", student4);

        do {
            System.out.println("Welcome to the Grade portal");
            System.out.println("The current list of students are :");
            System.out.println("|Jman4572| |YoungDon2Drippy| |SamWise.brain| |Kevo4Prez|");
            System.out.println("What student would you like to see more info on?");
            user = scanner.nextLine();

            if (!students.containsKey(user)) {
                System.out.println("That student does not exist\n");
            } else {
                System.out.printf("Name: %s     Username: %s    Class Average: %.02f    Attendance: %.02f\n", students.get(user).getName(), user, students.get(user).getGradeAverage(), students.get(user).attendancePer());
                System.out.printf("Days Missing: %s\n", students.get(user).daysMissing());

            }

            System.out.println("If you would like to quit press Q, otherwise press another button.");
            cont = (scanner.nextLine().toLowerCase());

            if (cont.equals(String.valueOf('q'))) {
                System.out.println("Goodbye, and have a wonderful day!");
            }
        }while (!cont.equals(String.valueOf('q'))) ;
    }
}
