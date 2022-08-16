import alo.CanSurf;

public class Yasuo implements CanSurf{ 
    private String hair = "green";
    private String weapon = "sword";
    private String name = "Yasuo";
    
    public void display(){
        System.out.println("Yasuo " + hair + "weapon " + weapon );
        surf();
    }

    @Override
    public void surf() {
        // TODO Auto-generated method stub
        System.out.println("Can surf");
    }

    
    /**
     * @return String return the hair
     */
    public String getHair() {
        return hair;
    }

    /**
     * @param hair the hair to set
     */
    public void setHair(String hair) {
        this.hair = hair;
    }

    /**
     * @return String return the weapon
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * @param weapon the weapon to set
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}

