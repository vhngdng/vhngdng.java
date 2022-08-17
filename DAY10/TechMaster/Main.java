import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tao student
        Student student1 = new Student(1, "A1", 18, "A");
        Student student2 = new Student(2, "B2", 18, "A");
        Student student3 = new Student(3, "C3", 18, "B");
        Student student4 = new Student(4, "D4", 18, "C");
        Student student5 = new Student(5, "E5", 18, "B");

        // Danh sach hoc vien
        List<Student> stuList = new ArrayList<>();
        stuList.add(student1);
        stuList.add(student2);
        stuList.add(student3);
        stuList.add(student4);
        stuList.add(student5);

        // Tao class
        ClassTech classJava = new ClassTech("java", stuList);

        // Tao teacher va manager class
        People manager = new People("Huong", "Quan ly lop hoc");
        People teacher = new People("Dat", "Teacher");

        TechMaster techMaster = new TechMaster(manager, teacher, classJava);

        System.out.println(techMaster.toString());

        // Them hoc vien
        System.out.println("Them hoc vien");
        System.out.println("Hay nhap ten hoc vien: ");
        String nameOfNewStudent = scanner.nextLine();
        int IdOfNewStudent = 0;

        // ID nhap vao khac ID da co
        while (true) {
            System.out.println("Hay nhap ID: ");
            IdOfNewStudent = scanner.nextInt();
            if (techMaster.compareByID(IdOfNewStudent) == false) {
                break;
            }
        }
        System.out.println("Hay nhap tuoi: ");
        int ageOfNewStudent = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hay nhap xep hang: (A - F) ");
        String classificationOfNewStudent = scanner.nextLine().toUpperCase();

        Student newStudent = new Student(IdOfNewStudent, nameOfNewStudent, ageOfNewStudent, classificationOfNewStudent);
        techMaster.addStudent(newStudent);
        System.out.println(techMaster.toString());

        // Tim hoc vien theo ID
        System.out.println("Tim hoc vien theo ID");
        System.out.println("Hay nhap ID");
        int idFind = scanner.nextInt();
        scanner.nextLine();
        Student studentUpdateClassification = techMaster.findByID(idFind);
        // change classification
        System.out.println("Hay nhap thong tin hoc luc moi: (A-F)");
        String newClassification = scanner.nextLine().toUpperCase();
        studentUpdateClassification.setClassification(newClassification);
        System.out.println(techMaster.toString());

        // Xoa hoc vien
        System.out.println("Xoa hoc vien theo ID");
        System.out.println("Hay nhap ID");
        int idDel = scanner.nextInt();
        scanner.nextLine();
        Student studentDelete = techMaster.findByID(idDel);
        stuList.remove(studentDelete);
        System.out.println(techMaster.toString());

        scanner.close();
    }
}
