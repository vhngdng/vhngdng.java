package DAY03;


import java.util.Scanner;

public class HomeWork07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input second: ");
    int number = scanner.nextInt();
    int day = 60 * 60 * 24;
    int sec;
    int hour;
    int minute;

    if (number <= day) {
      hour = number / 3600;
      int reMainder = number % 3600;
      System.out.println(reMainder);
      if (reMainder == 0) {
        minute = 0;
        sec = 0;
     
      } else {
        minute = reMainder / 60;
        int reMainderMinute = reMainder % 60;
        if (reMainderMinute == 0) {
          sec = 0;
         
        } else {
          sec = reMainderMinute;
        }
      }
      System.out.printf("Thoi gian la: %02d:%02d:%02d", hour, minute, sec);
    } else {
      for (int i = 0; number > day; i++) {
        int numberToTime = number - i * day;
        if (numberToTime <= 0) {
          break;
        }
        if (numberToTime == 0) {
          System.out.println("Thoi gian la: 00:00:00");
        } else {

          hour = numberToTime / 3600;
          if ( hour <=24){
          int reMainder = numberToTime % 3600;
          
          if (reMainder == 0 ) {
            minute = 0;
            sec = 0;
            System.out.printf("Thoi gian la: %02d:%02d:%02d", hour, minute, sec);
          } else {
            minute = reMainder / 60;
            int reMainderMinute = reMainder % 60;
            if (reMainderMinute == 0) {
              sec = 0;

            } else {
              sec = reMainderMinute;
            }
            System.out.printf("Thoi gian la: %02d:%02d:%02d", hour, minute, sec);
          }
        }
      }
    }

  }
  }
}
