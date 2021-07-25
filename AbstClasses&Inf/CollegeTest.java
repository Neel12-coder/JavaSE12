abstract class MU
{
void FE()
{
System.out.println("MU will check FE papers");
}
abstract void SE();
abstract void TE();
void BE()
{
System.out.println("MU will check BE papers");
}
}

class RAIT extends MU
{
void SE()
{
System.out.println("RAIT will check SE papers on behalf of MU");
}
void TE()
{
System.out.println("RAIT will check TE papers on behalf of MU");
}
}

class TSEC extends MU
{
void SE()
{
System.out.println("TSEC will check SE papers on behalf of MU");
}
void TE()
{
System.out.println("TSEC will check TE papers on behalf of MU");
}
}

class CollegeTest
{
public static void main(String main[])
{
TSEC t = new TSEC();
t.FE();
t.SE();
t.TE();
t.BE();

RAIT r = new RAIT();
r.FE();
r.SE();
r.TE();
r.BE();
}
}