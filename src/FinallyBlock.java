public class FinallyBlock {
    public static void main(String[] args) {

        int a=10;
        int b=2;
        try{
            System.out.println(a/b);
        }
        //System.out.println(20/0);
        catch(Exception ex){
            System.out.println("I am in catch block");
        }
       // System.out.println(20/0);
        finally {
            System.out.println("I am in finally block");
        }
    }
}
