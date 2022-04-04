
public class dothree {
	public static void main(String args[]){
		int i = 1;		//int类型的变量i，初始值为1
		int sum = 0;	//int类型的变量sunm，初始值为0
		do{				//开始do while循环
		  sum += i++;	//计算数字的和
		} 
		while(i<=100);	//小于等于100就执行循环
		System.out.println(sum);
	}	
}
