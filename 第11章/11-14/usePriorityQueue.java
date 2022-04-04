import java.util.*;
public class usePriorityQueue
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		//下面代码依次向pq中加入四个元素
		pq.offer(8);
		pq.offer(-1);
		pq.offer(10);
		pq.offer(0);
		//输出pq队列，并不是按元素的加入顺序排列，而是按元素的大小顺序排列
		System.out.println(pq);
		//访问队列第一个元素，其实就是队列中最小的元素：-3
		System.out.println(pq.peek());
	}
}
