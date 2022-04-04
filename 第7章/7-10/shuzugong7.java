import java.util.Arrays;
public class shuzugong7 {
	public static void main(String[] args) 
	{
			int size=0;//定义int类型变量size的初始值是0
			if(args.length!=0)	//如果参数args长度不为0
				size=Integer.parseInt(args[0]);	//强制转换为整型
			int[]a1=new int[size];	//新建数组a1
			Arrays.fill(a1, 11);	//填充数据11
			for(int i=0;i<a1.length;i++){					//遍历操作
				System.out.print("a1["+i+"]="+a1[i]+" ");	//输出数组a中的元素
			}
			System.out.println();
		}

}
