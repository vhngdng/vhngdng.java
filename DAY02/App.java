package DAY02;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    LocalDate currentTime = LocalDate.now();
    // tao doi tuong currentTime

    System.out.println(currentTime);

    LocalDateTime currentDateTime = LocalDateTime.now();

    System.out.println(currentDateTime);

    LocalDate birthday = LocalDate.of(1994, 12, 06);
    System.out.println("My Birthday is: " + birthday);

    LocalDate currentDate = LocalDate.now();

    // tinh tuoi

    int birthdayYear = birthday.getYear();
    int currentYear = currentDate.getYear();

    int age = currentYear - birthdayYear;
    System.out.println("tuoi: " + age);

    int month = birthday.getMonthValue();
    System.out.println("month: " + month);

    int day = birthday.getDayOfMonth();
    System.out.println("Day: " + day);

    LocalDate newDate = birthday.plusDays(300);
    System.out.println(newDate);

    System.out.println(birthday.isLeapYear());

    System.out.println(birthday.minusMonths(4));

    LocalTime startTime = LocalTime.of(10, 30, 12);

    LocalTime newTime = startTime.minusMinutes(45);
    System.out.println(newTime);

    LocalDateTime curTime = LocalDateTime.now();

    LocalDateTime birthTime = LocalDateTime.of(
        LocalDate.of(1994, 12, 06),
        LocalTime.of(12, 24, 30)
        );

    birthTime = LocalDateTime.of(1994, 12, 06, 23, 30, 20);

    System.out.println(birthTime);


    boolean compareResult = curTime.isEqual(birthTime);
    System.out.println("is equal: " + compareResult);

    boolean isBefore = curTime.isBefore(birthTime);
    System.out.println("is Before: " + isBefore);

    boolean isAfter = curTime.isAfter(birthTime);
    System.out.println("is After: " + isAfter);

    // muc tieu: hien thi ngay theo dang nam/thang/ngay, gio theo dang gio-phut-giay
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy/MM/dd E hh-mm-ss.SSSSS");
    String display = formatter.format(curTime);
    System.out.println("hien thi: " + display);


    // Scanner/////////
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hay nhap so nguyen");
    int intNumber;
    intNumber = scanner.nextInt();
    System.out.println("ban da nhap: " + intNumber);

    

    System.out.println("Hay nhap so double");
    double DoubleNumber = scanner.nextDouble();
    System.out.println("ban da nhap: " + DoubleNumber);
    scanner.nextLine();
    
    System.out.println("Ho va ten");
    String inputText;
    inputText = scanner.nextLine();
    System.out.println("Cam on " + inputText);
    scanner.nextInt();




    // chua test
    System.out.println("hay nhap so tu ban phim");
    int number = scanner.nextInt();

    int randNumber = (int)(Math.random() * 100 );

    System.out.println("random number: " + randNumber);

    String compare = number > randNumber ? "so nhap tu ban phim lon hon":"so nhap tu ban phim nho hon";

    System.out.println(compare);
    scanner.close();

    String text = "Toi \"la\" coder";
    System.out.println(text);


  }
}
