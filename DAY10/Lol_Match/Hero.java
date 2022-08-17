public class Hero {
   private String name;
   private String position;

   public Hero(String name, String position) {
    this.name = name;
    this.position = position;
}

@Override
public String toString() {
    return "Hero: name = " + name + ", position = " + position + "\n";
}
    
    
}
