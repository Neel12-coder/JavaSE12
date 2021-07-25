class P6
{
public static void main(String args[])
{
String day = args[0];
switch (day)
{
case "MONDAY","FRIDAY" -> System.out.println("A");
case "TUESDAY" -> System.out.println("B");
default -> System.out.println("NAVD");
}
}
}