public class yi {
	public static void main(String [] args){
		//声明int类型的数组，同时给数组中的元素赋值
		int [] arrayA={12,3,4,23};
		//声明并分配空间，6个空间，默认值为0
		int [] arrayB=new int[6];
		System.out.println("赋值之前");
		System.out.println("arrayA="+arrayA);
		System.out.println("arrayB="+arrayB);
		//赋值
		arrayB=arrayA; //从右到左进行赋值
		System.out.println("\n赋值之后");
		System.out.println("arrayA="+arrayA);
		System.out.println("arrayB="+arrayB);
		for(int i=0;i<arrayB.length;i++){
			System.out.print(arrayB[i]+"\t");
		}
	}
}