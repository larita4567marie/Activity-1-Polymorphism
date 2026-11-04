public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void startEngine() {
        System.out.println(getBrand() + " " + getModel() + " (Car): engine starts with a push-button ignition.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Doors: " + doors);
    }
}