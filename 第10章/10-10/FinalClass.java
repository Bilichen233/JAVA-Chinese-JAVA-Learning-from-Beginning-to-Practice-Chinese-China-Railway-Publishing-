final class FinalClass {//������FinalClass��ʹ��final���� 
	int a = 139;		//�������a�ĳ�ʼֵ��139		
	void doit() {		//���巽��doit()
	}
	
    public static void main(String args[]) {
		FinalClass f = new FinalClass();
		f.a++;			//����a��ֵ������1
		System.out.println("�����������"+f.a+"����");
	}
}
