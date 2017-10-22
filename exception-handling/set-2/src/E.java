import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;

public class  E
{
	void test1()
	{
		System.out.println(1);
		int i =10/0;
		System.out.println(2);

	}
	void test2()
	{
		System.out.println(1);

		try
		{
			
		}
		catch (ArithmeticException ex)
		{

		}
		
		System.out.println(2);

	}
	/*void test3()
	{
		System.out.println(1);
		int i = integer.parseInt("abc");
		System.out.println(2);

	}*/

	void test4()
	{
		System.out.println(1);

		try
		{
			
		}
		catch (NumberFormatException ex)
		{
			System.out.println(ex);

		}		
		System.out.println(2);

	}

	void test5()
	{
		System.out.println(1);
		String s1 = null;
		s1.length();
		System.out.println(2);

	}

	void test6()
	{
		System.out.println(1);

		try
		{
			
		}
		catch (NullPointerException ex)
		{
			

		}		
		System.out.println(2);

	}

	void test7()
	{
		Object obj = new Object();
		E e1 = (E)obj;

	}
	void test8()
	{
		test8();
	}
	void test9()
	{
		try
		{
			
		}
		catch (StackOverflowError ex)
		{

		}
	}
	void test10()
	{
		int x[] = new int[999999999];
	}
	void test11()
	{
		try
		{
			
		}
		catch (NoClassDefFoundError ex)
		{
			System.out.println(ex);
		}
	}
	/*void test12()
	{
		Class.forName("");
	}*/

	void test13()
	{
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
	/*void test14()
	{
		try
		{
			Class.forName("");
		}
		catch (NullPointerException ex)
		{
			ex.printStackTrace();
		}
	}
	void test15()
	{
		try
		{
			
		}
		catch (ClassNotFoundException ex)
		{

		}
	}
	void test16()
	{
		try
		{
			System.out.println("done");
		}
		catch (ClassNotFoundException ex)
		{

		}
	}*/
	void test17()
	{
		try
		{
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{

		}
	}

	void test18()
	{
		DriverManager.getConnection("");
	}

	void test19()
	{
		try
		{
			
		}
		catch (SQLException ex)
		{

		}
	}

	void test20()
	{
		try
		{
			class.forName("");
		}
		catch (SQLException ex)
		{

		}
	}

	void test21()
	{
		try
		{
			class.forName("");
			DriverManager.getConnection("");
		}
		catch (SQLException ex)
		{

		}
		catch (ClassNotFoundException ex)
		{

		}

	}

	void test22()
	{
		new FileWriter("");
	}

	void test23()
	{
		try
		{
			new FileWriter("");
		}
		catch (IOException ex)
		{

		}
		
	}
	void test24()
	{
		try
		{
			
		}
		catch (IOException ex)
		{

		}
		
	}

	void test25()
	{
		clone();
	}

	void test26()
	{
		try
		{
			clone();
		}
		catch (CloneNotSupportedException ex)
		{

		}
		
	}

	void test27()
	{
		try
		{
			
		}
		catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		
	}

	void test28()
	{
		Thread.sleep(1000);
	}

	void test29()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
			
		}
		
	}

	void test30()
	{
		try
		{

		}
		catch (InterruptedException ex)
		{
			
		}
		
	}

	void test31()
	{
		DateFormat df = DateFormat.getDateInstance();
		df.parse("");
	}

	void test32()
	{
		DateFormat df = DateFormat.getDateInstance();
		try
		{
			df.parse("");
		}
		catch (ParseException ex)
		{
			
		}
		
	}

	void test33()
	{
		
		try
		{
			
		}
		catch (ParseException ex)
		{
			
		}
		
	}
	
}
