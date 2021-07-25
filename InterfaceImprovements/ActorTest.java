interface Actor
{
void act();
void speak();
default public void comedy()
{
System.out.println("Comedy");
}
}

class Hero implements Actor
{
public void act()
{
System.out.println("I can act");
}

public void speak()
{
System.out.println("I can speak");
}

public void comedy()
{
System.out.println("I can do comedy");
}

}

class Villan implements Actor
{
public void act()
{
System.out.println("I can act");
}

public void speak()
{
System.out.println("I can speak");
}
}

class ActorTest
{
public static void main(String args[])
{
Hero h = new Hero();
Villan v = new Villan();
h.comedy();
v.comedy();
}
}