/*
 	����ó�� => ��������
 	=> ���� > ����ó�� => try ~ catch
 	=> ���� > ȸ��(�ý��ۿ� �ñ��) => throws 
 */

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class �ڹٸ޼ҵ�2 {
	static String[] genieMusicData() throws Exception
	{
		String[] data=new String[50];
		
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title=doc.select("td.info a.title");
		for(int i=0;i<50;i++)
		{
			data[i]=title.get(i).text();
		}
		
		return data;
	}
	static String[] genieMusicFind(String ss) throws Exception
	{
		String[] data=genieMusicData();
		int k=0;
		for(String title:data)
		{
			if(title.contains(ss))
			{
				k++;
			}
		}
			
		String[] find=new String[k];
		k=0;
		for(String title:data)
		{
			
			if(title.contains(ss))
			{
				find[k]=title;
				k++;
			}
		}
		return find;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] data=genieMusicData();
		for(String title:data)
		{
			System.out.println(title);
		}
		
		System.out.println("========================");

		Scanner scan=new Scanner(System.in);
		System.out.println("����� �Է��ϼ���:");
		String ss=scan.nextLine();
		
		String[] fd=genieMusicFind(ss);
		for(String title:data) 
		{
			System.out.println(title);
		}

	}

}
