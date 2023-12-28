package superKeyword;

public class HDFCBank extends Bank{

    int min_bal=2000;

    public HDFCBank(){
        //By default it will be written like below super()
        //super();
        System.out.println("HDFCBank----HDFCBank()");
    }

    public HDFCBank(int a){
        super(20);
        System.out.println("HDFCBank----HDFCBank(int)");

    }
    @Override
    public void balanceDisplay() {
        //System.out.println("HDFC Bank: "+min_bal);
        //System.out.println("Bank: "+super.min_bal);
        //super.balanceDisplay();
        System.out.println("HDFCBank----BalanceDisplay");
    }
}
