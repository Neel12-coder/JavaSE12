public class Trial
{
static void dispResult(int[] num){
try{
System.out.println(num[1]/(num[1]-num[2]));
}
catch (ArithmeticException e)
{
System.out.println("Divide by zero Error");
}
}

public static void main(String args[])
{
try
{
int arr[] = {100,102};
dispResult(arr);
}
catch (IllegalArgumentException e)
{
System.out.println("Second Exception");
}
catch (Exception e)
{
System.out.println("Third Exception");
}
}
}