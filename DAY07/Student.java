import java.time.LocalDate;

public class Student extends User {

    String backGround;
    String isOnline;

    public Student(String id, String name,
            GENDER gender, LocalDate birthday,
            String email, String phoneNumber,
            String isOnline, String backGround) {
        super(id, name, gender, birthday, email, phoneNumber);
        this.backGround = backGround;
        this.isOnline = isOnline;
    }

    public void setIsOnline(String isOnline) {

        this.isOnline = isOnline;
    }

    public void setBackGround(String backGround) {
        this.backGround = backGround;
    }

    @Override
    public String toString() {
        //Override method toString() 
        ;
        String text = super.toString() + " | background: " + backGround + " | " + isOnline;

        return text;
    }

    public static void printInfo(Student student) {
        System.out.println(student.toString());
    }

}
