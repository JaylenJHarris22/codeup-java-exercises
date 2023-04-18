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
//    public int getInt(int min, int max){
//        int input;
//        do{
//            System.out.println("Enter a number that is within " + min + " and " + max + ".");
//            input = Integer.parseInt(scanner.nextLine());
//        } while (input < min || input > max);
//
//        return input;
//    }
//    public int getInt(){
//        System.out.println("Give me a number.");
//        int input = Integer.parseInt(scanner.nextLine());
//        return input;
//    }

    public int getInt(){
        int number = 0;
        try{
            System.out.println("Give me a number.");
            number = Integer.valueOf(getString());
        } catch (NumberFormatException e){
            System.out.println("That was not a number");
        }
        return number;
    }

    public int getInt(int min, int max){
        int number = 0;
        do{
            System.out.println("Enter a number that is within " + min + " and " + max + ".");
            try{
                System.out.println("Give me a number.");
                number = Integer.valueOf(getString());
            } catch (NumberFormatException e){
                System.out.println("That was not a number");
            }
        } while (number < min || number > max);

        return number;
    }

//    double getDouble(double min, double max){
//        double input;
//        do{
//            System.out.println("Enter a number that is within my range.");
//            input = Double.parseDouble(scanner.nextLine());
//        } while (input < min || input > max);
//
//        return input;
//    }
//    public double getDouble(){
//        System.out.println("Give me a decimal number.");
//        double input = Double.parseDouble(scanner.nextLine());
//        return input;
//    }

    double getDouble(double min, double max){
        double number = 0;
        do{
            System.out.println("Enter a number that is within my range.");
            try{
                System.out.println("Give me a number.");
                number = Double.valueOf(getString());
            } catch (NumberFormatException e){
                System.out.println("That was not a number");
            }
        } while (number < min || number > max);

        return number;
    }
    public double getDouble(){
        double number = 0;
        System.out.println("Give me a decimal number.");
        try{
            System.out.println("Give me a number.");
            number = Double.valueOf(getString());
        } catch (NumberFormatException e){
            System.out.println("That was not a number");
        }
        return number;
    }

    public int getBinary(){
        int number = 0;
        try{
            System.out.println("Give me a number.");
            number = Integer.valueOf(getString(), 2);
        } catch (NumberFormatException e){
            System.out.println("That was not a number");
        }
        return number;
    }

    public int getHex(){
        int number = 0;
        try{
            System.out.println("Give me a number.");
            number = Integer.valueOf(getString(), 16);
        } catch (NumberFormatException e){
            System.out.println("That was not a number");
        }
        return number;
    }
}
