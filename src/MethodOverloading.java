public class MethodOverloading {

  //  Method overloading:
    //within the same class,when wehave different methods with:
    //1. The same name
    //2. Different parameters
    //3. The sequence of the parameters should be different
    //Methods overloading also called Static Polymorphism
    void test(){
        System.out.println("test()");
    }

    void test(int a){
        System.out.println("test(int)");
    }

    boolean test(boolean a){
                    return true;
    }
    void test(String str){
        System.out.println("test(String)");
    }

    void test(int a,String str){
        System.out.println("test(int.String)");
    }

    void test(String str,int a){
        System.out.println("test(String,int)");
    }
    public static void main(String[] args) {

        MethodOverloading obj=new MethodOverloading();
        obj.test();

        obj.test(10,"Test");
        obj.test("Test",10);
    }
}
