interface Hop
{
static int getJumpHeight(){
return 8;
}
}

public class Bunny implements Hop
{
public static void main(String args[])
{
System.out.println(Hop.getJumpHeight());
}
}