class P1
{
public static void main(String args[])
{
try
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
int sum = a + b + c;

System.out.println("Addition = "+sum);
}
catch(NumberFormatException e)
{
System.out.println("Exception thrown is "+e);
}
finally
{
System.out.println(" BYe BYE Buddy");
}
}
}
