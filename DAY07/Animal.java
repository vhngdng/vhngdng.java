public abstract class Animal {
    protected String name;
    protected String breed;
    protected double weight;

    public String getName() {
        return this.name;
    }

    public abstract void speak ();

    public void move () {
        System.out.println("Animal move");
    }
}
