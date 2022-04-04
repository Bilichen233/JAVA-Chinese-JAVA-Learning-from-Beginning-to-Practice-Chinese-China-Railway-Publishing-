public class er
{
	public static void main(String[] args)
	{
		//定义二维数组
		int[][]  arr = {{5,7,9},{12,14,16,18},{23,25,36,47},{22,54,65,15},{22,34}}; 
		int sum=add(arr);//调用求和函数
		System.out.println("sum="+sum);//输出和
	}
	public static int add(int[][] arr)//求和子函数
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)//利用嵌套for循环来遍历二维数组
			{
				sum+=arr[i][j];//每遍历出一个元素则叠加一次
			}
		}
		return sum;//返回二维数组中个元素的和
	}
}
