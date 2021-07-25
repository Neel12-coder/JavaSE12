class Parent
{
public void print(double b)
{
System.out.println("Parent");
}
}

class Child extends Parent
{
public void print(int b)
{
System.out.println("Child");
}
}

class P1
{
public static void main(String args[])
{
new Child().print(1.2);
new Child().print(4);
}
}