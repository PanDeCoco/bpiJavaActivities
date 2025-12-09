public class Main {
    
    public static void main(String[] args) {
        Truck myTruck =  new Truck();
        Car myCar = new Car();

        
        myTruck.setBrand("HIWO");
        myTruck.startEngine();
        myTruck.refuel();

        myCar.setBrand("TOYOTA");
        myCar.startEngine();
        myCar.refuel();
        
        destroyVehicle(myTruck);
        destroyVehicle(myCar);
    }
    
    public static void destroyVehicle(Vehicle vehicle) {
        vehicle.destroy();
    }
}
