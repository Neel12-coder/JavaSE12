class NS
{
public void address()
{
System.out.println("AT,Mumbai");
}
}

class NS1 extends NS
{
public void address()
{
System.out.println("DT,Noida");
}
}

class Test
{
public static void main(String args[])
{
NS1 n = new NS1();
n.address();
NS n1 = new NS();
n1.address();
}
}