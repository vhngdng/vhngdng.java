import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account user[] = new Account[5];


        //Nhap user account
        for (int i = 0 ; i < 5; i++) {
        System.out.println("Hay nhap ten account: ");
        String name = scanner.nextLine();    
        System.out.println("Hay nhap account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hay nhap email:");
        String email = scanner.nextLine();
        
        System.out.println("Hay nhap account balance:");
        int accountBalance = scanner.nextInt();
        scanner.nextLine();

        user[i] = new Account(name, accountNumber, email, accountBalance);
        }
        System.out.println("===========================================================================================");

        // display Info
        for (Account userList: user) {
            userList.displayInfo(userList);
        }

        System.out.println("===========================================================================================");
        // doi email
        
        System.out.println("Doi email");
        System.out.println("Hay chon user muon doi");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap email moi");
        String email = scanner.nextLine();
        user[num - 1].changeEmail(email);
        System.out.println("User " + user[num - 1].getName() + " da doi email thanh cong" );
        System.out.println("email moi cua user: "  + user[num -1].getName() + user[num - 1].getEmail());

        //recharge
        System.out.println("Hay chon user muon recharge");
        int temp = scanner.nextInt();
        System.out.println("Nhap so tien");
        int amountRecharge = scanner.nextInt();

        user[temp - 1].recharge(amountRecharge);
        // info sau khi recharge
        System.out.println("So tien sau khi recharge la: ");
        user[temp - 1].displayInfo(user[temp - 1]);

        scanner.close();
    }

}