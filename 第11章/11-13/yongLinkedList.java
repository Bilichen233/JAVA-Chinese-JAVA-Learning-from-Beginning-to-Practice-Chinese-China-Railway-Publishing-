
import java.util.*;
public class yongLinkedList{
	public static void main(String[] args) {
		LinkedList<String> books = new LinkedList<String>();
		//将字符串元素加入队列的尾部
		books.offer("Note 7");
		//将一个字符串元素入栈
		books.push("Note 8");
		//将字符串元素添加到队列的头部
		books.offerFirst("Note 9");
		for (int i = 0; i < books.size() ; i++ ){
			System.out.println("最近3年三星盖乐世产品有："+books.get(i));
		}
		//访问、并不删除队列的第一个元素
		System.out.println("三星GALAXY系列的最新产品是："+books.peekFirst());
		//访问、并不删除队列的最后一个元素
		System.out.println("三星GALAXY系列发生爆炸的产品是："+books.peekLast());
		//采用出栈的方式将第一个元素pop出队列
		System.out.println("三星GALAXY系列的最新产品是："+books.pop());
		//下面输出将看到队列中第一个元素被删除
		System.out.println("三星GALAXY系列不是新品是："+books);
		//访问、并删除队列的最后一个元素
		System.out.println("三星GALAXY系列发生爆炸的产品是："+books.pollLast());
		//下面输出将看到队列中只剩下中间一个元素
		System.out.println("当前三星GALAXY系列最具性价比的产品是："+books);
	}
}
