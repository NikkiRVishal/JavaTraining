package interfaceConcepts;

public interface Test {
    // Interface variables are by default:
    // 1) final
    // 2) static
    int a=10;
    // Indirectly it is written as static final int a=10;
    final int b=20;
    final int c=3;
    //
    //Method definition...It's not allowed inside interface
   /* void test(){
        System.out.println("test");
    }*/
    //Method declaration....It's allowed inside interface
    void test();

    abstract void test(int a);

    public static void main(String[] args) {

        System.out.println("I am in interface Test");
        System.out.println("Value of a is: "+a);
        //a=20;

    }
}
