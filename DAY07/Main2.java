import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
        static Scanner scanner = new Scanner(System.in);
        static User[] user = new User[8]; // Đây là mảng chung chứa tất cả các phần tử
        static Student[] student = new Student[6];
        static Teacher[] teacher = new Teacher[2];
        static boolean online = true;
        static boolean offline = false;

        public static void main(String[] args) {
                student[0] = new Student("hs01", "tran thanh", GENDER.MALE, User.setBirthDay("10-10-1990"),
                                "tranthanh@gmail.com", "0385670022", "online", "dang di lam");

                student[1] = new Student("hs02", "vu hoang dung", GENDER.MALE, User.setBirthDay("06-12-1994"),
                                "dungvh612@gmail.com", "0359805200", "offline", "dang di lam");

                student[2] = new Student("hs03", "tang thanh ha", GENDER.MALE, User.setBirthDay("16-08-1989"),
                                "tangthanhha@gmail.com", "0985643022", "online", "dang di lam");

                student[3] = new Student("hs04", "truong giang", GENDER.MALE, User.setBirthDay("02-05-1999"),
                                "truong_giang@gmail.com", "0385670022", "online", "dang di lam");

                student[4] = new Student("hs05", "Scarlet Johanson", GENDER.FEMALE, User.setBirthDay("08-12-2002"),
                                "Scarlet@gmail.com", "0906525484", "offline", "dang di hoc");

                student[5] = new Student("hs06", "Nguyen Phu Trong", GENDER.MALE, User.setBirthDay("10-10-2000"),
                                "nguyenphutrong@gmail.com", "0364234820", "online", "dang di hoc");

                for (int i = 0; i < 6; i++) { // chuyen student vao user array
                        user[i] = (User) student[i]; // using super class reference and using typecasting 
                                //creat a reference variable superclass by refering 
                }

                teacher[0] = new Teacher("gv1", "nguyen xuan nam", GENDER.MALE, User.setBirthDay("01-01-1988"),
                                "ngxnam@gmail.com", "0906525998", 7, "java, brSE");

                teacher[1] = new Teacher("gv2", "Loli", GENDER.FEMALE, User.setBirthDay("02-02-1981"),
                                "loli@gmail.com", "090994298", 10, "ios");

                for (int i = 0; i < 2; i++) { // chuyen teacher vao user array
                        user[i + 6] = (User) teacher[i];
                }

                // Print info
                printInfo();

                // Tim theo keyword
                findWithKeyWord();

                // Sap xep theo ten
                arrangeByArrayName();

                // Sap xep theo tuoi
                arrangeByArrayAge();
        }

        // print Info
        public static void printInfo() {
                for (User usr : user) {
                        User.printInfo(usr);
                }
        }

        // Tim theo keyword
        public static void findWithKeyWord() {
                System.out.println("Hay nhap tu khoa");
                Scanner scanner = new Scanner(System.in);
                String keyword = scanner.nextLine();
                for (User usr : user) {
                        User.hasKeyWord(keyword, usr);
                }
                scanner.close();
        }

        // Sap xep theo ten
        public static void arrangeByArrayName() {
                String userName[] = new String[8];
                for (int i = 0; i < 8; i++) {
                        userName[i] = user[i].name; // Tao array String chua name cua cac user
                }
                Arrays.sort(userName); // Sap xep lai array String userName
                for (int i = 0; i < 8; i++) { // Loop 1, thu tu userName
                        for (int j = 0; j < 8; j++) { // Loop 2, user co name trung voi userName -> printInfo
                                if (userName[i] == user[j].name) {
                                        System.out.println(user[j].name);
                                        User.printInfo(user[j]);
                                }
                        }
                }
        }

        public static void arrangeByArrayAge() {
                Integer age[] = new Integer[8]; // Tao array Integer la tuoi cua cac user
                for (int i = 0; i < 8; i++) {
                        age[i] = User.findAge(user[i]);
                }

                Arrays.sort(age, Collections.reverseOrder()); // Sử dụng wrapper class Integer để dùng reverseOrder
                                                              // Sắp xếp theo thứ tự giảm dần

                for (Integer i : age) { // các phẩn tử của Array age = age of user
                        for (User usr : user) {
                                if (i == User.findAge(usr)) {
                                        System.out.println("tuoi " + i);
                                        User.printInfo(usr);
                                }
                        }
                }

        }
}
