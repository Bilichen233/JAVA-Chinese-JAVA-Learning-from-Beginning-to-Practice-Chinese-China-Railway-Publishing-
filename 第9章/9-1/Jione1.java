
class jitwo{		//������jitwo
	String name;	//String��������name
	int age;		//int��������age
	long number;	//long��������number;
	jitwo(long number,String name,int age)	//���췽��
	{ 
		System.out.println("������ "+name);		//�������
		System.out.println("���䣺" +age);		//�������
		System.out.println("�ֻ��� " +number);	//����ֻ���
	}
}

class super2b extends jitwo{	//��������super2b��������jitwo
	super2b(long number,String name,int age,boolean b)	//���췽��
	{
		super(number,name,age);				//���ø���ͬ��������
		System.out.println("ϲ���羺��"+b);	//����Ƿ�ϲ���羺
	}
}

public class Jione1{
	public static void main(String args[]){
		//�½�super2bʵ������abc1�����ֱ�ֵ����
		super2b abc1=new super2b(1506907006,"������",31,true);
	}
}
