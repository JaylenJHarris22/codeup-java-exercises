package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble());

        System.out.printf("Here is the circumference: %02f\n", circle.getCircumference());
        System.out.printf("Here is the area: %02f", circle.getArea());
    }
}
