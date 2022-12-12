package Shape;

public class ShapeSquare extends Shape {


    double width;



    public  ShapeSquare(String type, double width){

        super(type);
        setWidth(width);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }


    public double area() {
        return width*4;
    }

    @Override
    public String toString() {
        return super.toString()+ getWidth()+ area();
    }
}
