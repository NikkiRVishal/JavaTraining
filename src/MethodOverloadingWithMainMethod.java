public class MethodOverloadingWithMainMethod {

    // We can overload the main method
    //We can call static method with the method name inisde the same class.....Like calling  main();
    //We can call static methods with the class name...Like calling MethodOverloadingWithMainMethod.main();
    // We can call static method with the object refernce as well but that is not recommended...like calling obj.main();
    public static void main(String[] args) {
        System.out.println("main(String[] args)");
        main();
        MethodOverloadingWithMainMethod.main();
        main("Test");

        MethodOverloadingWithMainMethod obj=new MethodOverloadingWithMainMethod();
        obj.main();
    }

    public static void main(){
        System.out.println("main()");
    }


    public static void main(String args){
        System.out.println("main(String)");
    }

    public void main(int a)
    {
        System.out.println("main(int)");
    }
}
