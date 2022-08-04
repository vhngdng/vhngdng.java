public class Book {
    public String maSach;
    public String tenSach;
    public String tacGia;
    public String theLoai;
    public String nhaSanXuat;
    public int namSanXuat;



    public Book(String maSach, String tenSach,
                String tacGia, String theLoai, 
                String nhaSanXuat, int namSanXuat){
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.nhaSanXuat = nhaSanXuat;
        this.namSanXuat = namSanXuat;
    }


    public boolean hasKeyWord (String keyword ) {
        boolean result = this.tenSach.contains(keyword);
        return result;
    }


    // public boolean checkPublishYear (int year) {
    //     // boolean result = this.namSanXuat;
    // }
    // // public getBookInfo (){

    // }


}



  
