
public class Leitwo4 {
	protected int a;				//���屣����int���͵�����a
	protected void print(){			//�����ӡ�������print()
		System.out.println(a+"��");	//�������a��ֵ
	}	
    public static void main(String args[]){
    	System.out.println("��20��װ������ǣ�");
    	Leitwo4 a1=new Leitwo4();	//�½�Leitwo4����ʵ��a1
		a1.a=2017;					//a1�е�����a��ֵΪ2017
		a1.print();					//���÷���print()
		System.out.println("��20�γ�ս��������ǣ�");
		Leitwo4 a2=new Leitwo4();	//�½�Leitwo4����ʵ��a2
		a2.a=2018;					//a2�е�����a��ֵΪ2018
		a2.print();					//���÷���print()
	}
}
