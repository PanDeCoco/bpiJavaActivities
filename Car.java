public class Car extends Vehicle implements Refuelable {
    
    @Override
    public void startEngine() {
        System.out.println(getBrand() + " Car engine started!");
    }

    @Override
    public void refuel() {
        System.out.println(getBrand() + " Car Refueled!");
    }
    @Override
    public void destroy() {
        System.out.println(getBrand() + " Car DESTROY!");
    }
}
