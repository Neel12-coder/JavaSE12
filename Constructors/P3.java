class P3
{
public static void main(String args[])
{
sum(1,2,3,4);
sum(3,3,3);
}
public static void sum(int...a)
{
int sum = 0;
for (int i =0; i < a.length ; i++)
{
sum+=a[i];
}
System.out.println("Sum = "+sum);

}
}
