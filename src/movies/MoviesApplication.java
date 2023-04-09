package movies;

import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

//        System.out.println("1 - to view all movies\n2 - to choose animated movies.\n" +
//                "3 - to view drama movies\n4 - to view horror movies\n5 - to view sci-fi movies");
//        int userNum = input.getInt(1, 5);
//
//        if (userNum == 1 ){
//            System.out.println(Arrays.toString(MoviesArray.findAll()));
//        } else if (userNum == 2) {
//            System.out.println(Arrays.toString(MoviesArray.findAll()));
//        }
        Movie[] movies = (MoviesArray.findAll());

        System.out.println((movies[45]));

        System.out.println(Movie.get);

    }
}
