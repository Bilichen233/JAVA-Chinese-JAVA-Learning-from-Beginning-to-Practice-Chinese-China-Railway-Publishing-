interface Jiechang{		//����ӿ�Jiechang	
	int a=100;					//a�ĳ�ʼֵ��100 
	int b=200;					//b�ĳ�ʼֵ��200 
	int c=323;					//c�ĳ�ʼֵ��323 
	int d=234;					//d�ĳ�ʼֵ��234 
	int f=523;					//f�ĳ�ʼֵ��523
	void print();				//��������print()
	void print1();				//��������print1()
}

class Jiedo implements Jiechang{
	public void print(){		//���巽��print()�����a��b�ĺ�
		System.out.println("�϶��õĲƲ��ǣ�");
		System.out.println(a+b);
	}
	
	public void print1(){		//���巽��print1()�����c��d��f�ĺ�
		System.out.println("�ϴ��õĲƲ��ǣ�");
		System.out.println(c+d+f);
	}
}

public class Jie{
	public static void main(String args[]){
		Jiedo a1=new Jiedo();	//����Jiedo����ʵ��a1
		a1.print();				//���÷���print()
		a1.print1();			//���÷���print1()
	}
}