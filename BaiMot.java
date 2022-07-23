

public class BaiMot {
   public static void main(String[] args) {

    // Bài 1
    int i = 10;
    int n = i++%5;

    /* in 2 giá trị của i và n */
  
    System.out.println(i);
    System.out.println(n);

    /* Nếu thay i = ++i thì giá trị cuối cùng của i = 11, 
                                                  n = 1 */



    // Bài 2
    int degreeC = 37;
    double degreeF = (float)1.8*degreeC;
    System.out.printf("%d độ C = %.1f độ F\n",degreeC,degreeF );

    
    // Bài 3

    

    double d = (double)9/5;
    System.out.println(d);
        // d khi in theo giá trí đề bài có giá trị = " 1 "
    




    //Bài 4 
    int x = 2;
    int y = 1;
    String soDuong = (x>=0)?"x >= 0":"x <= 0";
    System.out.println(soDuong);

    //x >= 0 
    String chiaHet = (x%y==0)?"x%y == 0":"x%y !==y";
    System.out.println(chiaHet);

    /* Bài 4
    x%y */
    boolean greater = x >=2;
    boolean smaller = x<=15;
    boolean compare = smaller && greater;
    System.out.println(compare);

    // minus
    boolean minus = (x - y) < 5 ;
    System.out.println(minus);

    // aside from 10-30
    boolean asideFromTheLength = ((x < 10) || ( x > 30 ));
    System.out.println(asideFromTheLength);



    // có 4 chữ số 
    int x1 = 111000 ;
    boolean larg = x1 > 999;
    System.out.println(larg);

    //  có chính xác 6 số
    boolean precise = ((x1 < 1_000_000) && (x1 > 99_999));
    System.out.println(precise);




}

}
