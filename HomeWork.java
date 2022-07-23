
public class HomeWork {
  public static void main(String[] args) {
    double randomNumber = Math.random();
    double a = 100 * randomNumber;
    System.out.println((byte) a);   
    
    



     double doubleNum = 123.4;
    String string = Double.toString(doubleNum);
    String x2 = string.replace("." , "");
   
    double x3 = Double.parseDouble(x2);
    
    
    boolean x4 = x3 >=1_000;
    System.out.println(x4);

  }

 

  

}