

public class Main {
  int globalVar;
  public static void main(String[] args) {
    float temp;
    double dNumber;
    boolean yesno;

    int globalVar = 2;
    System.out.println(globalVar);

    System.out.println("Hello World");
    System.out.println("Hello Java");
    System.out.print("Hello Java again");
    System.out.println("Xin chào mọi người");
   
    byte a = 5;
    short b = 10;
    int c = (a + b);
    System.out.println(c);

    char d = 65;
    System.out.println(d);

    long longNumber = 23902123L;
    System.out.println(longNumber);

    float floatNumber = 23.45435346f;
    System.out.println(floatNumber);

    double doubleNumber = 12.34535;
    System.out.println(doubleNumber);

    boolean booleanValue = false;
    System.out.println(booleanValue);
  
    temp = 13.0f;
  
    float temp1;
    temp1 = 16.3f;
    
    System.out.println(temp);
    System.out.println(temp1);
    
    dNumber = 10.4;



    //camelCase

    int camelCase;




    byte byteNumber = 5;
    short shortNumber = byteNumber;

    System.out.println(shortNumber);

    longNumber = byteNumber ;

    System.out.println(longNumber);


    double height = 1.7;
    int heightInt = (int)height;

    System.out.println(heightInt);

    long weight = 100;
    int weightInt = (int)weight;
    System.out.println(weightInt);

    final float piNumber = 3.14f;
  

    boolean h = a == b;
    System.out.println(h);


    //c +=a => c = c + a
    // c-= => c = c - a


    boolean result = height == heightInt;
    System.out.println(result);

    System.out.println(height >= heightInt);

    weight++;
    System.out.println(weight);

    weight--;
    System.out.println(weight);

    boolean andResult = (100 > 40) && ((30 > 10) || (5 > 10));
    System.out.println(andResult);

    double randomNum = Math.random();
    System.out.println(randomNum);


    short t = 12345;
    boolean k = t>=1000;
    System.out.println(k);

  }
 
}