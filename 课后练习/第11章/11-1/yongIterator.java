
import java.util.*;
public class yongIterator
{
	public static void main(String[] args) 
	{
		//创建一个集合
		Collection books = new HashSet();
		books.add("android江湖");
		books.add("会当凌绝顶");
		books.add("一览众山小");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		while(it.hasNext())
		{
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("android江湖"))
			{
				it.remove();
			}
			//对book变量赋值，不会改变集合元素本身
			book = "测试字符串";
		}
		System.out.println(books);
	}
}
