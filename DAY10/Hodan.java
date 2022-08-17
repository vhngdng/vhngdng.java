import java.util.ArrayList;

public class Hodan {
    private int numberOfMembers;
    private String houseNumber;
    private ArrayList<Person> family;



    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    public void setPeople(ArrayList<Person> family) {
        this.family = family;
    }
    @Override
    public String toString() {
        return "Hodan [family=" + family + ", houseNumber=" + houseNumber + ", numberOfMembers=" + numberOfMembers
                + "]";
    }

    
}
