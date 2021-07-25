class Product
{
int id;
String name;
public Product(int id, String name)
{
this.id = id;
this.name = name;
}

public static void main(String args[])
{
Product p = new Product(101,"Pen");
Product p1 = new Product(102,"Pen");
boolean b1 = p==p1;
boolean b2 = p.name.equals(p1.name);
System.out.println(b1 + " " + b2);
}

}