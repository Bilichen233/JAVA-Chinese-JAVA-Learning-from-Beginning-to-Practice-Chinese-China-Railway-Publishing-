import java.util.*;
public class youErr{
	public static void main(String[] args) {
		//����һ��ֻ�뱣���ַ�����List����
		List strList = new ArrayList();
		strList.add("VERO MODA");
		strList.add("ONLY");
		strList.add(" JACK & JONES");
		System.out.println("BESTSELLER���µ�Ʒ���У�");
		//����С�ġ���һ��Integer���󡱶���"�˼���
		strList.add(5);
		for (int i = 0; i < strList.size() ; i++ ){
			//��ΪList��ȡ����ȫ����Object�����Ա���ǿ������ת��
			//���һ��Ԫ�ؽ�����ClassCastException�쳣
			String str = (String)strList.get(i);
		}
	}
}
