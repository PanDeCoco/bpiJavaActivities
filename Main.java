public class Main {
    public static void main(String[] args) {
        
        // Create an object of Car and pass values through constructor
        Car car = new Car("toyota", "fortuner", "pink");

        // Display initial car details
        car.display();

        // Update car details using setter methods
        car.setBrand("Toyota");
        car.setModel("supra");
        car.setColor("red");

        // Display updated car details
        car.display();
    }
}