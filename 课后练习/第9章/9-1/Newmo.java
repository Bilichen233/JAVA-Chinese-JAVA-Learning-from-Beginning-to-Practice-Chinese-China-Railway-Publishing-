class moone1
{
	moone1()
	{
		System.out.println("����");
	}
}

class moone2 extends moone1
{
	 moone2()
	{
		System.out.println("Nei1�̳и���Nei");
	}
}

class Newmo extends moone2
{
	Newmo()
	{
		System.out.println("Nei2�̳и���Nei1");
	}
	
	public static void main(String args[])
	{
		new moone2();
	}
}
