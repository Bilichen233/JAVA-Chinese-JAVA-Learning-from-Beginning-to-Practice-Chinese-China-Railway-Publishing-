public class leidui1 {
	int X=12;		//����int���͵�����XֵΪ12
	int Y=23; 		//����int���͵�����YֵΪ23
	public void printFoo(){	//���巽��printFoo()
	  System.out.println("X="+X+",Y="+Y);
	}
	public static void main(String args[]){
		System.out.println("���������ǣ�");
		leidui1 Z=new leidui1();//�½���leidui1�Ķ���ʵ��Z
		Z.X=41;		//��X��ֵΪ41
		Z.Y=75; 	//��Y��ֵΪ75
		Z.printFoo();//���÷���printFoo()
		leidui1 B=new leidui1();
		B.X=23; 	//��X��ֵΪ23
		B.Y=38; 	//��Y��ֵΪ38
		B.printFoo();//���÷���printFoo()
	}
}
