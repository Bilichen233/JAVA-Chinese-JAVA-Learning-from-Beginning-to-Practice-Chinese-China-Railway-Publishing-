import java.text.* ;
public class NumberFormatT1{
	public static void main(String args[]){
		NumberFormat nf = null ;		// ����һ��NumberFormat����
		nf = NumberFormat.getInstance() ;	// �õ�Ĭ�ϵ����ָ�ʽ����ʾ
		System.out.println("�����" + nf.format(180000000)+"ŷԪ") ;//�����ʽ��֮�������
		System.out.println("����ǣ�" + nf.format(180000123.345)+"ŷԪ") ;//�����ʽ��֮�������
	}
};