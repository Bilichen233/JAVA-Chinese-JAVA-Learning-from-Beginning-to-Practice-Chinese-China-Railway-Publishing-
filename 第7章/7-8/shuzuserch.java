
import java.util.Arrays;
import java.util.Comparator;
public class shuzuserch
{
		public static void main(String[] args) 
		{
			int[] Aa={6,2,5,4,6,2,3};	//��ʼ��һά����Aa
			Arrays.sort(Aa);			//��������Ԫ��
			System.out.print("��������Aa�е�Ԫ�أ�");
			System.out.print("����������Ϊ��");
			for(int i=0;i<Aa.length;i++){	//��������Ԫ��
				System.out.print(+Aa[i]+" ");//��������Ľ��	
			}
			System.out.println();
			System.out.print("����Aa�е���Ԫ��4��");
			int location=Arrays.binarySearch(Aa, 4);//��������Ԫ��4
            System.out.println("�У�4��λ����"+location+",Aa["+location+"]="+Aa[location]);	
		}
}
