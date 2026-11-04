public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2015, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "CB500", 2020, 500);
        Vehicle truck = new Truck("Isuzu", "Giga", 2018, 12.5);

        Vehicle[] vehicles = {car, motorcycle, truck};

        System.out.println("=== Runtime polymorphism (method overriding) ===");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.startEngine();
            v.move();
            System.out.println();
        }

        System.out.println("=== Compile-time polymorphism (method overloading) ===");
        car.drive(10);
        car.drive(25, "the mall");
        motorcycle.drive(5);
        motorcycle.drive(40, "the beach");
        truck.drive(100);
        truck.drive(250, "the port");
    }
}