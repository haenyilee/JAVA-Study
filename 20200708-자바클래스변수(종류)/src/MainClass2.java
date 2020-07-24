// 사용자가 직접 데이터형을 만든다

class MovieInfo{
	// 멤버변수 = 인스턴스변수 => 메모리 공간을 생성해주려면 => new를 써야 사용 가능
	String title;
	String director;
	String actor;
	double reserve;
	int rank;
	static String site_name=""; // 공간이 하나이기 때문에 값을 변경하면 전체가 싹 다 바뀜~!
}
// MovieInfo m1=new MovieInfo()

public class MainClass2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieInfo m1=new MovieInfo();
		
		// m1 => 메모리에 저장되어 있는 변수의 초기값
		m1.title="#살아있다(2020)";
		m1.director="조일형";
		m1.actor="유아인, 박신혜";
		m1.reserve=17.3;
		m1.rank=1;
		m1.site_name="CGV"; // => 롯데시네마 => 메가박스
		
		MovieInfo m2=new MovieInfo();
		// m2 => 메모리에 저장되어 있는 변수의 초기값
		m2.title="결백(2019)";
		m2.director="박상현";
		m2.actor="신혜선, 배종옥, 허준호";
		m2.reserve=12.6;
		m2.rank=2;
		m2.site_name="롯데시네마";
		
		MovieInfo m3=new MovieInfo();
		// m2 => 메모리에 저장되어 있는 변수의 초기값
		m3.title="온워드: 단 하루의 기적(2020)";
		m3.director="댄 스캔론";
		m3.actor="크리스 프랫, 톰 홀랜드, 옥타비아 스펜서, 줄리아 루이스 드레퓌스";
		m3.reserve=7.8;
		m3.rank=3;
		m3.site_name="메가박스"; // static변수 접근방법(1)
		
		MovieInfo.site_name="서울극장"; // static변수 접근방법(2)
		
		System.out.println("영화관: "+m1.site_name);
		m3.title="소리꾼(2020)";
		System.out.println("영화제목: "+m1.title);
				


	}

}
