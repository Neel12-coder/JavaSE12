class Area1
{

public static float Area(float len,float wid)
{
return (len*wid);
}
}

class StaticM
{
public static void main(String args[])
{
System.out.println("Area of Rectangle = "+Area1.Area(1.5f,2f));
}
}