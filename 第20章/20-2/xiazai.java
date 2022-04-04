import java.io.*;
import java.net.*;

//�������ش�start��end�����ݵ��߳�
class DownThread extends Thread{
	//�����ֽ����飨ȡˮ����Ͳ���ĳ���
	private final int BUFF_LEN = 32;
	//�������ص���ʼ��
	private long kaishi;
	//�������صĽ�����
	private long jieshu;
	//������Դ��Ӧ��������
	private InputStream is;
	//�����ص����ֽ������mm��
	private RandomAccessFile mm ;

	//���������������������������������ʼ�㡢������
	public DownThread(long start , long end , InputStream is , RandomAccessFile raf){
		//������̸߳������ص��ֽ�λ��
		System.out.println(start + "---->"  + end);
		this.kaishi = start;
		this.jieshu = end;
		this.is = is;
		this.mm = raf;
	}
	public void run(){
		try{
			is.skip(kaishi);
			mm.seek(kaishi); 
			//�����ȡ���������ݵĵĻ������飨��Ͳ��
			byte[] buff = new byte[BUFF_LEN];
			//���̸߳���������Դ�Ĵ�С
			long contentLen = jieshu - kaishi;
			//���������Ҫ��ȡ���ξͿ�����ɱ��̵߳�����
			long times = contentLen / BUFF_LEN + 4;
			//ʵ�ʶ�ȡ���ֽ���
			int hasRead = 0;
			for (int i = 0; i < times ; i++){
				hasRead = is.read(buff);
				//�����ȡ���ֽ���С��0�����˳�ѭ����
				if (hasRead < 0){
					break;
				}
				mm.write(buff , 0 , hasRead);
			}			
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		//ʹ��finally�����رյ�ǰ�̵߳��������������
		finally{
			try{
				if (is != null){
					is.close();
				}
				if (mm != null){
					mm.close();
				}
			}
			catch (Exception ex){
				ex.printStackTrace();
			}
		}
	}
}
public class xiazai{
	public static void main(String[] args){
		final int DOWN_THREAD_NUM = 4;
		final String OUT_FILE_NAME = "down.jpg";
		InputStream[] isArr = new InputStream[DOWN_THREAD_NUM];
		RandomAccessFile[] outArr = new RandomAccessFile[DOWN_THREAD_NUM];
		try{
			//����һ��URL����
			URL url = new URL("https://ss1.bdstatic.com/"
				+ "70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=845306564,3617231263&fm=27&gp=0.jpg");
			//�Դ�URL����򿪵�һ��������
			isArr[0] = url.openStream();
			long fileLen = getFileLength(url);
			System.out.println("ͼƬ�Ĵ�С��" + fileLen);
			//������ļ���������һ��RandomAccessFile�����
			outArr[0] = new RandomAccessFile(OUT_FILE_NAME , "rw");
			//����һ����������Դ��ͬ��С�Ŀ��ļ�
			for (int i = 0 ; i < fileLen ; i++ ){
				outArr[0].write(0);
			}
			//ÿ�߳�Ӧ�����ص��ֽ���
			long numPerThred = fileLen / DOWN_THREAD_NUM;
			//����������Դ������ʣ�µ�����
			long left = fileLen % DOWN_THREAD_NUM;
			for (int i = 0 ; i < DOWN_THREAD_NUM; i++){
				//Ϊÿ���̴߳�һ����������һ��RandomAccessFile����
				//��ÿ���̷ֱ߳���������Դ�Ĳ�ͬ���֡�
				if (i != 0){
					//��URL�򿪶��������
					isArr[i] = url.openStream();
					//��ָ������ļ��������RandomAccessFile����
					outArr[i] = new RandomAccessFile(OUT_FILE_NAME , "rw");
				}
				//�ֱ���������߳�������������Դ
				if (i == DOWN_THREAD_NUM - 1 ){
					//���һ���߳�����ָ��numPerThred+left���ֽ�
					new DownThread(i * numPerThred , (i + 1) * numPerThred + left
						, isArr[i] , outArr[i]).start();
				}
				else{
					//ÿ���̸߳�������һ����numPerThred���ֽ�
					new DownThread(i * numPerThred , (i + 1) * numPerThred
						, isArr[i] , outArr[i]).start();
				}
			}
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
	//�����ȡָ��������Դ�ĳ��ȵķ���
	public static long getFileLength(URL url) throws Exception{
		long length = 0;
		//�򿪸�URL��Ӧ��URLConnection��
		URLConnection con = url.openConnection();
		//��ȡ����URL��Դ�ĳ���
		long size = con.getContentLength();
		length = size;
		return length;
	}
}
