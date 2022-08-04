import java.util.Scanner;



public class Lab05 {
    

   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] bookList = new Book[5];
        bookList[0] = new Book("BOOK01", 
                              "Toan hoc",
                               "Nguyen Van A",
                              "SGK",
                           "Giao duc", 
                           1998);

        bookList[1] = new Book("BOOK02",
                              "Van hoc",
                               "Nguyen Thi A",
                              "SGK",
                           "Giao duc",
                           1997);

        bookList[2] = new Book("BOOK03",
                              "Toan hoc",
                               "Nguyen Van B", 
                              "Tham khao",
                           "Giao duc",
                           2022);
        bookList[3] = new Book("BOOK04",
                              "Toan nang cao",
                               "Nguyen Van C",
                              "Tham khao",
                           "Tre", 
                           2021);
        bookList[4] = new Book("BOOK05",
                              "One Piece",
                               "Echiro Oda",
                              "Manga",
                           "Kim Dong",
                           2022);


        for (Book book: bookList) {
            System.out.println(book.tenSach);
        }

        System.out.println("Nhap tu khoa ten sach");
        String keyword = scanner.nextLine();
        scanner.close();
        boolean check = true;
        for (int index = 0; index < bookList.length; index++) {
            Book book = bookList[index];
            String tenSach = book.tenSach;
            if (book.hasKeyWord(keyword)) {
                System.out.println(tenSach);
            }else{
                check = false;
                
            }
        }
        
        if ( check == false) {
            System.out.println("Khong tim thay");
        }

        // int checkYear = 2022;
        // for (Book book : bookList ) {
        //     if (book.checkPublishYear(checkYear) ) {
        //         System.out.println("Sach xuat ban nam " + checkYear + ":" + book.namSanXuat);
            }
        }


