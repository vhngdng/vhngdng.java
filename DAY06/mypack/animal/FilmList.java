package mypack.animal;

import java.util.Scanner;

public class FilmList {
    static FilmList filmList;
    
    private String id;
    private String title;
    private TYPE type;
    private double ranking;
    private String director;

    public String getID(){
        return this.id;
    }

    public String setID(String id) {
        return this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public String setTitle(String title) {
        return this.title = title;
    }
    
    public TYPE getType(){
        return this.type;
    }

    public TYPE setType(TYPE type) {       
    
        return this.type = type ;
    }

    public double getRanking(){
        return this.ranking;
    }

    public double setRanking(double ranking) {
        return this.ranking = ranking;
    }

    public String getDirector(){
        return this.director;
    }

    public String setDirector(String director) {
        return this.director = director;
    }


   public static boolean checkTitle(){
    Scanner scanner = new Scanner(System.in);
    
    boolean result;

    System.out.println("Hay nhap tu khoa");
    String keyword = scanner.nextLine();
    result = (filmList.getTitle().contains(keyword));
        return result;
   }
}
