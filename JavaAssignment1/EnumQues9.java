enum House{
    Cottage(200),Deluxehouse(150),Apartment(200);
   private int price;
    House(int p){
    price=p;
    }
    int getPrice(){
        return price;
    }
}
public class EnumQues9 {
    public static void main(String[] args){

        System.out.println();
        for(House h : House.values())
            System.out.println(h+" Costs : "+h.getPrice()+" Lakh");
    }
}
