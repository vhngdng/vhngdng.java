package mypack.animal;

import java.util.Arrays;
import java.util.Scanner;

enum TYPE {
    HORROR,
    COMEDY,
    DOCUMENTARY
}

public class Main {

    public static Movie movie[] = new Movie[5];
    public static Series series[] = new Series[5];
    public static FilmList filmList[] = new FilmList[10];
    public static Scanner scanner = new Scanner(System.in);
    public static boolean result;

    public static void main(String[] args) {

        // array movie
        movie[0] = new Movie("MV01", "Tom&Jerry", TYPE.COMEDY, 4.0, 101);
        movie[0].setDirector("William Hanna and Joseph Barbera");

        movie[1] = new Movie("MV02", "Turning Red", TYPE.COMEDY, 3.6, 100);
        movie[1].setDirector("Domee Shi");

        movie[2] = new Movie("MV03", "Scream", TYPE.HORROR, 3.4, 114);
        movie[2].setDirector("Matt Bettinelli and OlpinTyler Gillett");

        movie[3] = new Movie("MV04", "X", TYPE.HORROR, 3.3, 105);
        movie[3].setDirector("Ti West");

        movie[4] = new Movie("MV05", "Downfall: The Case Against Boeing", TYPE.DOCUMENTARY, 4.8, 89);
        movie[4].setDirector("Rory Kennedy");

        // array Series
        series[0] = new Series("SR01", "Man vs. Bee", TYPE.COMEDY, 4.2, 19, 1);
        series[0].setDirector("David Kerr");

        series[1] = new Series("SR02", "Neymar: The Perfect Chaos", TYPE.DOCUMENTARY, 3.3, 51.2, 2);
        series[1].setDirector("David Charles Rodrigues");

        series[2] = new Series("SR03", "All of Us Are Dead", TYPE.HORROR, 4.0, 59.6, 3);
        series[2].setDirector("Lee Jae-kyoo Kim Nam-su");

        series[3] = new Series("SR04", "Teen Mom 2", TYPE.DOCUMENTARY, 3.5, 20.76, 11);
        series[3].setDirector("Alexis Charizopoulos");

        series[4] = new Series("SR05", "The Big Bang Theory", TYPE.COMEDY, 4.8, 22, 10);
        series[4].setDirector("Mark Cendrowski");

        for (int i = 0; i < 5; i++) {
            filmList[i] = new FilmList();       //Tao filmList chua tat ca cac phim ca movie lan series
            filmList[i + 5] = new FilmList();   //Tao filmList chua tat ca cac phim ca movie lan series

            // Add title for array filmList[10]
            filmList[i].setTitle(movie[i].getTitle());
            filmList[i + 5].setTitle(series[i].getTitle());

            // Add ranking for array filmList[10]
            filmList[i].setRanking(movie[i].getRanking());
            filmList[i + 5].setRanking(series[i].getRanking());

            // Add type for array filmList[10]
            filmList[i].setType(movie[i].getType());
            filmList[i + 5].setType(series[i].getType());

        }

        // Info of film
        System.out.println("danh sach cac film");
        print();

        findTitle();

        findLowestRanking();

        findDirectorOfLowestComedyRanking();
    }

    // Print film
    public static void print() {
        for (Movie i : movie) {
            System.out.println(i.toString());
        }

        for (Series i : series) {
            System.out.println(i.toString());
        }
    }

    // Find Title
    public static void findTitle() {
        int k = 0;
        System.out.println("Hay nhap tu khoa");
        String keyword = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < 10; i++) { // Tim trong filmList array
            boolean result = (filmList[i].getTitle().contains(keyword)); // Check Title co keyword khong
            if (result == true) {
                if (i < 5 && (result == true)) { // Tim trong movie array
                    System.out.println(movie[i].toString());
                } else if (i >= 5 && (result == true)) { // Tim trong series array
                    System.out.println(series[i].toString());
                }
            } else {
                k++;
            }
        }

        if (k == 10) {
            System.out.println("Khong ton tai ID nay");
        }
    }

    // Tim va sap xep ranking
    public static void findLowestRanking() {
        Double rankFilm[] = new Double[10];
        for (int i = 0; i < 10; i++) {
            rankFilm[i] = filmList[i].getRanking(); // Tao array moi ve rankfilm
        }

        Arrays.sort(rankFilm); // sap xep ranking tang dan | rankFilm[0] la rank thap nhat
        for (int i = 0; i < 10; i++) {
            if (rankFilm[0] == filmList[i].getRanking() && i < 5) { // filmList[i] voi i < 5 co rankFilm[0] => movie co
                                                                    // chua object rank thap nhat
                System.out.println("Film co ranking thap nhat la: " + movie[i].getRanking());
                System.out.println(movie[i].toString());
            }

            if (rankFilm[0] == filmList[i].getRanking() && i >= 5) { // filmList[i] voi i >= 5 co rankFilm[0] => series
                                                                     // co chua object rank thap nhat
                System.out.println("Film co ranking thap nhat la: " + series[i - 5].getRanking());
                System.out.println(series[i - 5].toString());
            }
        }
    }

    public static void findDirectorOfLowestComedyRanking() { // Tim director film type comedy co ranking thap nhat
        int k = 0;
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (filmList[i].getType() == TYPE.COMEDY) { // Tim so phim type COMEDY

                k++;
            }
        }

        double ranking[] = new double[k]; // k = tong so phim type comedy | tao array voi length = k
        for (int i = 0; i < 10; i++) {

            if ((filmList[i].getType()) == (TYPE.COMEDY)) {
                ranking[j] = filmList[i].getRanking(); // cho cac so ranking cua type comedy vao array
                j++;
            }
        }

        Arrays.sort(ranking); // Sap xep lai ranking cua film type Comedy

        // ranking[0] la phim type comedy co rank thap nhat
        for (int i = 0; i < 10; i++) {
             // ranking thap nhat voi i < 5 -> tim trong array movie
            if (filmList[i].getType() == TYPE.COMEDY && i < 5 && ranking[0] == filmList[i].getRanking()) { 
                System.out.println("Phim comedy co ranking thap nhat la " + movie[i].toString());
                System.out.println("Ten tac gia la: " + movie[i].getDirector());
            }
            // ranking thap nhat voi i >=5 -> tim trong array series
            if (filmList[i].getType() == TYPE.COMEDY && i >= 5 && ranking[0] == filmList[i].getRanking()) {  
                System.out.println("Phim comedy co ranking thap nhat la " + series[i - 5].toString());
                System.out.println("Ten tac gia la: " + series[i].getDirector());
            }
        }
    }
}
