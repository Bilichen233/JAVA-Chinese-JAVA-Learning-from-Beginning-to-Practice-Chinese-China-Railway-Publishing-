public class shuzuerchu {
	public static void main(String args[]){
        //��һ�֣�ֱ��ֵ��
        int[][] arr1 = {{1,2}, {2, 3}, {4, 5}};
        System.out.println("��1�ַ�����");
        for(int i=0; i<3; ++i)	//ѭ��������ά�������
          for(int j=0; j<2; ++j)//ѭ��������ά�������
            System.out.println(arr1[i][j]);
         
        //�ڶ��֣�new�ؼ��ָ�ֵ��
        int[][] arr2 = new int[4][3];
        System.out.println("��2�ַ�����");
        for(int i=0; i < arr2.length; ++i)		//ѭ��������ά�������
          for(int j=0; j<arr2[i].length; ++j)	//ѭ��������ά�������
             arr2[i][j] = i*j;					//�к��еĳ˻���ֵ				
        for(int i=0; i<arr2.length; ++i)		//����ѭ��������ά�������
          for(int j=0; j<arr2[i].length; ++j)	//����ѭ��������ά�������
             System.out.println(arr2[i][j]);
	}
}
