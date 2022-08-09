

public class Main {
    int y = 2;
    public static void main (String[] args){
        // Animal animal = new Animal();
        // Khong the khoi tao object trong class abstract
        Dog dog = new Dog ("Alex", "Begie");
        dog.speak();
        dog.move();
        
        Sedan sedan = new Sedan("Toyota", "red");
        // sedan.horn();

        Car car = new Sedan("Honda", "white");
        // Sedan sedan1 = new Car("Toyota");

        car.horn(true);
     
    Sedan sedan1 = (Sedan)car;
    sedan1.getColor();


    Car car2 = new Car("Ford");
        // Sedan sedan2 = (Sedan)car2;
        // sedan2.horn(true);

        if(car2 instanceof Sedan) {
            System.out.println("car2 la Sedan");
        }else{
            System.out.println("car2 khong la Sedan");
        }

    Sedan sedan3 = new Sedan("Nissan", "yellow");

    }

    public static void changeColor(Sedan sedan) {
        sedan.setColor("gray");
    }
}