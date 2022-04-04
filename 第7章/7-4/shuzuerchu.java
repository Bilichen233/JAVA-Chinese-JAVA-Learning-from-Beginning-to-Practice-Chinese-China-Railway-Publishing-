public class shuzuerchu {
	public static void main(String args[]){
        //第一种，直赋值法
        int[][] arr1 = {{1,2}, {2, 3}, {4, 5}};
        System.out.println("第1种方法：");
        for(int i=0; i<3; ++i)	//循环遍历二维数组的行
          for(int j=0; j<2; ++j)//循环遍历二维数组的列
            System.out.println(arr1[i][j]);
         
        //第二种，new关键字赋值法
        int[][] arr2 = new int[4][3];
        System.out.println("第2种方法：");
        for(int i=0; i < arr2.length; ++i)		//循环遍历二维数组的行
          for(int j=0; j<arr2[i].length; ++j)	//循环遍历二维数组的列
             arr2[i][j] = i*j;					//行和列的乘积赋值				
        for(int i=0; i<arr2.length; ++i)		//重新循环遍历二维数组的行
          for(int j=0; j<arr2[i].length; ++j)	//重新循环遍历二维数组的列
             System.out.println(arr2[i][j]);
	}
}
