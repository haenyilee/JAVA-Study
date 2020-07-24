package com.sist.data;
/*
  <ul class="list-toplist-slider" style="width: 531px;">
            <li>
              <img class="center-croping" alt="티라미수 맛집 베스트 50곳 사진"
                   data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/rjo80nepigkxn637.png?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>

              <a href="/top_lists/633_tiramisu"
                 onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;믿고 보는 맛집 리스트&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;LMUMANJ&quot;});">
                <figure class="ls-item">
                  <figcaption class="info">
                    <div class="info_inner_wrap">
                      <span class="title">티라미수 맛집 베스트 50곳</span>
                      <p class="desc">"최애 디저트는 당근 티라미수 아니겠어?"</p>
 
 */

import java.io.FileWriter;

/*
 * <p>aaa</p> ==> p.text()
 * <p>src=""> ==> p.attr()
 */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class MainClass3 {
	
	public static FoodHouseVO[] categoryFoodData() {
		FoodHouseVO[] food =new FoodHouseVO[10];
		try
		{
			Document doc=Jsoup.connect("https://www.mangoplate.com/top_lists/1965_hotel_bingsu").get();
			Elements title=doc.select("span.title h3");
			Elements score=doc.select("strong.point span");
			Elements address=doc.select("p.etc");
			Elements poster=doc.select("img.center-croping");
			Elements review=doc.select("p.short_review");
			
			for(int i=0;i<10;i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(score.get(i).text());
				System.out.println(address.get(i).text());
				System.out.println(poster.get(i).attr("data-original"));
				System.out.println(review.get(i).text());
				System.out.println("=======================");
				
				food[i]=new FoodHouseVO();
				food[i].setTitle(title.get(i).text());
				food[i].setScore(Double.parseDouble(score.get(i).text()));
				/*
				 * <Wrapper Class>
				 * 문자열을 => 더블형으로 변환할 때 쓰는 것 : Double.parseDouble()
				 * 문자열을 => 정수형으로 : Integer.parseInt()
				 * 문자열을 => 논리형으로 : Boolean.parseBoolean()
				 */
				food[i].setAddress(address.get(i).text());
				food[i].setPoster(poster.get(i).attr("data-original"));
				food[i].setReview(review.get(i).text());
			}
			/*
			 * 	<p>aaaaa</p>
			 * 	<p data="aaaaa"/>
			 * 	
			 */
		}catch (Exception e) {
			e.printStackTrace();
		}
		return food;
		
	}
	
	public static CategoryVO[] categoryListData()
	{
		CategoryVO[] cate=new CategoryVO[10];
		
		try
		{
			Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
		
			Elements title=doc.select("div.info_inner_wrap span.title");
			Elements subject=doc.select("div.info_inner_wrap p.desc");
			Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
			
			for(int i=0;i<10;i++)
			{
				System.out.println("==================");
				System.out.println(title.get(i).text());
				System.out.println(subject.get(i).text());
				System.out.println(poster.get(i).attr("data-lazy"));
					cate[i]=new CategoryVO();
					cate[i].setCno(i+1); // setCno는 cno의 setter값!!
					cate[i].setTitle(title.get(i).text());
					cate[i].setSubject(subject.get(i).text());
					cate[i].setPoster(poster.get(i).attr("data-lazy"));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return cate;
	}

	public static void main(String[] args) {
		
		categoryFoodData();
		
		// URL  ==> https://www.mangoplate.com/ ==> CheckException
		/*
		try {
			Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
			Elements title=doc.select("div.info_inner_wrap span.title");
			Elements subject=doc.select("div.info_inner_wrap p.desc");
			Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
			
			for(int i=0;i<10;i++)
			{
				System.out.println("============================");
				System.out.println(title.get(i).text());
				System.out.println(subject.get(i).text());
				System.out.println(poster.get(i).attr("data-lazy"));
				
				
				try 
				{String temp=(i+1)+"|"+title.get(i).text()+"|"++subject.get(i).text()+"|" +poster.get(i).attr("data-lazy")+"\r\n";
				
				FileWriter fw=new FileWriter("c:\\\\javaDev\\\\category.txt",true);
				
				fw.write(temp); fw.close();
				}catch (Exception e) 
				{
					e.printStackTrace();
				}
				
				
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			*/
			
		}

		
		
	}
