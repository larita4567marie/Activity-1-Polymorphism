public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Runtime (dynamic) polymorphism: subclasses override this method
    public void startEngine() {
        System.out.println(brand + " " + model + ": engine starts.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    // Compile-time (static) polymorphism: method overloading
    public void drive(int km) {
        System.out.println(brand + " " + model + " drove " + km + " km.");
    }

    public void drive(int km, String destination) {
        System.out.println(brand + " " + model + " drove " + km + " km to " + destination + ".");
    }
}