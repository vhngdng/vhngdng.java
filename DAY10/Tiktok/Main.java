import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isQuit = false;
        //song
        while (true){
        System.out.println("Hay nhap thong tin cua song");
        System.out.println("Id of song: " + "Neu nhu khong muon nhap nua thi nhap : '0' ");
        int idOfSong = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name of song: ");
        String nameOfSong = scanner.nextLine();
        System.out.println("Singer: ");
        String singer = scanner.nextLine();

        if (idOfSong == 0 || nameOfSong.toLowerCase().equals("khong") || singer.toLowerCase().equals("khong") ) {
            isQuit = true;
            break;
        }
        }

        //follower 
        while (true){
        System.out.println("Hay nhap thong tin cua follower");
        System.out.println();
        System.out.println("Id of song: " + "Neu nhu khong muon nhap nua thi nhap : '0' ");
        int idOfSong = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name of song: ");
        String nameOfSong = scanner.nextLine();
        System.out.println("Singer: " );
        String singer = scanner.nextLine();

        if (idOfSong == 0) {
            isQuit = true;
            break;
        }
        }
    }
}