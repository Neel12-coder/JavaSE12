class P1
{
public static void main(String args[])
{
int n = Integer.parseInt(args[0]);
int fact = 1;
while (n>0)
{
fact = fact * n;
n-=1;
}
System.out.println("Factorial using while loop = "+fact);

}
}