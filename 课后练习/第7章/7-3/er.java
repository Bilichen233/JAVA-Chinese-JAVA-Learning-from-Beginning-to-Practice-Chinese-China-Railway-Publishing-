public class er
{
	public static void main(String[] args)
	{
		//�����ά����
		int[][]  arr = {{5,7,9},{12,14,16,18},{23,25,36,47},{22,54,65,15},{22,34}}; 
		int sum=add(arr);//������ͺ���
		System.out.println("sum="+sum);//�����
	}
	public static int add(int[][] arr)//����Ӻ���
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)//����Ƕ��forѭ����������ά����
			{
				sum+=arr[i][j];//ÿ������һ��Ԫ�������һ��
			}
		}
		return sum;//���ض�ά�����и�Ԫ�صĺ�
	}
}
