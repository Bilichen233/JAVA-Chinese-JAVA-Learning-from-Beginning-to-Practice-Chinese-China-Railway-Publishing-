public class yi {
	public static void main(String [] args){
		//����int���͵����飬ͬʱ�������е�Ԫ�ظ�ֵ
		int [] arrayA={12,3,4,23};
		//����������ռ䣬6���ռ䣬Ĭ��ֵΪ0
		int [] arrayB=new int[6];
		System.out.println("��ֵ֮ǰ");
		System.out.println("arrayA="+arrayA);
		System.out.println("arrayB="+arrayB);
		//��ֵ
		arrayB=arrayA; //���ҵ�����и�ֵ
		System.out.println("\n��ֵ֮��");
		System.out.println("arrayA="+arrayA);
		System.out.println("arrayB="+arrayB);
		for(int i=0;i<arrayB.length;i++){
			System.out.print(arrayB[i]+"\t");
		}
	}
}