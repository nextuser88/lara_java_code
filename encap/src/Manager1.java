import java.util.Date;
import java.text.SimpleDateFormat;
class Person
{
	//private String date;
	private Date date;
	public void setDate(String date)
	{
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy");
		try
		{
			this.date = df.parse(date);
		}
		catch (ParseException ex)
		{
			ex.printStackTrace();
		}
		
	}
	public String getDate()
	{
		return date.toString();
	}
}

class  Manager1
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setDate("12-08-16");
		String date = p1.getDate();
		System.out.println(date);
	}
}
