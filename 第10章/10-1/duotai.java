
class jiBaseClass				//�������jiBaseClass
{
	public int book = 6;		//��������book�ĳ�ʼֵ��6
	public void base(){			//���巽��base()����ı�
		System.out.println("�������ͨ����");
	}
	public void test(){			//���巽��test()����ı�
		System.out.println("����ı����ǵķ���");
	}
}
//��������duotai
public class duotai extends jiBaseClass{
	//���¶���һ��bookʵ�����Ը��Ǹ����bookʵ������
	public String book = "�����깫Ԣ��";	//Ϊ����book���¸�ֵΪ�����깫Ԣ��
	public void test(){			//����������д����test()
		System.out.println("����ĸ��Ǹ���ķ���");
	}
	public void sub()			//����������д����sub()
	{
		System.out.println("�������ͨ����");
	}
	public static void main(String[] args){
		//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		jiBaseClass bc = new jiBaseClass();
		//��� 6
		System.out.println(bc.book);
		//�������ε��ý�ִ��jiBaseClass�ķ���
		bc.base();
		bc.test();

		//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		duotai sc = new duotai();
		//���"�����깫Ԣ��""
		System.out.println(sc.book);
		//������ý�ִ�дӸ���̳е���base����
		sc.base();
		//������ý�ִ�дӵ�ǰ���test����
		sc.test();
		//������ý�ִ�дӵ�ǰ���sub����
		sc.sub();

		//�������ʱ���ͺ�����ʱ���Ͳ�һ������̬����
		jiBaseClass ploymophicBc = new duotai();
		//��� 6 ���� �������ʵ��Ǹ�������
		System.out.println(ploymophicBc.book);
		//������ý�ִ�дӸ���̳е���base����
		ploymophicBc.base();
		//������ý�ִ�дӵ�ǰ���test����
		ploymophicBc.test();
		//jiBaseClass��û���ṩsub������������ΪsanYin�ı���������jiBaseClass
		//��������������ʱ����ִ���
		//sanYin.sub();
	}
}