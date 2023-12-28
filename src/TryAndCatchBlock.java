public class TryAndCatchBlock {

String name="Nikita";

    public static void main(String[] args) {

        int a=10;
        int b=0;
             TryAndCatchBlock obj=null;

        System.out.println("Before Exception");
       try{
           System.out.println("I am inside try");
           System.out.println(a/b);
           System.out.println(obj.name);
       }
       catch (NullPointerException e){
           System.out.println("This is null pointer exception block");
       }
       catch (ArithmeticException ae){
           System.out.println("This is arithmetic exception block");
       }
       catch(Exception ex){
           System.out.println("I am in catch");
           ex.printStackTrace();

       }
        System.out.println("After Exception");

    }

}
