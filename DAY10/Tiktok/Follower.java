public class Follower extends Song {
    private String email;
    private int numberOfLike;
    protected Follower follower;
    

    public Follower(String name,int Id, String email) {
        this.email = email;
        follower.setName(name);
        follower.setId(Id);
        
    }


    public Follower(String name, int Id, String email, int numberOfLike) {
        follower.setName(name);
        follower.setId(Id);
        this.email = email;
        this.numberOfLike = numberOfLike;
    }


    public String getEmail() {
        return email;
    }


    public int getNumberOfLike() {
        return numberOfLike;
    }


    public Follower getFollower() {
        return follower;
    }


    @Override
    public String toString() {
        return "Name of follower: " + this.getName() + ", email: " + email + ", numberOfLike: " + numberOfLike;
    }

    
    
}
