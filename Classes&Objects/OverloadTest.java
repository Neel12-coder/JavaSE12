class Overload
{
public float Area(float l,float w)
{
return (l*w);
}

public float Area(float r)
{
return (3.145f*r*r);
}

}
class OverloadTest
{
public static void main(String args[])
{
Overload c1 = new Overload();
System.out.println("Area of Rec = "+c1.Area(2.1f,3.5f));
System.out.println("Area of Rec = "+c1.Area(2.1f));
}
}

