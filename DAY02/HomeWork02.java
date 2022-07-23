package DAY02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;


public class HomeWork02 {
  public static void main(String[] args){
    double distant = 0.0;
        String startTimeStr = "";
        String finishTimeStr = "";
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy E hh:mm:ss");
        

        Scanner scanner = new Scanner(System.in);
        // nhập khoảng cách từ bàn phím, gán vào biến distant
        System.out.print("Nhập khoảng cách: ");
        distant = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Khoảng cách của bạn là: " + distant + "km");
        
        // nhập thời gian bắt đầu, gán vào biên startTimeStr
        System.out.println("Nhập thời gian bắt đầu: ");
        startTimeStr = scanner.nextLine();
        
        
        // nhập thời gian kết thúc, gán vào biến finishTimeStr
        System.out.print("Nhập thời gian kết thúc: ");
        finishTimeStr = scanner.nextLine();

        scanner.close();
        
        /*
        // chuyển startTimeStr và finishTimeStr sang kiểu LocalDateTime
        LocalDateTime startTime = LocalDateTime.formater.parse(LocalDate.of(year, month, dayOfMonth), LocalTime.of(hour, minute, second));
        LocalDateTime finishTime = LocalDateTime.parse(<code của bạn>, <code của bạn>);
        
        DateFormat formater = new DateFormat(dd, hh, mm);

        Duration duration = Duration.between(startTime, finishTime);
        // Tính và in ra thời gian chạy của bạn
        System.out.printf("Thời gian chạy %s phút\n", duration.toMinutes());
        // Tính và in ra vận tốc trung bình của bạn (km/h)
        System.out.printf("Vận tốc trung bình %s km/h\n", distant / <code của bạn>);
    
        */
  }
}
