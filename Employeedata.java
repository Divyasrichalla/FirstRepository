class Employee
{
int id;
String name;
float salary;
}
class Employeedata{
	public static void main(String x[])
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.id = 401;
		e1.name = "Naveen";
		e1.salary = 100000;
		e2.id = 402;
		e2.name = "Divya";
		e2.salary = 75000;
	System.out.println(e1.id+ " " +e1.name+ " " + e1.salary);
	System.out.println(e2.id+ " " +e2.name+ " " + e2.salary);
	}
}
