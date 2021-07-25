class P2
{
public static void main(String args[])
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);

float sum = a + b;

float avg = sum / 2.0f;

System.out.printf("Avg = %-4.2f" , avg);
}}