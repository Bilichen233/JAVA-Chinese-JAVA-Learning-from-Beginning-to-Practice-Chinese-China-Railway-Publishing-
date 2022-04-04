
public class shuzuduo1 {
	public static void main(String args[])
	{
		int[][][] a=new int[2][2][];
		a[0][0]=new int[2];
		a[0][0][0]=1;
		a[0][0][1]=2;
		
		a[0][1]=new int[2]; 
		a[0][1][0]=3;
		a[0][1][1]=4;
		
		a[1][0]=new int[2];
		a[1][0][0]=5;
		a[1][0][1]=6;
		
		a[1][1]=new int[2];
		a[1][1][0]=1;
		a[1][1][1]=1;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				for(int z=0;z<a[0][0].length;z++)
				{
					System.out.println("a["+i+"]["+j+"]["+z+"]="+a[i][j][z]);
				}
			}
		}
	}
}
