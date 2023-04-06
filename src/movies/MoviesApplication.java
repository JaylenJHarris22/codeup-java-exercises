package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Press 1 to view all movies or 2 to choose your category.");
        input.getInt(1, 100);
    }
}
