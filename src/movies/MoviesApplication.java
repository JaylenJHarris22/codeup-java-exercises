package movies;

import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        int userNum;

        do {System.out.println("0 - exit\n1 - to view all movies\n2 - to choose animated movies.\n" +
                "3 - to view drama movies\n4 - to view horror movies\n5 - to view sci-fi movies\n6 - add movie");
            userNum = input.getInt(0, 6);
            if (userNum == 1 ){
                for( Movie movie : MoviesArray.findAll()){
                    System.out.println(movie + "\n\n");
                }
            } else if (userNum == 2) {
                for( Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equals("animated")){
                        System.out.println(movie + "\n\n");
                    }
                }
            } else if (userNum == 3) {
                for( Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equals("drama")){
                        System.out.println(movie + "\n\n");
                    }
                }
            } else if (userNum == 4) {
                for( Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equals("horror")){
                        System.out.println(movie + "\n\n");
                    }
                }
            } else if (userNum == 5) {
                for( Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equals("scifi")){
                        System.out.println(movie + "\n\n");
                    }
                }
            } else if (userNum == 6) {
                for( Movie movie : MoviesArray.findAll()){
                    if (movie.getCategory().equals("scifi")){
                        System.out.println(movie + "\n\n");
                    }
                }
            }
        } while (userNum !=6);
    }
}
