class OverloadDemo{
    void test(){
        System.out.println(" No Parameters ");
    }
    // Overload test for one integer parameter
    void test(int a){
        System.out.println("a = "+a);
    }
    //Overload test for two integer parameters
    void test(int a,int b){
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }
    //Overload test function by double parameter
    double test(double a){
        System.out.println("Double a  ="+a);
        return a*a;
    }
}
class Overload{
    public static void main(String args[]){
        OverloadDemo x;
        x=new OverloadDemo();
        double result;
        x.test();
        x.test(10);
        x.test(10, 20);
        result = x.test(123.25);
        System.out.println("Result of x.test(123.25) = "+result);
    }
}