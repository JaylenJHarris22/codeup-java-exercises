package shapes;

public class Square extends Rectangle{
    int side;

    public Square(int side){
        super(side, side);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public int getPerimeter() {
        return side * 4;
    }
}
