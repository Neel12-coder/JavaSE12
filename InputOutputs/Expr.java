import java.io.*;
class Expr
{

public static void main(String args[]) throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("Enter value1: ");
int a = Integer.parseInt(br.readLine());

System.out.println("Enter value2: ");
int b = Integer.parseInt(br.readLine());

double a1 = Math.cos(a);
double a2 = Math.sin(b);

double s = Math.sqrt(a1+a2);

System.out.println("Result is: "+s);
}
}