
public class leitwo5 {
	int a;		//����int���͵�����a
	int b;		//����int���͵�����b
	void print(){	//���巽��print()
		int c=a+b;	//����int���͵�����c����ֵΪa+b
		System.out.println("a+b="+c);	//��ӡ���a+b��ֵ
	}
	public static void main(String args[]){
		leitwo5 a1=new leitwo5();	//������leitwo5�Ķ���ʵ��a1
		a1.a=2;						//��ֵa��ֵΪ2
		a1.b=3;						//��ֵa��ֵΪ3
		a1.print();					//���÷���print()��ӡ���a+b��ֵ
	}
}
