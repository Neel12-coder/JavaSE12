class P3
{
public static void main(String args[])
{
int num = Integer.parseInt(args[0]);
int res = num%2;
switch(res)
{
case 0: System.out.println("Even");
               break;
case 1:
case -1: System.out.println("Odd");
                break;
}
}
}
