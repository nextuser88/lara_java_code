import java.util.Scanner;
class N 
{
	static class Util
	{
		public static void sleep(long millis)
		{
			try
			{
				Thread.sleep(millis);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	static class A extends Thread
	{
		public void run()
		{
			int counter = 0;
			while(!isInterrupted())
			{
				counter++;
				System.out.println(counter);
				try
				{
					sleep(1000);
				}
				catch (InterruptedException ex)
				{
					break;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		Scanner sc = new Scanner(System.in);
		do
		{
			Util.sleep(20000);
			System.out.println("Do you want to continue..?(y/n)");
		}

		while ("y".equals(sc.next()));
		a1.interrupt();
	}
}
