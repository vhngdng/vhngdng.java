

public class HomeWork01 {

  public static void squareShape() {
    String[][] square = new String[4][4];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        square[i][j] = "*";
      }
    }

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(square[i][j] + " ");
      }
      System.out.println();
    }
    // hình vuông

  }

  public static void triAngleShape() {
    String[][] square = new String[4][4];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= i; j++) {
        square[i][j] = "*";
        // vị trí của *
      }

      for (int j = 3; i < j && j < 4; j--) {
        square[i][j] = " ";
      }
    }
    // vị trí trống

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(square[i][j] + " ");
      }
      System.out.println("");
    }
  }
  // hình tam giác


  public static void lastShape() {              //Hình cuối bài 1
    String[][] square = new String[4][4];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        square[i][j] = "*";
      }
      // Vị trí * dòng 1-3

      for (int j = 2; i < j && j < 3; j--) {
        square[i][j] = " ";
      }
      // vị trí trống từ dòng 1-3

    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(" " + square[i][j]);     //Tạo khoảng cách đầu ở dòng 1-3
      }
      System.out.println();
    }
    // in dòng 1-3

    for (int j = 0; j < 4; j++) {
      square[3][j] = "*";
      System.out.print(square[3][j] + " ");
    }
    System.out.println("\n");
    // Tạo dòng cuối

    
  }

  public static void bai2() {
    /*
     * Cho chuỗi sau : You only live once, but if you do it right, once is enough
     * 
     * Thực hiện:
     * 
     * Đếm số từ trong chuỗi
     * Đếm và in ra index của các ký tự o
     */
    String str = "You only live once, but if you do it right, once is enough\n";
    System.out.println("Cho chuỗi sau: " + str);

    String[] array = str.split(" ");
    System.out.println("Số từ trong chuỗi là: " + array.length);
    // Đếm số từ trong chuỗi

    int index = str.indexOf('o');
    int lastIndex = str.lastIndexOf('o');
    // Số thứ tự của 'o' ở vị trí đầu tiên và cuối trong chuỗi str

    int num = 1;
    System.out.println("Số thứ tự của ký tự 'o' là: " + num);
    // Đếm và in số thứ tự của ký tự 'o' lần thứ nhất

    do {
      index = str.indexOf('o', index + 1);
      System.out.println("Số thứ tự của ký tự 'o' là: " + index);
      num = num + 1;
      // Đếm và in số thứ tự của ký tư 'o' ở các vị trí tiếp theo

    } while (index != lastIndex);
    // Chuỗi sẽ dừng lại khi đến vị trí cuối của ký tự 'o'

    System.out.println("Tổng số ký tự 'o' là: " + num + "\n");
  }

  public static void bai03() {
    // Viết chương trình sinh ra số ngẫu nhiên, kiểm tra số đó có là số nguyên tố
    // không.
    
    int number = (int) (Math.random() * 1000);
    System.out.println("Số ngẫu nhiên được chọn là:" + number);
    System.out.println(isPrimeNumber(number) + "\n"); // number có phải số nguyên tố không
  }


  
  public static boolean isPrimeNumber(int n) {   //method boolean tìm số nguyên tố
    if (n < 2) {
      return false;
    }
    int squareRoot = (int) Math.sqrt(n);
    for (int i = 2; i <= squareRoot; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }


  public static void bai04() {
    // Viết chương trình thực hiện:

    // Liệt kê 10 số nguyên tố đầu tiên
    // Liệt kê các số nguyên tố nhỏ hơn 10

    int primeNumber = 0;
    int countNumber = 1;
    int[] primeArray = new int[10];     
    int[] primeBelow10 = new int[10];  //Lấy tạm "array length của các số nguyên tố nhỏ hơn 10" = 10 

    for (primeNumber = 0; countNumber <= 10; primeNumber++) {

      if (isPrimeNumber(primeNumber) == true) {  // đã có method tìm số nguyên tố ở trên

        primeArray[countNumber - 1] = primeNumber;  

        if (primeNumber < 10 && true) {     //Nhóm các số nguyên tố < 10 vào 1 array khác

          primeBelow10[countNumber - 1] = primeNumber;

        }
        countNumber += 1;

      }
    }

    System.out.println("10 So nguyen to dau tien la: \n" + primeArray);
    for (int i : primeArray) {
      System.out.print(i + " ");
    }

    System.out.println("\n\nSo nguyen to duoi 10 la: \n" + primeBelow10);
    
   
    for (int i : primeBelow10) {
      if( i!= 0 ){      // Loại bỏ các giá trị default = 0 vì array length = 10
      System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("Bài tập 1:\n");
    System.out.println("In ra màn hình hình vuông\n");
    squareShape();

    System.out.println("In ra màn hình hình tam giác\n");
    triAngleShape();

    System.out.println("Hoặc\n");
    lastShape();

    System.out.println("Bài tập 2:\n");
    bai2();

    System.out.println("Bài tập 3:");
    bai03();

    System.out.println("Bài tập 4:");
    bai04();
  }
}