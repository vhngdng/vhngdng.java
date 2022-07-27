package DAY03;

public class HomeWork02 {
  public static void main(String[] args) {

    int primeCount = 0;
    int primeTotal = 0;
    int num = 0;
    boolean isPrime = true;
    while (primeCount < 100) {
      num++;
      if (num < 2) {
        isPrime = false;
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

  }


