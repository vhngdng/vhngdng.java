import java.util.ArrayList;
import java.util.List;

public class TechMaster {

    People people1;
    People people2;
    ClassTech class1;
    TechMaster techMaster;
    public TechMaster(People people1, People people2, ClassTech class1) {
        this.people1 = people1;
        this.people2 = people2;
        this.class1 = class1;

    }

    @Override
    public String toString() {
        return "Class: " + class1 + "\n" + people1 + "\n" + people2 + "\n"
                + "=========================================================="
                + "\n";
    }

    public TechMaster addStudent(Student student) {
        class1.addStudent(student);
        return this.techMaster;
    }

    public Student findByID (int num) {
        Student studentFound = class1.findByID(num);
        if (studentFound == null) {
            System.out.println("Khong tim thay ID nay");
        }else{
            System.out.println(studentFound.toString());
        }
        return studentFound;
        
    }

    public boolean compareByID (int num) {
        boolean isBoolean = class1.compareByID(num);
        return isBoolean;
    }
}
