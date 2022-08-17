import java.util.ArrayList;
import java.util.List;

public class ClassTech {
   

    private String subject;
    List<Student>students = new ArrayList<>();
    
    public ClassTech(String subject, List<Student> students) {
        this.subject = subject;
        this.students = students;
    }
    
    
     @Override
    public String toString() {
        return  subject + "\n" + ", Students: " + students;
    }
    
    //Add student
    public void addStudent(Student student) {
        students.add(student);
    }

    //Find student by ID
    public Student findByID(int num){
        Student studentWithID = null;
        for (Student temp : students) {
            if (temp.getId() == num ) {
                studentWithID = temp;
            }
        }
        return studentWithID;
    }

    // compare ID
    public boolean compareByID(int num){
        boolean isBoolean = false;
        for (Student temp : students) {
            if (temp.getId() == num ) {
                isBoolean = true;
            }
        }
        return isBoolean;
    }
}
