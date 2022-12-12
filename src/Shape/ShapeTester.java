package Shape;

import javax.swing.*;
import java.util.ArrayList;

public class ShapeTester {

    public static void main(String[] args) {

        ArrayList  <Shape> shapes = new ArrayList<Shape>();


        ShapeCircle circle1 = new ShapeCircle("Circle", 2.3) ;

        Shape shaperef = circle1;

        shapes.add(shaperef);


        ShapeCircle circle2 = new ShapeCircle("Circle", 9.3) ;

         shaperef = circle2;

        shapes.add(shaperef);


        ShapeSquare square1 = new ShapeSquare("Square", 9.3) ;

        shaperef = square1;

        shapes.add(shaperef);


        ShapeSquare square2 = new ShapeSquare("Square", 9.3) ;

        shaperef = square2;

        shapes.add(shaperef);

        String printout= " ";

        for(int i=0; i<shapes.size(); i++){

            printout += "\n\n\n"+shapes.get(i);
        }

        JOptionPane.showMessageDialog(null, printout);


    }

}
