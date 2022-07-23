  package DAY02;

import javax.sound.sampled.SourceDataLine;
import javax.swing.border.StrokeBorder;

public class Main {
  public static void main(String[] args){


  String s1 = "cat";
    System.out.println(s1);

  String s2 = "cat";
    System.out.println(s2);

  String s3 = new String("cat");
    System.out.println(s3);

  String s4 = new String("cat");
    System.out.println(s4);

  String s5 = "Dog";
    System.out.println(s5);

  String s6 = new String("Dog");
    System.out.println(s6);

  System.out.println(s1 == s2);
  System.out.println(s1 == s3);
  System.out.println(s3 == s4);


    System.out.println(s3 .equals(s4));
    System.out.println(s3.equals(s1));
    System.out.println(s1.equals(s2));

    String txt = "Toi la coder";
    System.out.println("length: " + txt.length());
    // CHieu dai

    System.out.println("chu hoa: " + txt.toUpperCase());
    // chuyen thanh chu hoa

    System.out.println("chu thuong: " + txt.toLowerCase());
    // chuyen thanh chu thuong


    char ch = txt.charAt(5);
    System.out.println("ky tu: " + ch);


    int firstIndex = txt.indexOf("o");
    System.out.println("first index: " + firstIndex);

    int lastIndex = txt.lastIndexOf("o");
    System.out.println("last index: " + lastIndex);

    firstIndex = txt.indexOf("k");
    System.out.println("first index: " + firstIndex);

    

    String subString = txt.substring(1);
    System.out.println("sub string: " + subString);



    subString = txt.substring(1, 5);
    System.out.println("sub string 2: " + subString);




    int index =  txt.indexOf("la");
    System.out.println("thu tu cua chu la: " + index);


    


    




  }
  
}


