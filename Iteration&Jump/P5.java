class P5
{
static public void main(String...a)
{
int i=10;
switch (i<10) // bool cannot be converted to int
{
case true:System.out.println("A");
break;
case false: System.out.println("B");
break;
}
}
}