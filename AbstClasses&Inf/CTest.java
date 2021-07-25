interface MU
{
void FE();
void SE();
void TE();
void BE();
}

class VESIT implements MU
{
public void FE()
{
System.out.println("VESIT will check FE papers on behalf of MU");
}
public void SE()
{
System.out.println("VESIT will check SE papers on behalf of MU");
}
public void TE()
{
System.out.println("VESIT will check TE papers on behalf of MU");
}
public void BE()
{
System.out.println("VESIT will check BE papers on behalf of MU");
}
}

class FA implements MU
{
public void FE()
{
System.out.println("FA will check FE papers on behalf of MU");
}
public void SE()
{
System.out.println("FA will check SE papers on behalf of MU");
}
public void TE()
{
System.out.println("FA will check TE papers on behalf of MU");
}
public void BE()
{
System.out.println("FA will check BE papers on behalf of MU");
}
}

class CTest
{
public static void main(String main[])
{
VESIT t = new VESIT();
t.FE();
t.SE();
t.TE();
t.BE();

FA r = new FA();
r.FE();
r.SE();
r.TE();
r.BE();
}
}