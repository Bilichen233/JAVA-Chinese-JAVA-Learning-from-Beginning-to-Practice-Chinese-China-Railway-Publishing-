import java.util.Random;//����Random��
public class shuzuchu{
	public static void main(String[] args) 
{
				Random rand=new Random(); //ʵ����Random�����
int[]x=new int[rand.nextInt(12)];//�������0-20֮�������Ϊint����ĳ���
double[]y=new double[rand.nextInt(12)]; 
//�������0-20֮�������Ϊint����ĳ���
		System.out.println("x�ĳ���Ϊ"+x.length);
		System.out.println("y�ĳ���Ϊ"+y.length);
		for(int i=0;i<x.length;i++){
			x[i]=rand.nextInt(12); //�������0-20֮�����ĸ�������a
			System.out.println("x["+i+"]="+x[i]); //��ӡ����a
		}
		for(int i=0;i<y.length;i++){
			y[i]=rand.nextDouble();//�����double���ĸ�������b
			System.out.println("y["+i+"]="+y[i]);//��ӡ����b
		}	
	}
}
