class MyClass1{
    void sum(int a, int b){
        System.out.println("Sum: " + (a+b));
    }
}
class MyClass2 extends MyClass1{
    void sum(int a, int b, int c){
        System.out.println("Sum: " + (a+b+c));
    }
    void sum (int a, int b){
        super.sum(a,b);
       // System.out.println("");
    }
}
public class MethodOverloadingAndOverridding {
    public static void main(String[] args) {
        MyClass2 mc1= new MyClass2();
        mc1.sum(10,20);
        mc1.sum(12,13,14);
        mc1.sum(14,18);
    }
}
