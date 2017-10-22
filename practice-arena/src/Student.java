class Student 
{
	int id ;
	String fName;
	String lName;

   Student(int id, String fName, String lName)
	{
	
		this.id = id;
		this.fName= fName;
		this.lName = lName;
		
		System.out.print("test id:" + id+ " ");
		System.out.print("test fName:" + fName+ " ");
		System.out.println("test lName:" + lName);

	}

   void display()
	{
		System.out.print("display id:" + id+" ");
		System.out.print("display fName:" + fName+ " ");
		System.out.println("display fName:" + lName);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"great", "abc");
		Student s2 = new Student(2,"www", "raw");
		s1.display();
		s2.display();
		System.out.println("done!");
	}
}
