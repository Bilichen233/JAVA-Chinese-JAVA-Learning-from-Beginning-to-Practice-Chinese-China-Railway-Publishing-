public class Yitwo1 {
	public static void main(String args[]){
			int [] a=new int[5];	//�½�����������5��Ԫ��
			try{
				a[6]=123;			//��ֵ�����6��Ԫ��Ϊ123������Խ�����
				System.out.println("����ĳ����д���");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("����ArrayIndexOutOfBoundsException�쳣");
			}
			catch(ArithmeticException e)
			{
				System.out.println("����ArithmeticException�쳣");
			}
			catch(Exception e)
			{
				System.out.println("������Exception�쳣");
			}
			System.out.println("���˽�����");
		}
}
