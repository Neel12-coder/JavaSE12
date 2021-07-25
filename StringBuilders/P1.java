class P1
{
public static void main(String args[])
{
StringBuilder s = new StringBuilder("java is cool");
StringBuilder r = new StringBuilder("great");
System.out.println("Length = "+s.length());
System.out.println("Capacity = "+s.capacity());
System.out.println("Insert = "+s.insert(8,"super-"));
System.out.println("Insert = "+s.insert(8,"super-"));
System.out.println("Append = "+s.append(" True"));
System.out.println("Character = "+s.charAt(2));
System.out.println("Substring = "+s.substring(8,15));
System.out.println("Reverse= "+ r.reverse());
System.out.println("Replace = "+s.replace(2,3,"koo"));
//System.out.println("Index = "+s.indexOf('o'));
System.out.println("Index = "+s.lastIndexOf("java"));
//System.out.println("UpperCase = "+s.toUpperCase());
System.out.println("Equality = "+ (s==r));
System.out.println("Equality = "+s.equals(r));
//System.out.println("Comparison = "+s.compareTo(r));
System.out.println("Join = "+ String.join(" and ",s,r));
}
}

