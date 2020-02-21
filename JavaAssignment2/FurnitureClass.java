package Java_Assignment2;

public class FurnitureClass {
    public static void main(String[] args) {
        MetalChair metalChair=new MetalChair();
        WoodenChair woodenChair=new WoodenChair();

        MetalTable metalTable=new MetalTable();
        WoodenTable woodenTable=new WoodenTable();


        System.out.println("Chair Type is : "+metalChair.ChairType());
        metalChair.FireTest();
        metalChair.StressTest();

        System.out.println("##################################");

        System.out.println("Chair Type is : "+woodenChair.ChairType());
        woodenChair.FireTest();
        woodenChair.StressTest();

        System.out.println("##################################");

        System.out.println("Table Type is : "+metalTable.Tabletype());
        metalTable.FireTest();
        metalTable.StressTest();

        System.out.println("##################################");


        System.out.println("Table Type is : "+woodenTable.Tabletype());
        woodenTable.FireTest();
        woodenTable.StressTest();


    }
}

