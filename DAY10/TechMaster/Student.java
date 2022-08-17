public class Student {
    private int Id;


    private String name;
    private int age;
    private String classification;
    
    
    public Student(int id, String name, int age, String classification) {
        Id = id;
        this.name = name;
        this.age = age;
        this.classification = classification;
    }

    public int getId() {
        return Id;
    }


    @Override
    public String toString() {
        return "\n" + "name: " + name + ", Id: " + Id + ", age: " + age + ", classification: " + classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
    
    

}