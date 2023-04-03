import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        long j = 2;
        long usernum;
        int grade;
        Scanner scanner = new Scanner(System.in);

//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
//
//        do{
//            System.out.println(j);
//            j *= j;
//        }while (j <= 1000000);


//        for ( int x = 5; x <= 15; x++){
//            System.out.println(i);
//            i++;
//        }
//
//        for (int y = 0; j < 1000000; y++){
//            System.out.println(j);
//            j *= j;
//        }
//
//        for (int q = 1; q <= 100; q++) {
//            if (q % 3 == 0 & q % 5 == 0) {
//                System.out.println("Fizzbuzz");
//            } else if (q % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (q % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//            System.out.println(q);
//            }
//        }

//        System.out.println("Please enter a number");
//        usernum = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Number  |  Squared  |  Cubed  ");
//        System.out.println("--------| --------  | --------");
//
//        for ( int z = 1; z <= usernum; z++){
//            System.out.println("" + z + "   |" + (z * z) + "    |" + (z * z * z) + "    |");
//        }

        System.out.println("Enter your grade.(Between 0 and 100)");
        grade = Integer.parseInt(scanner.nextLine());

        if ( grade <= 100 & grade >= 88){
            System.out.println("You got an A");
        } else if (grade <= 87 & grade >= 80) {
            System.out.println("You got a B");
        } else if (grade <= 79 & grade >= 67) {
            System.out.println("You got a C");
        } else if (grade <= 66 & grade >= 60) {
            System.out.println("You got a D");
        }else {
            System.out.println("You got an F");
        }
    }
}
