package superKeyword;

public class Bank {

    //super() must be the 1st statement in any child class Constructor
    //If we are not using super in child class constructor then by default super() will be present in child
    // class constructor
 int min_bal=1000;

 public Bank(){
     System.out.println("Bank---Bank()");

 }

    public Bank(int a){
        System.out.println("Bank---Bank(int)");

    }
 public void balanceDisplay(){
     System.out.println("Bank----BalanaceDisplay");
 }
}
