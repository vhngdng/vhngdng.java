

public class HomeWork {
  public static void main(String[] args) {

    String text = "Toi la coder";

    String[] array = text.split(" ");
    for (int index = 0; index < array.length; index++) {
      System.out.println(array[index]);
      String word = array[index];
      if (word.length() > 0) {
        String firstCharacter = word.substring(0, 1);
        firstCharacter = firstCharacter.toUpperCase();
        String last = word.substring(1);
        System.out.println(firstCharacter + last);
      }
    }
  }

}