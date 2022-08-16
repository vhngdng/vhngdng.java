package ChuVi.java.ChuVi.java.ChuVi.java;

public class Rectangle implements Polygon{
    public double length;
    public double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println( "Rectangle: (length =  " + length + ")" + ", (width: " + width + " )" );
        
        
    }
    @Override
    public void calArea() {
        double area = length * width;
     
        System.out.println("Dien tich: " + area);
        
        // TODO Auto-generated method stub

        
    }
    @Override
    public void perimeter() {
        // TODO Auto-generated method stub

         double perimeter = (length + width)*2;
        System.out.println("Chu vi = " + perimeter);
        
    }
}
