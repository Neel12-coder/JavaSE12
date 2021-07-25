class P1
{
public static void main(String args[])
{
double a;

a = Double.parseDouble(args[0]);

final double PI = 3.145;

double cir = PI*a*2;

System.out.printf("Circumference of circle = %-8.3f ",cir);
}
}