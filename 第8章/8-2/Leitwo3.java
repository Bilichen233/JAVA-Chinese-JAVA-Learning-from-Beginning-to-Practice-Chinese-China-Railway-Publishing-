
public class Leitwo3 {		//������
	private String uname;	//����˽���ַ�������uname
	private int uid;		//����˽����������uid
	public String getuname() {	//���巽��getuname()��������
				return uname;
	}
	private int getuid(){	//���巽��getuid()���ر��
		return uid;
	}
	//�����Ƕ���һ�����췽��Leitwo3()
	public Leitwo3(String uname,int uid){
		this.uname=uname;
		this.uid=uid;
	}
	public static void main(String args[])
	{
		//��������eitwo3ʵ������PrivateUse1��PrivateUse2
		Leitwo3 PrivateUse1=new Leitwo3("����",21002);
		Leitwo3 PrivateUse2=new Leitwo3("�Ź�",61002);
		String a1=PrivateUse1.getuname();
		System.out.println("������"+a1);	//���PrivateUse1������
		int a2=PrivateUse1.getuid();
		System.out.println("ѧ�ţ�"+a2);	//���PrivateUse1�ı��
		
		String a3=PrivateUse2.getuname();
		System.out.println("������"+a3);	//���PrivateUse2������
		int a4=PrivateUse2.getuid();
		System.out.println("ѧ�ţ�"+a4);	//���PrivateUse2�ı��
	}
}
