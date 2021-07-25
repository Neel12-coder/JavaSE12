class P1
{
public static void main(String args[])
{
try
{
int a = Integer.parseInt(args[0]);
System.out.println("a = "+a);
}
catch(NumberFormatException|ArrayIndexOutOfBoundsException e)
{
System.out.println("Wrong data");
}
/* catch (ArrayIndexOutOfBoundsException e)
{
System.out.println("Please Provide a integer");
}*/
finally
{
System.out.println("Bye Bye");
}
}
}