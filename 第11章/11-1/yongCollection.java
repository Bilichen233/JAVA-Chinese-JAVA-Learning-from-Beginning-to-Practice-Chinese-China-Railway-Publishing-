import java.util.*;
public class yongCollection{
	public static void main(String[] args) {
		Collection c = new ArrayList();
		//���Ԫ��
		c.add("6S");
		//��Ȼ�����ﲻ�ܷŻ������͵�ֵ����Java֧���Զ�װ��
		c.add(6);
		System.out.println("���η�����Ĳ�Ʒ����Ϊ:" + c.size());//�������c��Ԫ�ظ���
		//ɾ��ָ����Ԫ��
		c.remove(6);
		System.out.println("���η�����Ĳ�Ʒ����Ϊ:" + c.size());//�������c��Ԫ�ظ���
		//�ж��Ƿ����ָ���ַ������������c���Ƿ�����ַ�����6S��
		System.out.println("���η����Ĳ�Ʒ�Ƿ��6S��" + c.contains("6S"));
		c.add("6S Plus");					//����µ��ַ���Ԫ��"6S Plus"
		System.out.println("���η����Ĳ�Ʒ�У�" + c);//�������c�е�Ԫ�ظ���
		Collection books = new HashSet();
		books.add("6S Plus");				//����µ��ַ���Ԫ��"6S Plus"
		books.add("7S");					//����µ��ַ���Ԫ��"7S"
		//�������c�Ƿ���ȫ����books�����е�Ԫ��
		System.out.println("���η����Ĳ�Ʒ�Ƿ����booksϵ�У�" + c.containsAll(books));
		//��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		System.out.println("���η����Ĳ�Ʒ�У�" + c);//�������c�е�Ԫ��
		c.clear();							//ɾ��c����������Ԫ��
		System.out.println("���η����Ĳ�Ʒ�У�" + c);
		//books������ֻʣ��c������Ҳͬʱ������Ԫ��
		books.retainAll(c);
		System.out.println("booksϵ�в�Ʒ��:" + books);//�������books�е�Ԫ��
	}
}
