import java.io.*;
class P1
{
public static void main(String args[]) throws IOException
{
int a [] = new int[5];
int b[] = new int[5];
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Enter array a elements");
for (int i=0;i<5;i++)
{
a[i] = Integer.parseInt(br.readLine());
}
System.out.print("Array a : ");
for (int k:a)
{
System.out.print(k+" ");
}
System.out.println(" ");
System.out.println("Enter array b elements");
for (int j=0;j<5;j++)
{
b[j] = Integer.parseInt(br.readLine());
}
System.out.print("Array b: ");
for (int l:b)
{
System.out.print(l+" ");
}
System.out.println(" ");
System.arraycopy(a,2,b,1,3);

for (int k:a)
{
System.out.print(k+" ");
}
System.out.println(" ");
for (int l:b)
{
System.out.print(l+" ");
}

}
}