import java.util.ArrayList;

public class ShapeArray {

    public static void main (String[] args) {
        ArrayList<Shape> shapeArray = new ArrayList<Shape>();

        Sphere sphere1 = new Sphere(5.0);
        Cone cone1 = new Cone(2.0, 4.0);
        Cylinder cylinder1 = new Cylinder(3, 8);

        shapeArray.add(sphere1);
        shapeArray.add(cone1);
        shapeArray.add(cylinder1);

        for (Shape s: shapeArray)  {
            s.toString();
        }

    }
}
