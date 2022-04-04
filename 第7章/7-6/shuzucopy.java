
public class shuzucopy {
	public static void main(String[] args) 
	{
		int X;		//定义int变量X
		//定义并初始化int类型数组Y
		int Y[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		//定义并初始化int类型数组Z
		int Z[] = new int[11];
		System.arraycopy(Y, 0, Z, 0, Y.length);	//复制数组Y中的所有元素
		for (X = 0; X < Y.length; X++)
			System.out.print(Z[X] + "\n");
		System.out.println();
	}
}
