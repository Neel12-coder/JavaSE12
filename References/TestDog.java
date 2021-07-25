class Dog
{
protected String bark()
{
return "woof";
}
}

class Beagle extends Dog
{
public String bark()
{
return "arf";
}
}

class TestDog
{
public static void main(String args[])
{
Dog[] dog = {new Dog(),new Beagle()};
for (Dog d: dog)
System.out.println(d.bark());
}
}