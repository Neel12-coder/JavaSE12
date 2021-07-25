class Atom
{
Atom()
{
System.out.print("atom");
}
}
class Rock extends Atom
{
Rock(String type)
{
System.out.println(type);
}
}
class Mountain extends Rock
{
Mountain()
{
super("granite");
new Rock("granite");
}
public static void main(String args[])
{
new Mountain();
}
}