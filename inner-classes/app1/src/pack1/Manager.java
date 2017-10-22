package pack1;
class Job
{
	String title;
	double salary;
	Job(String title, double salary)
	{
		this.title = title;
		this.salary = salary;
	}
}
class Employee
{
	private int index;
	Job x[];
	Employee(Job x[])
	{
		this.x = x;
	}
	Job nextJob()
	{
		return x[index++];
	}
	boolean hasNext()
	{
		return index < x.length;
	}
}
class Manager
{
	public static void main(String[] args)
	{
		Job j1 = new Job("software", 50000.9);
		Job j2 = new Job("hardware", 10000.9);
		Job j3 = new Job("hr", 50000.9);
		Job x[] = {j1, j2, j3};
		Employee emp = new Employee(x);
		print(emp);
		System.out.println("--------------");
		print(new Employee(x));
		System.out.println("--------------");
		print(new Employee(x));
		System.out.println("--------------");
		print(emp);

	}

	private static void print(Employee emp)
	{
		Job j1 = null;
		while(emp.hasNext())
		{
			j1 = emp.nextJob();
			System.out.println(j1.title + ":" + j1.salary);
		}
	}
}