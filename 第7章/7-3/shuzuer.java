public class shuzuer 
{
	public static void main(String[] args) {		
		int [][] Aa={						//���岢��ʼ��һ����ά����
				{11,12,23,24},
				{15,26,27,18},
				{19,10,17,18},
				{13,14,15,16},
				{17,18,19,20},
		};
		System.out.println("������ݣ�");
		for(int i=0;i<Aa.length;i++)		//��forѭ������ʾ���н���ѭ��
			for(int j=0;j<Aa[i].length;j++){//��forѭ�������ÿ�е���������ѭ��
				System.out.println("Aa["+i+"]["+j+"] ="+Aa[i][j]);
			}
	}
}
