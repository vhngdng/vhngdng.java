package ChuVi.java.ChuVi.java.ChuVi.java;

public class Square implements Polygon {
    public double length;
    public Square(double length) {
        this.length = length;
        
    }

    public double width;
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println( "Square: (length =  " + length + ")" + ", (width: " + width + " )" );
        
    }

    @Override
    public void calArea() {
        // TODO Auto-generated method stub
        double area = length * length;
     
        System.out.println("Dien tich la: " + area);
        
    }

    @Override
    public void perimeter() {
        // TODO Auto-generated method stub
        double perimeter = (length + length)*2;
        System.out.println(" Chu vi la: " + perimeter);
    }
    
}
