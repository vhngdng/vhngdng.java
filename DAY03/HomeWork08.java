package DAY03;

import java.util.Scanner;



public class HomeWork08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Original String: ");
    String str = scanner.nextLine();
    boolean check = false;

    for (int i = 0; i < str.length() - 1; i++) {
      char character = str.charAt(i);
      
        if(character == str.charAt(i + 1)){
          check = false;
          break;
        }else{
          check = true;
        }
      }
      
     
      System.out.println("Result String :" + check);
      
}

}

