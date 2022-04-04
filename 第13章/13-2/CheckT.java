
import java.util.*;

//自定义一个StrList集合类，使用组合的方式来复用ArrayList类
class StrList
{
	private List strList = new ArrayList();
	//定义StrList的add方法
	public boolean add(String string)
	{
		return strList.add(string);
	}
	//重写get方法，将get方法的返回值类型改为String类型
	public String get(int index)
	{
		return (String)strList.get(index);
	}
	public int size()
	{
		return strList.size();
	}
}
public class CheckT
{
	public static void main(String[] args) 
	{
		//创建一个只想保存字符串的List集合
		StrList strList = new StrList();
		strList.add("AAA");
		strList.add("BBB");
		strList.add("CCC");
		//下面语句不能把Integer对象“丢进”集合中,将引起编译异常
		//strList.add(5);
		System.out.println(strList);
		for (int i = 0; i < strList.size() ; i++ )
		{
			//因为StrList里元素的类型就是String类型，所以无需强制类型转换
			String str = strList.get(i);
		}
	}
}