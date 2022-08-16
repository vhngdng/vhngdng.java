package ChuVi.java.ChuVi.java.ChuVi.java.Student;



public class MainStudent {
    public static void main (String[] args) {
        Student student = new Student();
        Student student1 = new Student();  
        Student student2 = new Student();      


        student.setAge(18);
        student.setMarks(8);
        student.setName("Nam");
        student.setClassification();
        student.display();


        student1.setAge(20);
        student1.setMarks(9);
        student1.setName("Dung");
        student1.setClassification();
        student1.display();

        student2.setAge(21);
        student2.setMarks(6);
        student2.setName("Dat");
        student2.setClassification();
        student2.display();

        

    }
}
