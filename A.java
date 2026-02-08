class A
{
int a;
float b;
A()
{
this(10,12);
System.out.print("abc");
}
A(int a)
{
System.out.print(a);
}
A(int a,float b)
{
this.a=a;
this.b=b;
System.out.print(a+" "+b);
}
public static void main(String[] args)
{
A r1=new A(30);
A r2=new A(5,22);
}
}