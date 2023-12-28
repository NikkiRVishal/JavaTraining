public class FunctionsInJava {

    //three types of methods/functions:
    //1 no return type and no input
    //2 no return type and some input
    //3 return type and input
    void test(){
        System.out.println("void test()");
       // return;
    }

    String getTrainerName(){
        System.out.println("Get trainer name");
        String name="Zaki";
        return name;
    }

       int getPopulation(){
        int india=100;
        int us=50;
        return india+us;
       }

     int  getStudentMarks(String name){

        int marks=0;
        if(name.equals("sachin")){
            marks=90;
        }
        else if(name.equals("Nikita")){
            marks=96;
        }
        else{
            System.out.println("Student name "+name+" is not found");
        }
        return marks;
     }

    public static void main(String[] args) {
        FunctionsInJava func=new FunctionsInJava();
        //func.test();
        //String name=func.getTrainerName();
        //System.out.println(name);

        System.out.println(func.getTrainerName());

        System.out.println(func.getPopulation());
        System.out.println(func.getStudentMarks("Nikita"));

    }

}
