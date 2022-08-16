import alo.CanShoot;

public class Lucian implements CanShoot, CanSurf {
    private String hair = "black";
    private String weapon = "pistols";
    private String name = "LUcian";
    @Override
    public void shoot() {

        System.out.println("Can shoot");
        
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

    public void print () {
        System.out.println();
    }
}
