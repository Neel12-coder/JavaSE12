class P1
{
public static void main(String args[])
{
String data = "23 4 51 5 6";
String num[] = data.split(" ");
int a,b,c,sum;
a = Integer.parseInt(num[0]);
b = Integer.parseInt(num[1]);
c = Integer.parseInt(num[2]);
sum = a + b + c;
System.out.println("sum= "+sum);
}
}