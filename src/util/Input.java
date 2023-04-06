package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    String getString(){
        System.out.println("Give me your favorite word.");
        String input = scanner.nextLine();
        return input;
    }
    boolean yesNo(){
        System.out.println("Do you like cats and dogs?");
        String input = scanner.nextLine();
        if (input.equals("yes") || input.equals("y")){
            return true;
        }
        return false;
    }
    int getInt(int min, int max){
        int input;
        do{
            System.out.println("Enter a number that is within my range.");
            input = Integer.parseInt(scanner.nextLine());
        } while (input < min || input > max);

        return input;
    }
    int getInt(){
        System.out.println("Give me a number.");
        int input = Integer.parseInt(scanner.nextLine());
        return input;
    }
    double getDouble(double min, double max){
        double input;
        do{
            System.out.println("Enter a number that is within my range.");
            input = Double.parseDouble(scanner.nextLine());
        } while (input < min || input > max);

        return input;
    }
    public double getDouble(){
        System.out.println("Give me a decimal number.");
        double input = Double.parseDouble(scanner.nextLine());
        return input;
    }

}
