class Overloading
{
public void x(int i)
{
System.out.println("one");
}

public void x(String s)
{
System.out.println("two");
}

public void x(double d)
{
System.out.println("three");
}

public static void main(String args[])
{
new Overloading().x("A"); //udta hua obj
}
}