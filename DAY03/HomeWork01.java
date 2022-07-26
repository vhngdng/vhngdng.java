package DAY03;

import java.util.Scanner;

public class HomeWork01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean negative = true;

    do {
      System.out.println("Hay chon 1 so nguyen duong bat ky: ");
      int number = scanner.nextInt();
      if (number > 0) {
        System.out.println("So ban chon la so: " + number);
        negative = false;

        scanner.close();
        for ( int i = 1; i <= number ; i++ ){
          System.out.println(i.toString) ;
        }
        int sum = number * (number + 1) / 2;
        System.out.println("Tong cua cac so nguyen duong la: " + sum);

      }else {
        System.out.println(number + " không phải số nguyên dương");
      }
    } while (negative == true);

  }
}
