public class leijing1 {
	static int X;		//���徲̬int���ͱ���X
	static int Y; 		//���徲̬int���ͱ���Y
    //���巽��printJingTai()��ӡ���X��Y��ֵ
	public void printJingTai(){
		System.out.println("X="+X+",Y="+Y);
	}
	public static void main(String args[]){
		leijing1 Aa=new leijing1();//�½���leijing1�Ķ���ʵ��Aa
		System.out.println("���������ǣ�");
		Aa.X=4;		//��X��ֵΪ4	
		Aa.Y=5; 		//��Y��ֵΪ5
		leijing1.X=112;	//���¸�ֵ��leijing1�ı�����Xֵ
		leijing1.Y=252; //���¸�ֵ��leijing1�ı�����Yֵ
		Aa.printJingTai();	//���÷���printJingTai()
		leijing1 Bb=new leijing1();//�½���leijing1�Ķ���ʵ��Bb
		Bb.X=3; 		//��X��ֵΪ3
		Bb.Y=8; 		//��Y��ֵΪ8
		leijing1.X=131; //���¸�ֵ��leijing1�ı�����Xֵ
		leijing1.Y=272; //���¸�ֵ��leijing1�ı�����Yֵ
		Bb.printJingTai();	//���÷���printJingTai()
	}
}
