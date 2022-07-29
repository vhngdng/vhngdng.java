package DAY03;

import java.util.Scanner;

public class HomeWork04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hãy nhập 1 số bất kỳ: ");
    int number = scanner.nextInt();
    
    System.out.println("Bảng cửu chương của " + number + " là: ");
    
    for (int i = 1; i <= 10; i++) {
      int multi = number * i;
      System.out.println(number + " x " + i + " = " + multi);
    }

  }
}
