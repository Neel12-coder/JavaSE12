import java.util.*;
class P3
{
public static void main(String[] args)
{
String s = "baba baba black sheep , have you any wool";

Scanner sc = new Scanner(s);

while(sc.hasNext())
    System.out.print(sc.next()+" ");

sc.close();
}
}