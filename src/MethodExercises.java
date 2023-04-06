import java.util.Random;
import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
//        System.out.println(Addition(5,5));
//        System.out.println(Subtraction(5, 5));
//        System.out.println(Multiplication(5,5));
//        System.out.println(Division(5,5));
//        RecursionMultiplication(5,0, 5);
//        InRange(1, 100);
//        Factorial(1, 10);
        DiceRoller();
    }
    public static int Addition(int x, int y){
        return x + y;
    }
    public static int Subtraction(int x, int y){
        return x + y;
    }
    public static int Multiplication(int x, int y){
        return x * y;
    }
    public static int Division(int x, int y){
        return x / y;
    }
    public static int Remainder(int x, int y){
        return x % y;
    }

    public static void RecursionMultiplication(int x, int j, int y){
        j += x;
        if (y <= 1){
            System.out.println(j);
            return;
        }
        RecursionMultiplication(x, j, y - 1);
    }

    public static void InRange(int min, int max){
        Scanner scanner = new Scanner(System.in);

        int input;

        do{
            System.out.println("Please enter a number between 1 and 100.");
            input = Integer.parseInt(scanner.nextLine());
        } while (input < min || input > max);
        System.out.println(input);
    }

    public static void Factorial(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int input;
        long fac = 1;

        do {
            System.out.println("Please enter a number between 1 and 10");
            input = Integer.parseInt(scanner.nextLine());
        } while (input < min || input > max);

        for(int j = 1; j <= input; j++){
            fac *= j;
        }
        System.out.println(fac);
    }

    public static void DiceRoller(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int diceSides;

        System.out.println("How many sides do you want for your dice");
        diceSides = Integer.parseInt(scanner.nextLine());

        System.out.println("Dice 1: " + (random.nextInt(diceSides) + 1));
        System.out.println("Dice 2: " + (random.nextInt(diceSides) + 1));
    }
}
