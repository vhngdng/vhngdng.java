package DAY03;


import java.util.Scanner;

public class HomeWork03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hay nhap 1 so bat ky: ");
    int number = scanner.nextInt();
    scanner.close();
    String s = String.valueOf(number);
    
    for (int i = 0 ; i < s.length(); i++) {
      int sum = 0;
      char character = s.charAt(i);
      Integer x = Character.getNumericValue(character);
      ;
      while(i < s.length()){
        i++;
      sum = sum + x;
      System.out.println(x);
      }
      System.out.println("Tổng các chữ số là: " + sum);

    }
  }
}