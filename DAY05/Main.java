

public class Main {

    enum Season{
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER,
    }

    static int sum (int x , int y){
        int total = x + y;
        return total;
    }

 public static void main (String[] args){

    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    Dog dog3 = new Dog();
    
    System.out.println("dog1: " + dog1.bread);
    System.out.println("dog2: " + dog2.bread);
    System.out.println("dog3: " + dog3.bread);

    
    
    System.out.println("dog1: " + dog1.age);
    System.out.println("dog2: " + dog2.age);
    System.out.println("dog3: " + dog3.age);


    System.out.println(dog1 == dog2);

    dog1.bread = "Neapolitan Mastiff";
    dog1.size = "Large";
    dog1.age = 5;
    dog1.color = "Black";

    dog2.bread = "Maltese";
    dog2.size = "Small";
    dog2.age = 2;
    dog2.color = "white";

    dog3.bread = "Chow chow";
    dog3.size = "Midium";
    dog3.age = 3;
    dog3.color = "Brown";

    dog1.eat();
    dog2.eat();

    dog1.bark();
    dog2.bark();
    
   

    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(dog3);


    Dog dog4 = new Dog("Bec-gie", "Large", 10, "Black");
    dog4.gender = GENDER.MALE;
    dog4.printGender();
    dog4.print();
    System.out.println(dog4.bread);
    System.out.println(dog4.size);
    System.out.println(dog4.age);
    System.out.println(dog4.color);


    Dog dog5 = new Dog("chihuahua", "Small", 2, "Yellow");
    dog5.print();

    Dog.var = 1;

    sum(2, 4);


    Season season = Season.AUTUMN;
    System.out.println(season);

    }
}