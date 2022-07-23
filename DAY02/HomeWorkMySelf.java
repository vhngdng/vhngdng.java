package DAY02;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class HomeWorkMySelf {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Nhập khoảng cách:

    System.out.print("Nhập khoảng cách: ");
    double distant = scan.nextDouble();
    scan.nextLine();
    System.out.println("Khoảng cách của bạn là: " + distant + "km");

    /* NHap thoi gian bat dau */

    System.out.println("Nhập ngày bắt đầu: ");
    int day = scan.nextInt();
    String limitday = (day <= 31) && (day >= 1) ? "Ngày " + day : "Thông tin không phù hợp";
    System.out.println(limitday);

    // Nhập tháng bắt đầu
    System.out.println("Nhập tháng bắt đầu: ");
    int month = scan.nextInt();

    // Nhập năm bắt đầu
    System.out.println("Nhập năm bắt đầu: ");
    int year = scan.nextInt();

    // Nhap gio bat dau
    System.out.println("Nhập giờ bắt đầu: ");
    int hour = scan.nextInt();

    // Nhap phut bat dau
    System.out.println("Nhập phút bắt đầu: ");
    int minute = scan.nextInt();

    System.out.printf("Thời gian bắt đầu của bạn là: Ngày %d, Tháng %d, Năm %d, %dh:%d'\n\n", day, month, year, hour,
        minute);

    /* NHap thoi gian ket thuc */

    System.out.println("Nhập ngày kết thúc: ");
    int dayFinish = scan.nextInt();

    // Nhập tháng kết thúc
    System.out.println("Nhập tháng kết thúc: ");
    int monthFinish = scan.nextInt();

    // Nhập năm kết thúc
    System.out.println("Nhập năm kết thúc: ");
    int yearFinish = scan.nextInt();

    // Nhap gio kết thúc
    System.out.println("Nhập giờ kết thúc: ");
    int hourFinish = scan.nextInt();

    // Nhap phut kết thúc
    System.out.println("Nhập phút kết thúc: ");
    int minuteFinish = scan.nextInt();

    System.out.printf("Thời gian kết thúc của bạn là: Ngày %d, Tháng %d, Năm %d, %dh:%2d'\n\n", dayFinish, monthFinish,
        yearFinish, hourFinish, minuteFinish);

    scan.close();
    // chuyển startTimeStr và finishTimeStr sang kiểu LocalDateTime

    LocalDateTime startTime = LocalDateTime.of(LocalDate.of(year, month, day), LocalTime.of(hour, minute));
    LocalDateTime finishTime = LocalDateTime.of(LocalDate.of(yearFinish, monthFinish, dayFinish),
        LocalTime.of(hourFinish, minuteFinish));

    Duration duration = Duration.between(startTime, finishTime);

    // Tính và in ra thời gian chạy của bạn
    System.out.printf("Thời gian chạy %s phút\n", duration.toMinutes());
    // Tính và in ra vận tốc trung bình của bạn (km/h)
    System.out.printf("Vận tốc trung bình %s km/h\n", (distant / (duration.toHours())));

  }
}
