package ChuVi.java.ChuVi.java.ChuVi.java.Student;

public class Student implements Iclassification {
    private String name;
    private int age;
    private int marks;
    private String classification;

    Student student;
    

    public Student () {

    }
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return int return the marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }

    /**
     * @return String return the classification
     */
    public String getClassification() {
        return classification;
    }

    /**
     * @param classification the classification to set
     */
    public void setClassification() {
        
        String classify = classify(this.marks);
        this.classification = classify;
    }

    @Override
    public String classify(int num) {
        // TODO Auto-generated method stub

        if (this.marks >= 8) {
            classification = "A";
        } else if (this.marks < 8 && this.marks > 6.5) {
            classification = "B";
        } else {
            classification = "C";
        }
        return classification;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println(
                "Ten hoc sinh: " + name + " ,tuoi: " + age + " ,diem: " + marks + " ,classification " + classification);

    }

}
