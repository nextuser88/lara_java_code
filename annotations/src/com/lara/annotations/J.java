package com.lara.annotations;
@interface Test
{
	public String message();
	public boolean flag();
}
@Test(message = "some info", flag = true)
class  J
{
	@Test(message = "some info", flag = true)
	int m;
	@Test(message = "some info", flag = false)
	J()
	{
	}
	@Test(message = "some info", flag = true)
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
