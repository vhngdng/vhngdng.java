package DAY03;

import java.lang.reflect.Array;
import java.util.Scanner;

public class HomeWork05 {
  public static void main(String[] Args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hãy nhập một chuỗi: ");

    String string = scanner.nextLine();

    String nstr = "";
    for (int j = string.length() - 1; j >= 0; j--) {
      char character = string.charAt(j);

      nstr = nstr + character;
    }
    System.out.println("Reverse String : " + nstr);

  }
}
