import java.util.*;
//����Apple��ʱʹ���˷�������
public class fru<T>{
	//ʹ��T�����βζ�������
	private T info;
	public fru(){}
	//���淽����ʹ��T�����β������巽��
	public fru(T info){
		this.info = info;
	}
	public void setInfo(T info){
		this.info = info;
	}
	public T getInfo(){
		 return this.info;
	}
	public static void main(String[] args)
	{
		//��Ϊ����T�βε���Stringʵ�����ͣ����Թ������Ĳ���ֻ����String
		fru<String> a1 = new fru<String>("��װ DRY-EXԲ��T��(����) 407204 ���¿�UNIQLO");
		System.out.println(a1.getInfo());
		//��Ϊ����T�βε���Doubleʵ�����ͣ����Թ������Ĳ���ֻ����Double����double
		fru<Double> a2 = new fru<Double>(99.9);
		System.out.println(a2.getInfo()+"Ԫ");
	}
}
