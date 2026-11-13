public class Motorcycle extends Vehicle implements Serviceable {
    private int engineCC;

    public Motorcycle(String brand, String model,
                      int year, int engineCC) {
        super(brand, model, year);
        this.engineCC = engineCC;
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " " + getModel()
                + " (Motorcycle): moves along the road.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Engine: "
                + engineCC + " cc");
    }

    @Override
    public void service() {
        System.out.println(
                "Motorcycle: inspect tires and brakes.");
    }
}