class F
{
	int i;
	static int j;
	void test1()
	{
		i = 1;
		j = 2;
		test1();
		test2();
		G g1 = new G();
		H h1 = new H();
	}
	static void test2()
	{
		j = 2;
		H h1 = new H();
	}
	class G
	{
		int m;
		void test3()
		{
			i =10;
			j = 20;
			test1();
			test2();
			G g1 = new G();
			H h1 = new H();
			m = 20;
		}
		/*static void test4()
		{
			i = 10;
			j = 20;
			test1();
			test2();
			G g1 = new G();
			H h1 = new H();
			m = 20;
			n = 20;
		}*/
	}

	static class H
	{
		int p;
		static int q;
		void test5()
		{
			j = 2;
			//test1();
			test2();
			p = 0;
			q = 9;
			H h1 = new H();
		}
		static void test6()
		{
			j = 20;
			test2();
			q = 10;
			H h1 = new H();
		}
	}
}