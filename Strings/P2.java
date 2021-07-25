class P2
{
public static void main(String args[])
{
String s ="123";
String r ;
if (s.length() > 2)
{
r = s.concat("456");
System.out.println(r);
}

for (int x=0;x<3;x++)
s+="x";

System.out.println(s);
}
}