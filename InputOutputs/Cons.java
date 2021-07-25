import java.io.*;
class Cons
{
public static void main(String args[])
{
Console c = System.console();
System.out.println("Username: ");
String un = c.readLine();
System.out.println("Password: ");
char[] pw = c.readPassword();
System.out.println("Got Password: "+pw);
}
}

