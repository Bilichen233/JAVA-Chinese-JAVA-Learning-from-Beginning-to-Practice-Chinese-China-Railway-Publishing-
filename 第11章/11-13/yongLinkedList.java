
import java.util.*;
public class yongLinkedList{
	public static void main(String[] args) {
		LinkedList<String> books = new LinkedList<String>();
		//���ַ���Ԫ�ؼ�����е�β��
		books.offer("Note 7");
		//��һ���ַ���Ԫ����ջ
		books.push("Note 8");
		//���ַ���Ԫ����ӵ����е�ͷ��
		books.offerFirst("Note 9");
		for (int i = 0; i < books.size() ; i++ ){
			System.out.println("���3�����Ǹ�������Ʒ�У�"+books.get(i));
		}
		//���ʡ�����ɾ�����еĵ�һ��Ԫ��
		System.out.println("����GALAXYϵ�е����²�Ʒ�ǣ�"+books.peekFirst());
		//���ʡ�����ɾ�����е����һ��Ԫ��
		System.out.println("����GALAXYϵ�з�����ը�Ĳ�Ʒ�ǣ�"+books.peekLast());
		//���ó�ջ�ķ�ʽ����һ��Ԫ��pop������
		System.out.println("����GALAXYϵ�е����²�Ʒ�ǣ�"+books.pop());
		//������������������е�һ��Ԫ�ر�ɾ��
		System.out.println("����GALAXYϵ�в�����Ʒ�ǣ�"+books);
		//���ʡ���ɾ�����е����һ��Ԫ��
		System.out.println("����GALAXYϵ�з�����ը�Ĳ�Ʒ�ǣ�"+books.pollLast());
		//�������������������ֻʣ���м�һ��Ԫ��
		System.out.println("��ǰ����GALAXYϵ������Լ۱ȵĲ�Ʒ�ǣ�"+books);
	}
}
