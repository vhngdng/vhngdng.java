import java.util.Scanner;

public class Test {
  static Scanner scanner;

  static void initScanner() {
    scanner = new Scanner(System.in);
    System.out.println("khoi tao scanner");
  }

  static void closeScanner() {
    scanner.close();
    System.out.println("dong scanner");
  }

  static void bai1() {
    // Scanner scanner = new Scanner(System.in);
    boolean negative = true;

    do {
      System.out.println("Hay chon 1 so nguyen duong bat ky: ");
      int number = scanner.nextInt();
      if (number > 0) {
        System.out.println("So ban chon la so: " + number);
        negative = false;

        // scanner.close();
        for (int i = 1; i <= number; i++) {
          System.out.println(i);
        }
        int sum = number * (number + 1) / 2;
        System.out.println("Tong cua cac so nguyen duong la: " + sum);

      } else {
        System.out.println(number + " không phải số nguyên dương");
      }
    } while (negative == true);

  }

  static void bai2() {
    int primeCount = 0;
    int primeTotal = 0;
    int num = 0;
    // boolean isPrime = true;
    while (primeCount < 100) {
      num++;
      if (num < 2) {
        // isPrime = false;

      } else if (num == 2) {
        primeCount = 1;
        System.out.println("So nguyen to la: 2");
        primeTotal = primeTotal + num;

      } else if (num > 2) {
        for (int i = 2; i < num; i++) {
          int temp = num % i;
          if (temp == 0) {
            break;
          }

          if (primeCount < 100 && temp != 0 && i == num - 1) {
            int prime = num;
            primeCount++;
            System.out.println("So nguyen to la: " + prime);
            primeTotal = primeTotal + num;

          }

        }

      }

    }
    System.out.println("Tong 100 so nguyen to dau tien la: " + primeTotal);
  }

  static void bai3() {
    // Scanner scanner = new Scanner(System.in);
    System.out.println("Hay nhap 1 so bat ky: ");
    int number = scanner.nextInt();
    scanner.close();
    String s = String.valueOf(number);
    int sum = 0;

    for (int i = 0; i < s.length(); i++) {

      char character = s.charAt(i);
      Integer x = Character.getNumericValue(character);

      sum = sum + x;
      System.out.println("Tổng các chữ số là: " + sum);
    }
    System.out.println("Tổng các chữ số là: " + sum);
  }

  public static void main(String[] args) {
   
  }
}
