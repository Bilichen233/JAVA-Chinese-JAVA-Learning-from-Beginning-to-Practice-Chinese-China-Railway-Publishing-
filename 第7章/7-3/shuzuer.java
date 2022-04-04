public class shuzuer 
{
	public static void main(String[] args) {		
		int [][] Aa={						//定义并初始化一个二维数组
				{11,12,23,24},
				{15,26,27,18},
				{19,10,17,18},
				{13,14,15,16},
				{17,18,19,20},
		};
		System.out.println("输出数据：");
		for(int i=0;i<Aa.length;i++)		//此for循环语句表示以行进行循环
			for(int j=0;j<Aa[i].length;j++){//此for循环语句以每行的列数进行循环
				System.out.println("Aa["+i+"]["+j+"] ="+Aa[i][j]);
			}
	}
}
