class Employee
{
int id;
String name;
float salary;
}
class Employeedata{
//sample comment
	public static void main(String x[])
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		Employee e4 = new Employee();

		Employee e3 = new Employee();

		e1.id = 407;
		e1.name = "Venkata Naveen";
		e1.salary = 100000;
		e2.id = 402;
		e2.name = "Divya Sri";
		e2.salary = 75000;
		e3.id = 403;
		e3.name = "Kavya";
		e3.salary = 75000;
	System.out.println(e1.id+ " " +e1.name+ " " + e1.salary);
	System.out.println(e2.id+ " " +e2.name+ " " + e2.salary);
	}
}
