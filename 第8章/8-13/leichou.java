abstract class Cou{		//���������Cou
	int a1;				//����int��������a1
	int b1;				//����int��������b1
	Cou(int a,int b){	//���췽��Cou()
		a1=a;
		b1=b;
	}
	abstract int mathtext();//���󷽷�mathtext()
}
class Cou1 extends Cou{	//������Cou1��ʹ���˼̳У����ڱ�����潲��
	Cou1(int a,int b){	//���췽��Cou1()
		super(a,b);
	}
	
	int mathtext(){		//��ͨ����Cou()
		return a1+b1;	//����a��b�ĺ�
	}
}

class Cou2 extends Cou{//������Cou2��ʹ���˼̳У����ڱ�����潲��
	Cou2(int a,int b){	//���췽��Cou2()
		super(a,b);		//���ø����е�ͬ�η���
	}
	int mathtext(){		//���巽��mathtext()������a1��b1�Ĳ�
		return a1-b1;
	}
}
public class leichou  {
	public static void main(String args[]){
		Cou1 abs1=new Cou1(3000,2000);	//�½���Cou1�Ķ���ʵ��abs1����ֵ��������
		Cou2 abs2=new Cou2(4000,2000);	//�½���Cou1�Ķ���ʵ��abs2����ֵ��������
		Cou abs;
		abs=abs1;
		System.out.println("���ͺ�������������"+abs.mathtext()+"��");
		abs=abs2;
		System.out.println("����һ�ξ���� ������������"+abs.mathtext()+"��");

	}
}

