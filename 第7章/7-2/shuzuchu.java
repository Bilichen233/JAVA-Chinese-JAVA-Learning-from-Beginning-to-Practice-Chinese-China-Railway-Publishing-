import java.util.Random;//插入Random包
public class shuzuchu{
	public static void main(String[] args) 
{
				Random rand=new Random(); //实例化Random类对象
int[]x=new int[rand.nextInt(12)];//随机产生0-20之间的数作为int数组的长度
double[]y=new double[rand.nextInt(12)]; 
//随机产生0-20之间的数作为int数组的长度
		System.out.println("x的长度为"+x.length);
		System.out.println("y的长度为"+y.length);
		for(int i=0;i<x.length;i++){
			x[i]=rand.nextInt(12); //随机产生0-20之间数的赋给数组a
			System.out.println("x["+i+"]="+x[i]); //打印数组a
		}
		for(int i=0;i<y.length;i++){
			y[i]=rand.nextDouble();//随机产double数的赋给数组b
			System.out.println("y["+i+"]="+y[i]);//打印数组b
		}	
	}
}
