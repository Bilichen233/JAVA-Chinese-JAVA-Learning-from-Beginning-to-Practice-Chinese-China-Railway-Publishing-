
public class qiangzhuan
{
	public static void main(String[] args) {
		double d = 13.4;
		long l = (long)d;

		int in = 5;
		//����������ʱ������ͼ��һ����ֵ�ͱ���ת��Ϊboolean�ͣ�
		//����ʱ�����ʾ: ����ת��������
		//boolean b = (boolean)in;
		Object obj = "Сţţ�����յ�����";
		//obj�����ı�������ΪObject����String���͵ĸ��࣬����ǿ������ת��
		//����obj����ʵ��������Ҳ��String���ͣ���������ʱҲ��ͨ��
		String objStr = (String)obj;
		System.out.println("�ϵ�ͷת�˽�����.....");
		System.out.println("ϵͳ��æ�����Ե�.....");
		System.out.println("ת�˽��"+l+"��");
		System.out.println(objStr);
		System.out.println("����ϵͳ���ϣ�");
		//����һ��objPri��������������ΪObject��ʵ������ΪInteger
		Object objPri = new Integer(5);
		//objPri�����ı�������ΪObject����String���͵ĸ��࣬����ǿ������ת��
		//��objPri����ʵ����������Integer���ͣ����������������ʱ����ClassCastException�쳣
		String str = (String)objPri;

	}
}
