import java.util.*;
class P2
{
public static void main(String args[])
{
String book[] = {"C","Java","C++","Oracle","Php"};
Arrays.sort(book);
for (String s:book)
   System.out.print(s+" ");
System.out.println(" ");
int[] num = {10,2,30,4,5,6};
Arrays.sort(num);
for (int i: num)
   System.out.print(i+" ");
System.out.println(" ");
System.out.println(Arrays.binarySearch(book,"Java"));
System.out.println(Arrays.binarySearch(book,"Php"));
System.out.println(Arrays.binarySearch(num,8));
}
}



