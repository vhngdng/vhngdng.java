package DAY03;

import java.util.Scanner;

public class HomeWork08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Original String: ");
    String str = scanner.nextLine();
    boolean check = true;

    for (int i = 0; i < str.length(); i++) {
      char character = str.charAt(i);
      for(int j = i + 1; j < str.length(); j++){     
        if(check == false){
          check = false;
          break;
        }
        if (character != str.charAt(j)) {
          check = true;
          
        }else{
          check = false;
          break;
        }
     
      }
    }
  System.out.println("Result String : " + check);
  }
}