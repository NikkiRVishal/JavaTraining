public class ThrowsKeyword {


    void m3() throws ArithmeticException{
        System.out.println("Before exception m3()");
        int a=10/0;
        System.out.println("After exception m3()");
    }
    void m2(){
        try{
            m3();
        }
        catch(ArithmeticException ex){

        }

    }

    public static void main(String[] args) {
        ThrowsKeyword obj=new ThrowsKeyword();
       // try{
            System.out.println("I am before excep");
            //obj.m3();
            obj.m2();
            System.out.println("I am after excep");
       // }
       // catch(ArithmeticException ex){

       // }

        System.out.println("I am in main method after method call");
    }
}
