package DAY03;

import java.util.Scanner;

public class HomeWork03Ver2 {
  
  public static void main(String[] args) {
    System.out.println("Hay nhap so bat ky: ");
    Scanner scanner = new Scanner(System.in);
    int positiveNumber = scanner.nextInt();

    
    int digitSum = 0;

    while (positiveNumber >= 1) {
      int lastDigit = positiveNumber % 10;
      positiveNumber = positiveNumber / 10;
      digitSum = digitSum + lastDigit;
      
    }
    System.out.println(digitSum); 
  }
}
