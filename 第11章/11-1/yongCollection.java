import java.util.*;
public class yongCollection{
	public static void main(String[] args) {
		Collection c = new ArrayList();
		//添加元素
		c.add("6S");
		//虽然集合里不能放基本类型的值，但Java支持自动装箱
		c.add(6);
		System.out.println("本次发布会的产品个数为:" + c.size());//输出集合c的元素个数
		//删除指定的元素
		c.remove(6);
		System.out.println("本次发布会的产品个数为:" + c.size());//输出集合c的元素个数
		//判断是否包含指定字符串，输出集合c的是否包含字符串“6S”
		System.out.println("本次发布的产品是否包6S？" + c.contains("6S"));
		c.add("6S Plus");					//添加新的字符串元素"6S Plus"
		System.out.println("本次发布的产品有：" + c);//输出集合c中的元素个数
		Collection books = new HashSet();
		books.add("6S Plus");				//添加新的字符串元素"6S Plus"
		books.add("7S");					//添加新的字符串元素"7S"
		//输出集合c是否完全包含books集合中的元素
		System.out.println("本次发布的产品是否包含books系列？" + c.containsAll(books));
		//用c集合减去books集合里的元素
		c.removeAll(books);
		System.out.println("本次发布的产品有：" + c);//输出集合c中的元素
		c.clear();							//删除c集合里所有元素
		System.out.println("本次发布的产品有：" + c);
		//books集合里只剩下c集合里也同时包含的元素
		books.retainAll(c);
		System.out.println("books系列产品有:" + books);//输出集合books中的元素
	}
}
