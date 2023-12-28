package inheritance;

public class Audi extends Car{

    public void engine(){
        System.out.println("Audi---Engine");
    }

    public void test(){
        System.out.println("Audi---Test");
    }
    public static void test(int a){
        System.out.println("Audi----test()");
    }

    public static void main(String[] args) {
       /*Car carObj=new Car();
        carObj.engine();
        carObj.start();

        Audi audiObj=new Audi();
        audiObj.engine();
        audiObj.start();
        audiObj.test();
   */

       Car carAudiObj= new Audi();
       carAudiObj.start();

       carAudiObj.engine();



       //carAudiObj.test();

    }
}