import java.util.*;
public class usePriorityQueue
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		//�������������pq�м����ĸ�Ԫ��
		pq.offer(8);
		pq.offer(-1);
		pq.offer(10);
		pq.offer(0);
		//���pq���У������ǰ�Ԫ�صļ���˳�����У����ǰ�Ԫ�صĴ�С˳������
		System.out.println(pq);
		//���ʶ��е�һ��Ԫ�أ���ʵ���Ƕ�������С��Ԫ�أ�-3
		System.out.println(pq.peek());
	}
}
