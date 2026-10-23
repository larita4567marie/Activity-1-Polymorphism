public class Truck extends Vehicle {
    private double cargoCapacityTons;
    private int wheels = 6;

    public Truck(String brand, String model, int year, double cargoCapacityTons) {
        super(brand, model, year);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public void startEngine() {
        System.out.println(getBrand() + " " + getModel() + " (Truck): diesel engine starts with a deep rumble.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck, Wheels: " + wheels + ", Cargo Capacity: " + cargoCapacityTons + " tons");
    }
}