

public class ReturnInstance {
    int a;
    int b;

    // Hàm constructor mặc định
    ReturnInstance() {
        a = 1;
        b = 99;
    }

    // Phương thức trả về biến instance của lớp
    ReturnInstance get() {
        return this;
    }

    // Hiện thị giá trị của a và b
    void display() {
        System.out.println("a = " + a + "\nb = " + b);
    }

    public static void main(String[] args) {
        ReturnInstance object = new ReturnInstance();
        object.get().display();
    }
}
 