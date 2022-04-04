

import java.io.*; 
import java.net.*;
import java.util.*;


public class qingqiu
{
	/**
	 * ��ָ��URL����GET����������
	 */
	public static String sendGet(String url , String param) 
	{
		String result = "";
		BufferedReader in = null;
		try
		{
			String urlName = url + "?" + param;
			URL realUrl = new URL(urlName);
			//�򿪺�URL֮�������
			URLConnection conn = realUrl.openConnection();
			//����ͨ�õ���������
			conn.setRequestProperty("accept", "*/*"); 
			conn.setRequestProperty("connection", "Keep-Alive"); 
			conn.setRequestProperty("user-agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)"); 
			//����ʵ�ʵ�����
			conn.connect(); 
			//��ȡ������Ӧͷ�ֶ�
			Map<String,List<String>> map = conn.getHeaderFields();
			//�������е���Ӧͷ�ֶ�
			for (String key : map.keySet())
			{
				System.out.println(key + "--->" + map.get(key));
			}
			//����BufferedReader����������ȡURL����Ӧ
			in = new BufferedReader(
				new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine())!= null)
			{
				result += "\n" + line;
			}
		}
		catch(Exception e)
		{
			System.out.println("����GET��������쳣��" + e);
			e.printStackTrace();
		}
		//ʹ��finally�����ر�������
		finally
		{
			try
			{
				if (in != null)
				{
					in.close();
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * ��ָ��URL����POST����������
	 */	
	public static String sendPost(String url,String param)
	{
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try
		{
			URL realUrl = new URL(url);
			//�򿪺�URL֮�������
			URLConnection conn = realUrl.openConnection();
			//����ͨ�õ���������
			conn.setRequestProperty("accept", "*/*"); 
			conn.setRequestProperty("connection", "Keep-Alive"); 
			conn.setRequestProperty("user-agent", 
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)"); 
			//����POST�������������������
			conn.setDoOutput(true);
			conn.setDoInput(true);
			//��ȡURLConnection�����Ӧ�������
			out = new PrintWriter(conn.getOutputStream());
			//�����������
			out.print(param);
			//flush������Ļ���
			out.flush();
			//����BufferedReader����������ȡURL����Ӧ
			in = new BufferedReader(
				new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = in.readLine())!= null)
			{
				result += "\n" + line;
			}
		}
		catch(Exception e)
		{
			System.out.println("����POST��������쳣��" + e);
			e.printStackTrace();
		}
		//ʹ��finally�����ر��������������
		finally
		{
			try
			{
				if (out != null)
				{
					out.close();
				}
				if (in != null)
				{
					in.close();
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
		return result;
	}

	//�ṩ�����������Է���GET�����POST����
	public static void main(String args[])
	{
		//����GET����
		String s = qingqiu.sendGet("http://localhost:8888/abc/login.jsp",null);
		System.out.println(s);
		//����POST����
		String s1 = qingqiu.sendPost("http://localhost:8888/abc/a.jsp",
			"user=mm&pass=nn");
		System.out.println(s1);
	}
}
