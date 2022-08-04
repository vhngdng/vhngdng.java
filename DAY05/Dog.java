enum GENDER {
        MALE,
        FEMALE
    }

public class Dog {
    public String bread;
    public String size;
    public int age;
    public String color;
    public GENDER gender;
    public static int var;


    // public int gender;  1 = male; 2 = female

    

    public Dog(){
        bread = "abx";
        size = "Small";
        age = 2;
        color = "Grey";
    }

    public Dog(String bread, String size, int age, String color){
        this.bread = bread;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void printGender() {
        if (this.gender == GENDER.MALE) {
            System.out.println("gioi tinh duc");
        }else if (this.gender == GENDER.FEMALE) {
            System.out.println("gioi tinh cai");
        }else {
            System.out.println("ko biet gioi tinh");
        }
    }

    public void eat(){
        System.out.println("mum mum mum");
    }

    public void bark(){
        System.out.println("go go go.....");
    }

    /* in ra ten cac thuoc tinh */
    public void print() {
        
        // System.out.println(bread);
        // System.out.println(size);
        // System.out.println(age);
        // System.out.println(color);
        String textToPrint = this.toString();
        System.out.println(textToPrint);
    }
        public String toString(){
            String text = this.bread + " " + this.size + " " + this.age  + " years old" + " " + this.color;
            return text;
        }
   
   
   
    }



    

