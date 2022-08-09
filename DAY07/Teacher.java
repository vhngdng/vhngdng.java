import java.time.LocalDate;

public class Teacher extends User {
    int yearOfExperiences;
    String speciality;
    public Teacher(String id, String name, GENDER gender,LocalDate birthday,String email, String phoneNumber, int yearOfExperiences, String speciality){
        super(id, name, gender, birthday, email, phoneNumber);
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;
    }

    public void setYearOfExperiences (int yearOfExperiences) {
        this.yearOfExperiences = yearOfExperiences;
    }


    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        String text = super.toString() + " | year of experiences: "
                + yearOfExperiences + " nam kinh nghiem" + " | chuyen mon: " + speciality;

        return text;
    }

    public static void printInfo(Teacher teacher) {
        System.out.println(teacher.toString());
    }

}
