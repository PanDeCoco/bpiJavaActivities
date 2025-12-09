public abstract class Vehicle {
    private int numberOfWheel;
    private String brand;

    public abstract void startEngine();

    public void destroy() {
        System.out.println("Vehicle is destroyed.");
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public String getBrand() {
        return brand;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    
}
