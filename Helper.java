import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Helper {
    //method 1
    public static void start(){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        create(shapes);
        display(shapes);
    }

    //method 2
    public static void create(ArrayList<Shape> shapes) {
        // This method creates a list of objects using data stored in text files.

        String fileName = "shape.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        Scanner fileInput = new Scanner(fileReader).useDelimiter(",\\s*|\r\n|\n");

        while(fileInput.hasNext()) {
            String type = fileInput.next();
            // System.out.println(type);

            if (type.equals("Rectangle")) {
                String name = fileInput.next();
                Double length = fileInput.nextDouble();
                Double width = fileInput.nextDouble();
                // System.out.println(name);
                // System.out.println(length);
                // System.out.println(width);
                try{
                    shapes.add(new Rectangle(name, length, width));
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            } else if (type.equals("Circle")) {
                String name = fileInput.next();
                Double radius = fileInput.nextDouble();
                // System.out.println(name);
                // System.out.println(radius);
                try{
                    shapes.add(new Circle(name, radius));
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            } else if (type.equals("Triangle")) {
                String name = fileInput.next();
                Double sideOne = fileInput.nextDouble();
                Double sideTwo = fileInput.nextDouble();
                Double sideThree = fileInput.nextDouble();
                // System.out.println(name);
                // System.out.println(sideOne);
                // System.out.println(sideTwo);
                // System.out.println(sideThree);
                try{
                    Shape shape = new Triangle(name, sideOne, sideTwo, sideThree);
                    shapes.add(shape);
                } catch (InvalidTriangleException ex){
                    // do nothing
                } catch (Exception ex){
                    // do nothing
                }
            } else {
                System.out.println("Invalid input");
            }
        }

        fileInput.close();
    }

    //method 3
    public static void display(ArrayList<Shape> shapes) {
        // This method displays a list of objects.
        for (int i = 0; i < shapes.size(); i++){
            Shape shape = shapes.get(i);
            String type = shape.getClass().getSimpleName();
            if (type.equals("Rectangle")) {
                Rectangle rec = (Rectangle) shape;
                System.out.print(rec.toString() + ", ");
                System.out.print("length: " + rec.getLength() + ", ");
                System.out.print("width: " + rec.getWidth() + ", ");
                System.out.print("area: " + rec.area() + "\n");
            } else if (type.equals("Circle")) {
                Circle cir = (Circle) shape;
                System.out.print(cir.toString() + ", ");
                System.out.print("radius: " + cir.getRadius() + ", ");
                System.out.print("area: " + cir.area() + "\n");
            } else if (type.equals("Triangle")) {
                Triangle tri = (Triangle) shape;
                System.out.print(tri.toString() + ", ");
                System.out.print("sideOne: " + tri.getSideOne() + ", ");
                System.out.print("sideTwo: " + tri.getSideTwo() + ", ");
                System.out.print("sideThree: " + tri.getSideThree() + ", ");
                System.out.print("area: " + tri.area() + "\n");
            } else {
                System.out.println("Invalid shape");
            }
        }
    }
}
