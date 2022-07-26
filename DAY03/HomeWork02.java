package DAY03;

import java.util.Scanner;

public class HomeWork02 {
  public static void main(String[] args) {

    int primeCount = 0;
    int primeTotal = 0;
    int num = 2;
    while (primeCount <= 100) {
      if (num == 2) {
        // can lam gi?
      }
      boolean isPrime = true;
      for (int i = 2; i <= num / 2; i++) {
        int temp = num % i;
        if (temp == 0) {
          isPrime = false;
          break;
        }
      }
    }
  }
  //     if (isPrime == true) {
  //       for ( int i; i > num 
  //     }
  //     // can lam gi?
  //   }

  // }

}
