import java.util.Arrays;
import java.util.Scanner;

public class HomeWork02 {

  public static Scanner scanner = new Scanner(System.in);

  public static void bai05() {
    /*
     * Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím. Thực hiện:
     * 
     * Nhập các phần tử mảng
     * In thông tin mảng ra màn hình
     * Liệt kê các phần tử nằm trên đường chéo chính
     * Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng
     * với nhau
     */

    String adding = new String();

    String cross = new String();

    System.out.println("Hay nhap so hang: "); // row
    int row = scanner.nextInt();

    System.out.println("Hay nhap so cot: "); // column
    int column = scanner.nextInt();
    scanner.nextLine();

    String[][] string = new String[row][column]; // tao array

    for (int i = 0; i < row; i++) {

      for (int j = 0; j < column; j++) {
        System.out.println("row " + (i + 1) + "*/ column " + (j + 1)); // Nhap cac phan tu
        string[i][j] = scanner.nextLine();

        if (i == j) { // Duong cheo chinh
          cross = cross + string[i][j] + " ";
        }
      }
    }

    // In thong tin mang
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(string[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("\nCac phan tu trong duong cheo la\n" + cross); // Duong cheo chinh

    // Khai bao array thu 2

    System.out.println("\nArray thu 2\n");
    String[][] dimensionString = new String[row][column];

    for (int i = 0; i < row; i++) {

      for (int j = 0; j < column; j++) {
        System.out.println("row " + (i + 1) + "*/ column " + (j + 1)); // Nhap cac phan tu Array thu 2
        dimensionString[i][j] = scanner.nextLine();
      }
    }

    System.out.println("\nArray empty\n");
    String[][] empty = new String[row][column]; // Array empty
    for (int i = 0; i < row; i++) {

      for (int j = 0; j < column; j++) {
        empty[i][j] = ""; // Khai bao cac phan tu empty
      }
    }

    
    for (int i = 0; i < row; i++) {

      for (int j = 0; j < column; j++) {
        empty[i][j] += string[i][j] + dimensionString[i][j];
    // Cong cac phan tu cua cac array khac vao phan tu empty
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(empty[i][j] + " ");  // 
      }
      System.out.println();
    
    }

  }

  public static void main(String[] args) {
    bai05();
  }

}
