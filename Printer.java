public class Printer implements Serviceable {

    @Override
    public void service() {
        System.out.println(
                "Printer: clean rollers and check ink.");
    }
}