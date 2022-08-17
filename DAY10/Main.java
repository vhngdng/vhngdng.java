import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                
        System.out.println("Nhap so nha");
        String houseNumber = scanner.nextLine();

        System.out.println("Nhap so thanh vien");
        int familyNumber = scanner.nextInt();
        scanner.nextLine();


        Person person = new Person("Huong", "1-1-1991", "HR");
        Person person2 = new Person("Hong", "2-1-1991", "Managaer");
        ArrayList<Person> people = new ArrayList<>();

        people.add(person);
        people.add(person2);

        Hodan hoDan = new Hodan();
        hoDan.setHouseNumber(houseNumber);
        hoDan.setNumberOfMembers(familyNumber);
        hoDan.setPeople(people);

        System.out.println(hoDan.toString());
        scanner.close();
    }
}