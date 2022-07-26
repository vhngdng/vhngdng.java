import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Viết chương trình nhập vào từ bàn phím email và số điện thoại, kiểm tra email
        // và số điện thoại đó có hợp lệ không.

        // Email phải đúng định dạng
        // Số điện thoại có chứa từ 9 đến 11 chữ số
        // Gợi ý: Sử dụng regex https://viettuts.vn/java/su-dung-regex-trong-java

        System.out.println("Hay nhap dia chi email: ");
        String email = scanner.nextLine();
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        if (Pattern.matches(EMAIL_PATTERN, email) == true) {
            System.out.println("email hop le\n");
        } else {
            System.out.println("email khong phu hop");
        }

        System.out.println("Hay nhap so dien thoai: ");
        String number = scanner.nextLine(); // Nhap so dien thoai bang String

        String PHONE_PATTERN = "^(0|84)(2(0[3-9]|1[0-6|8|9]|2[0-2|5-9]|3[2-9]|4[0-9]|5[1|2|4-9]|6[0-3|9]|7[0-7]|8[0-9]|9[0-4|6|7|9])|3[2-9]|5[5|6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])([0-9]{7})$";
        // regex =/^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$/
        if (Pattern.matches(PHONE_PATTERN, number) == true) {
            System.out.println("So dien thoai hop le\n");
        } else {
            System.out.println("So dien thoai khong phu hop");
        }

    }
}
