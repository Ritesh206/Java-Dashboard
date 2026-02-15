
public class Test {
    int id;
    String name;
    int age;

    /*static void Test(int i,String n)
    {
        //System.out.println("form m1");
        id=i;
        name=n;
    }*/
    Test(int i,String n)
    {
        //System.out.println("form m1");
        id=i;
        name=n;
    }
    Test(int i,String n,int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String[] args)
    {
        Test m1=new Test(1,"Ritesh");
        Test m2=new Test(2,"Ritesh Raj",22);
        m1.display();
        m2.display();
    }
}