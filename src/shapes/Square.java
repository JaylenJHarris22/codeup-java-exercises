package shapes;

public class Square extends Quadrilateral{
    protected double length;
    protected double width;

    Square(double length, double width){
        super(length, width);
        this.length = length;
        this.width = width;
    }

    @Override
    protected void setLength() {
        this.length = length;
    }

    @Override
    protected void setWidth() {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
