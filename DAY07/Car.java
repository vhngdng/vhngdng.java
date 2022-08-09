public class Car {
    String brand;

    public Car (String brand) {
        this.brand = brand;
    }

    // public void horn () {
    //     System.out.println("Tuyt .. tuyt .");
    // }

    public void horn (boolean isCrowd) {
        if (isCrowd) {
            System.out.println("TUY TUY TUY TUY");
        }else {
            System.out.println("Tuy Tuy");
        }
    }

    // car.getColor();  // method cua sedan, chi lay duoc method cua class cha la class Car

    
}
