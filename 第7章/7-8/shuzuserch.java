
import java.util.Arrays;
import java.util.Comparator;
public class shuzuserch
{
		public static void main(String[] args) 
		{
			int[] Aa={6,2,5,4,6,2,3};	//初始化一维数组Aa
			Arrays.sort(Aa);			//排序数组元素
			System.out.print("排列数组Aa中的元素！");
			System.out.print("排序后的数组为：");
			for(int i=0;i<Aa.length;i++){	//遍历数组元素
				System.out.print(+Aa[i]+" ");//输出排序后的结果	
			}
			System.out.println();
			System.out.print("数组Aa中的有元素4吗？");
			int location=Arrays.binarySearch(Aa, 4);//搜索数组元素4
            System.out.println("有！4的位置是"+location+",Aa["+location+"]="+Aa[location]);	
		}
}
