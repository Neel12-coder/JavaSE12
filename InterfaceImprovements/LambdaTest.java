interface DoNothing
{
void doNothing();
}

@FunctionalInterface
interface DontDoAnything extends DoNothing
{
}

class LambdaTest
{
public static void main(String args[])
{
DontDoAnything beldle = () -> System.out.println("be idle");
beldle.doNothing();
}
}