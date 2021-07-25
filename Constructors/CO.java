class Rect
{
private int length;
private int width;

public Rect()
{
this.length = 4;
this.width = 5;
}

public Rect(int l)
{
length = width = l;
}

public Rect(int l , int w)
{
length = l;
width = w;
}

public int areaRect()
{
return (length*width);
}
}

class CO
{
public static void main(String args[])
{
Rect r = new Rect();
System.out.println("Area of Rectangle = "+r.areaRect());

Rect r1 = new Rect(5);
System.out.println("Area of Rectangle = "+r1.areaRect());

Rect r2 = new Rect(7,8);
System.out.println("Area of Rectangle = "+r2.areaRect());

}
}