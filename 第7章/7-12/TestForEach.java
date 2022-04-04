
public class TestForEach
{
	public static void main(String[] args) 
	{
		String[] books = {"神舟五号" , 
			"神舟六号","神舟七号","神舟九号","神舟十号"
			};
		System.out.println("我国的载人飞船有：");
		//使用foreach循环来遍历数组元素，其中book将会自动迭代每个数组元素
		for (String book : books)
		{
			System.out.println(book);
		}
	}
}
