import sun.launcher.resources.launcher;

/*
	영화 => 정보 저장하는 변수
	

#살아있다(2020) 상영중   
 평점 06 . 7  
 한국
2020.06.24 개봉  
98분, 15세이상관람가 
감독 조일형  
주연 유아인, 박신혜  
예매 1위  
누적관객357,069명 



결백(2019) 상영중   
평점 08 . 8  
드라마
한국
2020.06.10 개봉 
110분, 15세이상관람가 
감독 박상현  
주연 신혜선, 배종옥, 허준호  
예매 2위  
누적관객617,898명 


 
 */
public class 변수설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제목
		String title="#살아있다(2020)";
		boolean isOpen=true;
		double score=6.7;
		String genre="";
		String na="한국";
		String regdate="2020.06.24";
		String director="조일형";
		String actor="유아인, 박신혜";
		int time=98;
		int grade=15;
		int rank=1;
		int showUser=357069; // 콤마 지워~!
		
		int a=0;
		System.out.println("============영화정보"+(int)(++a)+"============");
		System.out.println("영화명"+title);
		System.out.println(""+(isOpen==true?"상영중":"미개봉")); // 삼항연산자
		System.out.println("기타:"+na+" ,연령:"+grade+"이상관람가");
		System.out.println("시간:"+time+"분");
		System.out.println("개봉일:"+regdate+"개봉");
		System.out.println("감독:"+director);
		System.out.println("주연:"+actor);
		System.out.println("순위:"+rank+"위");	
		System.out.println("누적관객수:"+showUser+"명");
		
		
		title="결백(2019)";
		isOpen=true;
		score=8.8;
		genre="드라마";
		na="한국";
		regdate="2020.06.10";
		director="박상현";
		actor="신혜선, 배종옥, 허준호";
		time=110;
		grade=15;
		rank=2;
		showUser=617898;
		
		System.out.println("============영화정보"+(int)(++a)+"============");
		System.out.println("영화명"+title);
		System.out.println(""+(isOpen==true?"상영중":"미개봉")); // 삼항연산자
		System.out.println("기타:"+na+" ,연령:"+grade+"이상관람가");
		System.out.println("시간:"+time+"분");
		System.out.println("개봉일:"+regdate+"개봉");
		System.out.println("감독:"+director);
		System.out.println("주연:"+actor);
		System.out.println("순위:"+rank+"위");	
		System.out.println("누적관객수:"+showUser+"명");

	}

}
