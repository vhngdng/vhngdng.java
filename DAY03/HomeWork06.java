package DAY03;

import java.lang.invoke.StringConcatFactory;
import java.lang.reflect.Array;
import java.util.Scanner;

public class HomeWork06 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a sentence: ");
    String str = scanner.nextLine();

    String space = " ";
    String[] strArray = null;

    strArray = str.split(" ");
    String newWord = new String();
    String resultString = new String();

    for (int i = 0; i < strArray.length; i++) {

      str = strArray[i];

      newWord = str.substring(0, 1).toUpperCase() + str.substring(1) + space;

      resultString += newWord;

      System.out.println(newWord);

    }
    System.out.println("Sau khi viet hoa chu cai dau tien: " + resultString);

  }

}
