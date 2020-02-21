package Java_Assignment2;

public class WoodenTable extends Table {
    @Override
    public String Tabletype() {
        String string=" Wooden Table";
        return string;

    }

    @Override
    public void StressTest() {
        System.out.println("Stress Test for Wooden Table is Approved...");

    }

    @Override
    public void FireTest() {
        System.out.println("Fire Test for Wooden Table is Approved...");
    }
}
