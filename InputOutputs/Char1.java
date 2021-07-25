import java.io.*;
class Char1
{
public static void main(String args[]) throws IOException
{
char ch;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
ch = (char)br.read();
if (Character.isLetter(ch))
System.out.println("Charcter "+ch +" is letter");
else if(Character.isDigit(ch))
System.out.println("Character "+ch+" is Digit");
else
System.out.println("Character "+ch+" is other character");


}}