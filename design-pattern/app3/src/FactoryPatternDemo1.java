public class  FactoryPatternDemo1
{
	public static void main(String[] args) 
	{
		Employee e1 = EmployeeFactory.getEmployee("HR");
		e1.work();
		Employee e2 = EmployeeFactory.getEmployee("SALES");
		e2.work();
		Employee e3 = EmployeeFactory.getEmployee("MARKETING");
		e3.work();
		Employee e4 = EmployeeFactory.getEmployee("SOFTWARE");
		e4.work();
	}
}
