package Shape;

public class ShapeCircle extends Shape {


    double radius;



    public  ShapeCircle(String type, double radius){

        super(type);
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double area() {
        return radius*Math.PI;
    }

    @Override
    public String toString() {
        return super.toString()+ getRadius()+ area();
    }
}
