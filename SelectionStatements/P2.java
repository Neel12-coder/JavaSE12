class P2
{
public static void main(String args[])
{
int n = Integer.parseInt(args[0]);
int fact = 1;
do
{
fact = fact * n;
n-=1;
}
while (n>0);

System.out.println("Factorial using do while loop = "+fact);

}
}