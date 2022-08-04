import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class BirthDay {
    // LocalDate birthDay;

public LocalDate birthDay(Scanner scan){
    
    // Scanner scan = new Scanner(System.in);
    System.out.print("Enter a date [dd. MMM. yyyy]: ");
    String str = scan.nextLine();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate birthDay = LocalDate.parse(str, dtf);
    scan.close();
    return birthDay;
    
}

}
