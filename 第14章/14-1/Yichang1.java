public class Yichang1{
	public static void main(String args[]){
		int x,y;		//����������������x��y
		try{
			x=0;		//x��ֵΪ0
			y=5/x;		//y��ֵΪ5/x����ʱ���ĸΪ0
			System.out.println("��Ҫ����ĳ���");
		}
		catch(ArithmeticException e){
			System.out.println("�������쳣����ĸ����Ϊ��");
		}
		System.out.println("�������н���");
	}
}
