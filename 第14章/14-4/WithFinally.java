public class WithFinally {  
  public void methodA(int status)throws Exception{  	//���巽��methodA
    if(status==-1) throw new Exception("�������"); 		//���status==-1���׳��쳣 
    System.out.println("�����׽�ú��ͳɹ���");  				//�����Ϣ
  }  
 
  public static void main(String args[]) throws Exception{  
    try{  
      new WithFinally().methodA(-1); 	//�׳�Exception�쳣  
      System.out.println("����ͤͤ�������ںܲ���");		//�����Ϣ
    }catch(Exception e){  
      System.out.println("���Ĺȸ�а������");  			//�����Ϣ
    }finally{  
      System.out.println("�ɹ��������������֤�������Ե�~");	//�����Ϣ  
    }  
  }  
} 
