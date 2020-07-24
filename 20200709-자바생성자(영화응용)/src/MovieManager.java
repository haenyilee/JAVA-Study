import java.io.*; // 파일 읽어올떄....input output
import java.util.Scanner;


public class MovieManager {
	
	// 사용자 정의 데이텨형 = MovieVO ==> 영화정보를 모두 모아둔 데이터형?
	static MovieVO[] movies=new MovieVO[1938];
	// 모든 클래스에서 공유할 경우 static!
	// 목록출력, 상세, 검색 모든 윈도우에서 같은 영화 데이터를 공유해야 하기 때문에 static을 사용했음
	
	// 프로그램이 구동이 되면 자동으로 => 파일을 읽어서 배열에 저장해야 함
	// 클래스 내에서 구현하려면 ==> 클래스(static) 초기화블록 사용해야 함

	static {
		try {
			StringBuffer data=new StringBuffer();			
			// File 읽는 경우에는 반드시 예외 처리를 해야 함
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			
			int i=0;
			while((i=fr.read())!=-1) // -1 EOF(End Of File)
			{
				data.append(String.valueOf((char)i)); // 캐릭터를 스트링으로 형변환
				
			}
			fr.close();			
			
			String[] movieData=data.toString().split("\n");
			
			int k=0;
			
			
			for(String s:movieData)
			{
				String[] ss=s.split("\\|");
				/*
					ss={};
				 */
				
				movies[k]=new MovieVO(); // 메모리에 저장
				movies[k].mno=Integer.parseInt(ss[0]);
				// 문자열"1"을 ==> 정수로 변환
				movies[k].title=ss[1];
				movies[k].genre=ss[2];
				movies[k].poster=ss[3];
				movies[k].actor=ss[4];
				movies[k].regdate=ss[5];
				movies[k].grade=ss[6];
				movies[k].director=ss[7];
				
				k++;
				
				
			}
			
		} catch (Exception ex) {}
		
	}
	
// 10개씩 페이지 나누기
	static MovieVO[] movieListData(int page)
	{
		MovieVO[] m=new MovieVO[10];
		int i=0; // 10개씩 나눠주는 변수
		int j=0; // for 횟수
		int rowSize=10; // 각 페이지당 몇 개
		int pagecnt=(page*rowSize)-rowSize; // 시작 위치
		/*
		 	1page => 0 ~ 9
		 	2page => 10 ~ 19
		 	
		 */

		for(MovieVO vo:movies)
		{
			if(i<10 && j>=pagecnt)
			{
				m[i]=vo;
				i++;
			}
			j++;
		}
		return m;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("페이지 입력: ");
		int page=scan.nextInt();
		MovieVO[] movie=movieListData(page);
		for(MovieVO vo:movie)
		{
			System.out.println("영화번호: "+vo.mno);
			System.out.println("영화명: "+vo.title);
			System.out.println("===========================================");
			
		}
	}
	
	/*
	public static void main(String[] args) {
		for(MovieVO vo:movies)
		{
			System.out.println("영화번호: "+vo.mno);
			System.out.println("영화명: "+vo.title);
			System.out.println("장르: "+vo.genre);
			// System.out.println("포스터: "+vo.poster);
			System.out.println("출연: "+vo.actor);
			System.out.println("감독: "+vo.regdate);
			System.out.println("등급: "+vo.grade);
			System.out.println("개봉일: "+vo.director);
			System.out.println("===========================================");
		}
	}
	*/


}
