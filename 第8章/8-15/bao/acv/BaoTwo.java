package bao.acv;

class leibao{
	int a;					//����int���ͱ���a
	int b; 					//����int���ͱ���b
	public void print(){			//���巽��print()
		System.out.println("a="+a+",b="+b);
	}
}
public class BaoTwo{
	public static void main(String args[]){
		leibao a1=new leibao();	//�½����leibao����ʵ��a1
		a1.a=121;				//��a��ֵΪ121
		a1.b=232; 				//��b��ֵΪ232
		a1.print();			//���÷���print()
	}
}
