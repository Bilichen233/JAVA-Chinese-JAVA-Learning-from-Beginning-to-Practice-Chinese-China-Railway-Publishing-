
public class leione {
	String gname;		//�����ַ�������gname
	int gid;			//����int����gid
	float gprice;		//����float����gprice;
	public void print(){//���巽��print()
		System.out.println(gname+",��Ʒ���к�"+gid+",��۳ɱ���"+gprice+"����Ԫ");
	}
	public static void main(String args[]){
		leione book1=new leione();	//�½�leione����ʵ��book1
		book1.gname="��10B";			//������ʵ��book1��gname���Ը�ֵ
		book1.gid=10005601;			//������ʵ��book1��gid���Ը�ֵ
		book1.gprice=4000;			//������ʵ��book1��gprice���Ը�ֵ
		book1.print();				//���÷���print()
	  leione book2=new leione();	//�½�leione����ʵ��book2
		book2.gname="��15";			//������ʵ��book2��gname���Ը�ֵ
		book2.gid=1222002;			//������ʵ��book2��gid���Ը�ֵ
		book2.gprice=6500;			//������ʵ��book2��gprice���Ը�ֵ
		book2.print();				//���÷���print()
	}
}
