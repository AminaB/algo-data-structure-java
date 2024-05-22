public class InheritanceCar {
}

class Car{
 public void start(){
     System.out.println("Car started");
 }
    public void accelerate(){
        System.out.println("Car is accelerated");
    }
    public void changeGear(){
        System.out.println("Car Gear changed");
    }
}
class LuxuryCar extends Car{
    public void changeGear(){
        System.out.println("Automatic Gear");
    }
    public void openRoof(){
        System.out.println("Sun Roof is opened");
    }
}