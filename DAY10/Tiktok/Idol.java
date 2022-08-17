import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class Idol extends Follower{
    
  

    private ArrayList<Follower> follower = new ArrayList<>();
    private String group;

    public Idol(String name, int Id, String email) {
        super(name, Id, email);
        //TODO Auto-generated constructor stub
    }

    public void setFollower(ArrayList<Follower> follower) {
        this.follower = follower;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    
      @Override
    public String toString() {
        return "Idol: " + this.getName() + ", id: " + this.getId() + ", email:" + this.getEmail() + "follower=" + follower + ", group=" + group + "]";
    }

}
