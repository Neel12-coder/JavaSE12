// String objects are immutable
class P1
{
public static void main(String args[])
{
String s = "java is cool";
String r = "great";
System.out.println("Length = "+s.length());
System.out.println("Concat = "+s.concat(r));
System.out.println("Character = "+s.charAt(2));
System.out.println("Substring = "+s.substring(4));
System.out.println("Replace = "+s.replace('c','k'));
System.out.println("Index = "+s.indexOf('o'));
System.out.println("Index = "+s.lastIndexOf('o'));
System.out.println("UpperCase = "+s.toUpperCase());
System.out.println("Equality = "+ (s==r));
System.out.println("Equality = "+s.equals(r));
System.out.println("Comparison = "+s.compareTo(r));
System.out.println("Join = "+ String.join(" and ",s,r));
}
}

