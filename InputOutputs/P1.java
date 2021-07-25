import java.io.*;
class P1
{
public static void main(String args[])
{
PrintStream ps = new PrintStream(System.out);
ps.format("%2$d is bigger than %d %n",10,5); // $ is for position
ps.close();
}
}

