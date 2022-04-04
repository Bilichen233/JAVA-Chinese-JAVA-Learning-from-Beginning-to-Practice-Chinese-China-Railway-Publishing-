
public class shuzuone1 {
	public static void main(String[] args) {		
		int[] X={12,13,24,77,68,39,60};//定义数组X,有初始值
		int[] Y;	//定义数组Y,没有初始值
		Y=X;		//将数组X的值赋给数组Y
		for(int i=0;i<X.length;i++)		//循环输出数组X和Y中的元素
		{
			Y[i]++;
			System.out.println(X[i]);
			System.out.println(Y[i]);
		}
	}

}
