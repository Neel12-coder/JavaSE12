class P
{
P()
{
System.out.println("Hey, this is DC of class P");
}

P(int i)
{
this();
System.out.println("Hey, this is PC of class P");
}
}

class Q extends P
{
Q()
{
System.out.println("Hey, this is DC of class Q");
}
Q(int i)
{
super(5);
System.out.println("Hey, this is PC of class Q");
}
}

class P2
{
public static void main(String args[])
{
new P();
new Q();
new P(8);
new Q(5);
}
}