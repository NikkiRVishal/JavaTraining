package superKeyword;

public class TestBank {
    public static void main(String[] args) {
       // HDFCBank hdfcObj=new HDFCBank();
       // System.out.println(hdfcObj.min_bal);
       // hdfcObj.balanceDisplay();

        HDFCBank hdfcBank=new HDFCBank(10);
        hdfcBank.balanceDisplay();

    }
}
