
public class Yitwo2 {
	public static void main(String args[])	{
		try{
			int age=Integer.parseInt("25L");//�׳��쳣
			System.out.println("���1");		//�����Ϣ
		}
		catch(NumberFormatException e){
			int b=8/0;						//��ĸΪ0
			System.out.println("��������������");			//�����Ϣ
			System.out.println("����"+e.getMessage());	//�����Ϣ
		}
		finally {
			System.out.println("���2");		//�����Ϣ
		}
		System.out.println("���3");			//�����Ϣ
	}
}
