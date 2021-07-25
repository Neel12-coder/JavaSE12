import java.util.*;
class P2
{
public static void main(String args[])
{
String data = "23w41w51w5w6";
Scanner scan = new Scanner(data);
scan.useDelimiter("w");

int a,b,c,sum;
a = scan.nextInt();
b = scan.nextInt();
c = scan.nextInt();
sum = a + b + c;
System.out.println("sum= "+sum);
}
}