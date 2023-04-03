import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is %.2f\n", pi);

        Scanner scanner = new Scanner(System.in);
        int usernum;
        String word1;
        String word2;
        String word3;
        int length;
        int width;

        System.out.println("Enter your number");
        usernum = scanner.nextInt();

        System.out.println("Enter three words.");
//        word1 = scanner.next();
//        word2 = scanner.next();
//        word3 = scanner.next();

        word1 = scanner.nextLine();
        word2 = scanner.nextLine();
        word3 = scanner.nextLine();

        System.out.println("Enter the length of the room");
        length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of the room");
        width = Integer.parseInt(scanner.nextLine());

        int perimeter = length + length + width + width;
        System.out.println(perimeter);
    }
}
