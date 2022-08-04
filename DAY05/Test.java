import java.util.Scanner;
import java.util.regex.Pattern;
public class Test {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap 1 thang bat ky");
        int month = scanner.nextInt();
            while (month < 0 || month >= 13){
                System.out.println("Thang khong phu hop\nVui long chon lai");
                System.out.println("Hay nhap 1 thang bat ky");
                month = scanner.nextInt();
            }
            if (month > 0 && month < 13){
                System.out.println("Thang ban chon la: " + month);
            }
    }
}
