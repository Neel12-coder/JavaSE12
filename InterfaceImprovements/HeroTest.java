interface Actor10
{
public void act();
}

class HeroTest
{
public static void main(String args[])
{
Actor10 h1 = () -> System.out.println("I can say");
h1.act();
}
}