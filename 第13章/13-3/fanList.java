import java.util.*;
public class fanList{
	public static void main(String[] args) {
		//����һ��ֻ�뱣���ַ�����List����
		List<String> strList = new ArrayList<String>();
		strList.add("VERO MODA");
		strList.add("ONLY");
		strList.add("JACK JONES");
		//������뽫����������
		//strList.add(5);
		for (int i = 0; i < strList.size() ; i++ ){
			//�����������ǿ������ת��
			String str = strList.get(i);
		}
		System.out.println(strList+"������Ʒ����һ���ϰ�");
	}
}