class RectangleTest
{
// Instance Variable
private int length;
private int breadth;

//No Constructor --> Default Constructor will be added

//Instance Methods
public void setDim(int l, int b)
{
length = l;
breadth = b;
}

public void getDim()
{
System.out.println("Length = "+length+" Breadth= "+breadth);
}

public int rectArea()
{
int area; //Local variable 
area = length * breadth;
return area;
}
}

class Rectangle
{
public static void main(String args[])
{
// calling a DC to initialize instance variables

RectangleTest r1 = new RectangleTest();
r1.setDim(5,5);
r1.getDim();
int ans = r1.rectArea();
System.out.println("Area of rectangle is "+ans);

RectangleTest r2 = new RectangleTest();
r2.setDim(5,7);
r2.getDim();
int ans1= r2.rectArea();
System.out.println("Area of rectangle is "+ans1);

}}

// Good encapsulation is keeping data private and methods public

