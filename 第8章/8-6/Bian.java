public class Bian
{
	//�������βθ����ɱ�ķ���
	public static void test(int a , String... books)
	{
		//books���������鴦��
		for (String tmp : books)
		{
			System.out.println(tmp);
		}
		//�����������a��ֵ
		System.out.println(a);
	}
	public static void main(String[] args) {
		//����test������Ϊargs�������Դ��������ַ���
		test(2000 , "��15" , "��20");
		//����test������Ϊargs�������Դ��������ַ���
		test(1400 , new String[]{"��10B" , "��30"});

	}
}
