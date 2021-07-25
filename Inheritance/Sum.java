class A
{
int add(int n1, int n2)
{
return (n1+n2);
}
int add(int n1, int n2, int n3)
{
return (n1+n2+n3);
}
}

class B extends A
{
int add(int n1,int n2, int n3,int n4)
{
return (n1+n2+n3+n4);
}
int add(int n1,int n2, int n3,int n4,int n5)
{
return (n1+n2+n3+n4+n5);
}
}

class Sum
{
public static void main(String args[])
{
B b = new B();
System.out.println(b.add(5,1));
System.out.println(b.add(5,1,5));
System.out.println(b.add(5,1,4,2));
System.out.println(b.add(5,1,4,1,1));
}
}