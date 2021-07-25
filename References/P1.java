class Parent
{
int a = 10;
protected void sayHi()
{
System.out.println("Hi");
}
}
class Child extends Parent
{
int a = 10;
public void sayHi()
{
System.out.println("Hello");
}
}
class P1
{
public static void main(String args[])
{
Parent c = new Child();
c.sayHi();
System.out.println(c.a);
}
}