import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Tell me something.");
        input = scanner.nextLine();

        String response1 = "Sure.";
        String response2 = "Whoa, chill out!";
        String response3 = "Fine. Be that way!";
        String response4 = "Whatever";

        if (input.equals("")){
            System.out.println(response3);
        } else if (input.charAt(input.length() - 1) == '?') {
            System.out.println(response1);
        } else if (input.charAt(input.length() - 1) == '!') {
            System.out.println(response2);
        } else {
            System.out.println(response4);
        }
    }
}
