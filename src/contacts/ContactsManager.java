package contacts;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.exists;

public class ContactsManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String directory = "contacts";
        String contacts = "contacts.txt";
        String parentDirectory = "src";
        Path contactsDirectory = Paths.get(directory);
        Path contactsFile = Paths.get(parentDirectory, directory, contacts);

//        System.out.println(Files.exists(contactsFile));
//        if (Files.exists(cont))
//
//        try {
//            List<String> people = Files.readAllLines(contactsFile);
//            System.out.println(people);
//        } catch (IOException e){
//            System.out.println("Something went wrong.");
//        }

        String userInput;

        try {
            do {
                System.out.println("1. View contacts.\n2. Add a new contact.\n3. Search a contact.\n4. Delete an existing contact.\n5. Exit.");
                System.out.println("Please enter a number");
                userInput = scanner.nextLine();

                switch (userInput) {
                    case "1":
                        List<String> contactInfoList = Files.readAllLines(contactsFile);
                        System.out.println("Name           |Phone     ");
                        for (String x : contactInfoList){
                            String[] spl = x.split(" ");
//                            System.out.println(Arrays.toString(spl));
                            System.out.printf("%15s|%10s\n",spl[0], spl[1]);
                        }
                        break;
                    case "2":
                        System.out.println("What is the name of the new contact?");
                        String name = scanner.nextLine();
                        System.out.println("What is the number of the new contact?");
                        String number = scanner.nextLine();
                        break;
                    case "3":
                        System.out.println();
                        break;
                    case "4":
                        System.out.println();
                        break;
                    case "5":
                        System.out.println("Goodbye. Have a nice day.");
                        break;
                    default:
                        System.out.println("That was not a viable number. Please try again.\n\n");
                }

            } while (!userInput.equals("5"));
        } catch (Exception e){
            System.out.println("Something went wrong");
        } finally {
            scanner.close();
        }


    }
}
