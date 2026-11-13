public class Car extends Vehicle implements Serviceable {
    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " " + getModel()
                + " (Car): moves along the road.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Doors: " + doors);
    }

    @Override
    public void service() {
        System.out.println("Car: check oil and brakes.");
    }
}