
import java.util.*;
public class yongList{
	public static void main(String[] args) {
		List books = new ArrayList();
		//向books集合中添加三个元素
		books.add(new String("手机"));
		books.add(new String("电脑"));
		books.add(new String("芯片"));
		System.out.println("产品有："+books);
		//将新字符串对象插入在第二个位置
		books.add(1 , new String("5G研发"));
		for (int i = 0 ; i < books.size() ; i++ ){
			System.out.println(books.get(i));
		}
		//删除第三个元素
		books.remove(2);
		System.out.println(books);
		//判断指定元素在List集合中位置：输出1，表明位于第二位
		System.out.println(books.indexOf(new String("路由器")));
		//将第二个元素替换成新的字符串对象
		books.set(1, new String("电脑"));
		System.out.println(books);
		//将books集合的第二个元素（包括）到第三个元素（不包括）截取称子集合
		System.out.println(books.subList(1 , 2));

	}
}
