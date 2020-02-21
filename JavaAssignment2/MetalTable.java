package Java_Assignment2;

public class MetalTable extends Table {
    @Override
    public String Tabletype() {
    String string="Metal Table";
    return string;
    }

    @Override
    public void StressTest() {
        System.out.println("Stress Test for MetalTable is approved ");

    }

    @Override
    public void FireTest() {
        System.out.println("Fire Test for MetalTable is approved ");

    }
}
