public class People {
    private String name;
    private String position;
    public People(String name, String position) {
        this.name = name;
        this.position = position;
    }
    @Override
    public String toString() {
        return position + ": " + name;
    }

    
}
