
public class TestForEach
{
	public static void main(String[] args) 
	{
		String[] books = {"�������" , 
			"��������","�����ߺ�","���۾ź�","����ʮ��"
			};
		System.out.println("�ҹ������˷ɴ��У�");
		//ʹ��foreachѭ������������Ԫ�أ�����book�����Զ�����ÿ������Ԫ��
		for (String book : books)
		{
			System.out.println(book);
		}
	}
}
