import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();

        int compPick = ran.nextInt(101) + 1;
        int guess;
        int guessIteration = 0;

        do {
            System.out.println("Guess a number between 1 and 100");
            guess = Integer.parseInt(scanner.nextLine());

            if (guess < compPick){
                System.out.println("HIGHER");
            } else if (guess > compPick) {
                System.out.println("LOWER");
            }else if (guess == compPick) {
                System.out.println("Good guess");
                System.out.println("This took you " + guessIteration + " guesses.");
            }

            guessIteration++;
        } while (guess != compPick);


    }
}
