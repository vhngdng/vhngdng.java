public class Dog extends Animal {
    public Dog (String name, String breed ){
        this.name = name;
        this.breed = breed;
    }
    @Override
    public void speak () {
        System.out.println(this.name + " Speak: Go Go !!!");
    }
    

    public void move () {
        super.move();
        System.out.println(super.getName() + " Dog move");
    }
}
