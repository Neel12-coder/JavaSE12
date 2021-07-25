class P2
{
public static void main(String args[])
{
try
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int r = a/b;
System.out.println(r);
}
catch(NumberFormatException e)
{
System.out.println("Wrong data");
}
catch (ArrayIndexOutOfBoundsException e)
{
System.out.println("Please Provide a integer");
}
catch(ArithmeticException e)
{
System.out.println("Invalid operation");
}
catch (Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("Bye Bye");
}
}
}