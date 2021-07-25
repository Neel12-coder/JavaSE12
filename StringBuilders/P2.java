//Chaing method
class P2
{
public static void main(String args[])
{
StringBuilder sb = new StringBuilder("abc");
sb.append("def").reverse().insert(3,"--").replace(0,3,"pqr");
System.out.println(sb);
System.out.print("Length = "+sb.length()+" Capacity = "+sb.capacity());
}
}