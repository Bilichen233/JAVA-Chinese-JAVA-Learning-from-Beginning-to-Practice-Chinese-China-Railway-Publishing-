public class Yitwo1 {
	public static void main(String args[]){
			int [] a=new int[5];	//新建整数数组有5个元素
			try{
				a[6]=123;			//赋值数组第6个元素为123，这是越界错误
				System.out.println("下面的程序有错吗？");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("发生ArrayIndexOutOfBoundsException异常");
			}
			catch(ArithmeticException e)
			{
				System.out.println("发生ArithmeticException异常");
			}
			catch(Exception e)
			{
				System.out.println("发生了Exception异常");
			}
			System.out.println("考核结束！");
		}
}
