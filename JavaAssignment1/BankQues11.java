 class BankQues11 {
     float rateofinterest;
     String branchname;
     void getDetails(){

    }
}
class SBI extends BankQues11{
    void getDetails() {
        branchname="Nawada ";
        System.out.println("Branch Name of SBI :"+branchname);
        rateofinterest=2.4f;
        System.out.println("Rate of Interest of SBI is : "+rateofinterest);
    }}
    class BOI extends BankQues11{

        void getDetails() {
            branchname="Noida ";
            System.out.println("Branch Name of BOI :"+branchname);
            rateofinterest=5.4f;
            System.out.println("Rate of Interest of BOI is : "+rateofinterest);
        }
    }
    class ICICI extends BankQues11{

        void getDetails() {
            branchname="Gurgaon";
            System.out.println("Branch Name of ICICI :"+branchname);
            rateofinterest=4.4f;
            System.out.println("Rate of Interest of ICICI is : "+rateofinterest);
        }
    }

