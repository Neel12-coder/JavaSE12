public class Test
{
public static void main(String args[])
{
int arr[] = new int[4];
arr[0] = 4;
arr[1] = 4;
arr[2] = 4;
arr[3] = 1;

int sum =0;
try
{
for(int pos=0;pos<=4;pos++)
{
sum+=arr[pos];
}
}
catch (Exception e)
{
System.out.println("Invalid Index");
}
finally{
System.out.println(sum);
}
}
}