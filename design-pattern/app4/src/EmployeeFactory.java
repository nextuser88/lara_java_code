public class  EmployeeFactory
{
	public static getEmployee(String empType) 
	{
		Employee emp = null;
		if(empType == null)
		{
			return emp;
		}
		if("HR".equals(empType))
		{
			emp = new HrEmployee();
		}
		else if("SALES".equals(empType))
		{
			emp = new SalesEmployee();
		}
		else if("MARKETING".equals(empType))
		{
			emp = new MarketingEmployee();
		}
		else if("SOFTWARE".equals(empType))
		{
			emp = new SoftwareEmployee();
		}
		return emp;
	}
}
