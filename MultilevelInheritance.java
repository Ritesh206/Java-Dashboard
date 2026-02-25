class A1{
    int d=10;
    int c=12;
    int f=40;
    /*public void Animal()
    {
        System.out.println("Value of d"+d);
    }*/
}
class B1 extends A1{
    void Animal1(){
        System.out.println("Value of dog is "+d);
    }
}
class C1 extends B1{
    void Animal2(){
        System.out.println("Value of dog and cat is "+(d+c));
        System.out.println("Value of fish is "+f);

    }

}
public class MultilevelInheritance {
    public static void main(String[] args) {
        C1 cc = new C1();
        cc.Animal1();
        cc.Animal2();
    }
}
