class P1
{
public static int c1(int n)
{
n = 30;
return n;
}

public static void main(String args[])
{
int n = 15;
System.out.println("n= "+n);
n = c1(n);
System.out.println("n= "+n);
}

}