class Circle
{
// instance variable
private double radius;

// constant
final static double PI = 3.1459;

public void setRad(double r)
{
radius = r;
}

public double Area()
{
double area = PI*radius*radius;
return area;
}

public double Peri()
{
double peri = 2*PI*radius;
return peri;
}

}

class CircleTest
{
public static void main (String args[])
{

Circle c1 = new Circle();
c1.setRad(1);
double a = c1.Area();
double p = c1.Peri();
System.out.println("Area= "+a+" Perimeter= "+p);
}
}



