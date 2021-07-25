//multiple inh using interfaces
interface A
{
int x = 20;
void method();
}
interface B
{
int x = 30;
void method();
}
class C implements A,B
{
public void method()
{
System.out.println("Multiple Inh A.x = "+A.x+" B.x "+B.x);
}
public static void main(String args[])
{
C in = new C();
in.method();
}
}