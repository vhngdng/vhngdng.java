import java.util.Scanner;

import ChuVi.java.ChuVi.java.ChuVi.java.Rectangle;
import ChuVi.java.ChuVi.java.ChuVi.java.Square;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap length of rectangle: ");
        double lengthOfRectangle = scanner.nextDouble();

        System.out.println("Hay nhap width of rectangle: ");
        double widthOfRectangel = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(lengthOfRectangle, widthOfRectangel);

        System.out.println("Hay nhap length of square: ");
        double lengthOfSquare = scanner.nextDouble();

        


        Square square = new Square(lengthOfSquare);
        
        rectangle.display();
        rectangle.calArea();
        rectangle.perimeter();

        square.display();
        square.calArea();
        square.perimeter();
        scanner.close();
    }
}
