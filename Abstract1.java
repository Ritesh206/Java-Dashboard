import java.util.Scanner;

 abstract class A4{
    int x;
    int y;
    void test (int a, int b){
        System.out.println("Sum = "+(a+b));
    }
    abstract void sub();
    abstract void div();
}
class B4 extends A4{
    @Override
    void sub() {
        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();
        y = scn.nextInt();
        System.out.println("Sum ="+ (x-y));
    }
    void div(){
        System.out.println("Ritesh");
    }
}
class C4 extends A4{
    void div(){
        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();
        y = scn.nextInt();
        System.out.println("Div ="+ (x/y));
    }

    @Override
    void sub() {
        System.out.println("Ritesh2");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        B4 bbb = new B4();
        C4 ccc = new C4();

        bbb.test(23,56);
        bbb.sub();
        ccc.div();
        bbb.div();
        ccc.sub();
    }
}
