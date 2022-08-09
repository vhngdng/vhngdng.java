import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

enum GENDER {
    FEMALE,
    MALE
}
public class User {
//     id (String)
// name (String)
// gender (enum)
// birthday (LocalDate)
// email (String)
// phoneNumber (String)
    String id;
    String name;
    GENDER gender;
    LocalDate birthday;
    String email;
    String phoneNumber;
    
    public User (String id, String name, GENDER gender,LocalDate birthday,String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public static LocalDate setBirthDay (String str){
        
        LocalDate birthDay = LocalDate.parse(str, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return birthDay;
    }

    public String toString() {
    String text = "id: " + this.id + " | name: " + this.name + " | gender: " + this.gender + " | birthday: " + this.birthday + " | email: " + email + " | phoneNumber: " + phoneNumber;  
    return text;
    }

    public static void printInfo(User user) {
        System.out.println(user.toString());
    }

    public static void hasKeyWord(String keyword, User user) {  
        //check name or phonenumber or email contains keyword
        if ((user.name).contains(keyword) || (user.phoneNumber).contains(keyword) || (user.email).contains(keyword) ) { 
            printInfo(user);
        }
        
    }

    public static int findAge(User user) {
        // Tim age cua cac user
        Period getAge = Period.between(user.birthday, LocalDate.now());
        int age = getAge.getYears();
        
        
        return age;
    }

}

