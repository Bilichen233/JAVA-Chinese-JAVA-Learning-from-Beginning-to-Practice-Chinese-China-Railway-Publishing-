
import java.util.*;
public class yongIterator
{
	public static void main(String[] args) 
	{
		//����һ������
		Collection books = new HashSet();
		books.add("android����");
		books.add("�ᵱ�����");
		books.add("һ����ɽС");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while(it.hasNext())
		{
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("android����"))
			{
				it.remove();
			}
			//��book������ֵ������ı伯��Ԫ�ر���
			book = "�����ַ���";
		}
		System.out.println(books);
	}
}
