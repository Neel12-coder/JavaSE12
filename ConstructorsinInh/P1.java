class A
{
A()
{
System.out.println("1");
}
}

class B extends A
{
B()
{
System.out.println("2");
}
B(int i)
{
System.out.println("3");
}
}

class P1
{
public static void main(String args[])
{
A a = new A();
B b = new B();
B b1 = new B(5);
}
}