


public class yin
{
	public static void swap(muzi dw)
	{
		//�������д���ʵ��dw��a��b����ֵ������
		//����һ����ʱ����������dw�����a���Ե�ֵ
		int tmp = dw.a;
		//��dw�����b����ֵ����a����
		dw.a = dw.b;
		//����ʱ����tmp��ֵ����dw�����a����
		dw.b = tmp;
		System.out.println("swap�����a���Ե�ֵ��" + dw.a + "��b��ֵ��" + dw.b);
		//��dwֱ�Ӹ�Ϊnull����������ָ���κ���Ч��ַ��
		dw = null;
	}
	public static void main(String[] args) 
	{
		muzi dw = new muzi();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("����������a���Ե�ֵ��" + dw.a + "��b���Ե�ֵ��" + dw.b);

	}
}