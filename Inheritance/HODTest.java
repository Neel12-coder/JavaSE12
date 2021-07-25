//Multilevel Inheritance
class Person
{
private String name;
private String address;
private int id;

public int getId()
{
return id;
}

public void setId(int id)
{
this.id = id;
}

public String getName()
{
return name;
}

public void setName(String name)
{
this.name = name;
}

public void setAddress(String address)
{
this.address = address;
}

public String getAddress()
{
return address;
}
}

class Teacher extends Person
{
private String designation;

public void setDes(String de)
{
designation = de;
}

public String getDes()
{
return designation;
}
}

class HOD extends Teacher
{

private int salary;

public void setSalary(int salary)
{
this.salary = salary;
}

public int getSalary()
{
return salary;
}
}

class HODTest
{
public static void main(String args[])
{
HOD t = new HOD();

t.setId(117);
t.setName("NUPUR GIRI");
t.setAddress("Mumbai");
t.setDes("Head of CMPN Dept.");
t.setSalary(150000);

System.out.println("Id = "+ t.getId()+" Name= "+ t.getName()+ "  Address= " + t.getAddress()+" Designation= "+t.getDes()+" Salary = "+ t.getSalary());

}
}