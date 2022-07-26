package DAY03;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import org.w3c.dom.Text;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /*
     * System.out.println("Hãy nhập cân nặng: ");
     * double weight;
     * weight = sc.nextDouble();
     * 
     * System.out.println("Hãy nhập chiều cao: ");
     * double height;
     * height = sc.nextDouble();
     * 
     * double BMI = weight / Math.pow(height, 2);
     * System.out.println("BMI = " + BMI);
     * 
     * if (BMI < 18.5) {
     * System.out.println("Thiếu cân");
     * } else if ((18.5 <= BMI) && (BMI <= 24.9)) {
     * System.out.println("Cân đối");
     * } else {
     * System.out.println("Thừa cân");
     * }
     * 
     * }
     * 
     */

    /*
     * String season = new String("SUMMER");
     * switch (season) {
     * case "Spring": {
     * System.out.println("Mùa xuân");
     * break;
     * }
     * case "SUMMER": {
     * System.out.println("Mùa hè");
     * break;
     * }
     * case "AUTUMN": {
     * System.out.println("Mùa thu");
     * break;
     * }
     * case "WINTER": {
     * System.out.println("Mùa đông");
     * break;
     * }
     * default:
     * System.out.println("Không có mùa này");
     * break;
     * 
     * }
     * }
     */

    /*
     * System.out.println("Hãy nhập tháng");
     * 
     * int month = sc.nextInt();
     * 
     * switch (month) {
     * case 1:
     * case 3:
     * case 5:
     * case 7:
     * case 8:
     * case 10:
     * case 12: {
     * System.out.println("Tháng " + month + "Có 31 ngày");
     * break;
     * }
     * case 2: {
     * System.out.println("Tháng " + month + "Có 28 hoặc 29 ngày");
     * break;
     * }
     * case 4:
     * case 6:
     * case 9:
     * case 11: {
     * System.out.println("Tháng " + month + "Có 30 ngày");
     * }
     * default:
     * System.out.println("Không tồn tại tháng này");
     * }
     * 
     */

    /*
     * for (int index = 1; index < 10; index++) {
     * System.out.println("Vòng lặp thứ " + index);
     * index = index + 2;
     * }
     * 
     * int count = 0;
     * String text = "Toi la java coder";
     * for (int index = 0; index < text.length(); index++) {
     * System.out.println("ky tu: " + text.charAt(index));
     * char character = text.charAt(index);
     * if (character == 0) {
     * System.out.println("ky tu a");
     * count = count + 1;
     * }
     * System.out.println("so ky tu a: " + count);
     * }
     * 
     * 
     * for (int index = text.length() -1; index >= 0; index--){
     * char character = text.charAt(index);
     * if (character == 'o') {
     * System.out.println("o xuat hien o vi tri: " + index);
     * }
     * switch (character){
     * case 'a':
     * case 'u':
     * case 'i':
     * case 'o':
     * case 'e':{
     * System.out.println("nguyen am " + character + " o vi tri thu " + index);
     * break;
     * }
     * }
     * }
     * 
     * 
     * 
     */

    /*
     * String text = "Toi la java coder";
     * 
     * int index = 0 ;
     * 
     * while (index < text.length()){  
     * index++;
     * 
     * }
     * 
     * 
     * index = text.length() -1;
     * while (index >= 0) {
     * System.out.println("index " + index + " ky tu " + text.charAt(index));
     * index--;
     * }
     */

    // in ra man hinh cau hoi
    // Hay nhap 1 so bat ky
    // Neu so nhap la so chan thi stop
    // Neu so nhap la so le thi yeu cau user nhap lai

    Scanner scanner = new Scanner(System.in);

    boolean isEven = false;
    do {
    System.out.println("Hãy nhập 1 số bất kỳ: ");
    int intputNumber = scanner.nextInt();
    if (intputNumber % 2 == 0) {
    System.out.println("ban da nhap dung");
    isEven = true;
    }

    }while(isEven == false);

    scanner.close();

    // System.out.println("Hãy nhập 1 số bất kỳ: ");
    // isEven = false;
    // while( isEven = false) {
    // int intNumber = scanner.nextInt();
    // if (intNumber % 2 == 0){
    // System.out.println("ban da nhap dung");
    // isEven = true;
    // } else {
    // System.out.println("Hãy nhập 1 số bất kỳ");
    // }
    // }

    String text = "Toi la java coder";
    for (int i = 0; i < text.length(); i++) {
      char character = text.charAt(i);
      if (character == 'o') {
        System.out.println("ky tu dau tien o: " + i);
        break;

      }
      System.out.println("ky tu " + character);
    }

    int j = 0;
    while (j < text.length()) {
      char character = text.charAt(j);
      if (character == 'o') {
        j++;
        continue;

      }

      System.out.println("ky tu " + character);
      j++;

    }


    while (true) {
      int number = scanner.nextInt();
      if (number % 2 == 0) {
        System.out.println("ban da nhap dung roi");
        break;
      }
      

    }


  }
}
