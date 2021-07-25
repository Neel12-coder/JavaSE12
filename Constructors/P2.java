// Passing object reference variable
class Employee
{
int n;
}

class P2
{

public static void c1(Employee r)
{
r.n = 45;
}

public static void main(String args[])
{
Employee e = new Employee();
e.n = 12;
System.out.println("n= "+e.n);
c1(e);
System.out.println("n= "+e.n);
}
}
