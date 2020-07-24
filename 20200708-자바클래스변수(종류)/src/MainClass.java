/* 영화 > 영화관련 데이터를 모아야함
1. 영화명 	2.출연 	3. 출연 	예매율 	순위 ==> 영화 5개


*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열은 index를 사용하는 프로그램
		String[] title= {"#살아있다(2020)"
				,"결백(2019)"
				,"온워드: 단 하루의 기적(2020)"
				,"소리꾼(2020)"
				,"다크 나이트(2008)"
		};
		String[] director= {"조일형"
				,"박상현"
				,"댄 스캔론"
				,"조정래"
				,"크리스토퍼 놀란"
		};
		String[] actor= {"유아인, 박신혜"
				,"신혜선, 배종옥, 허준호"
				,"크리스 프랫, 톰 홀랜드, 옥타비아 스펜서, 줄리아 루이스 드레퓌스"
				,"이봉근, 이유리, 김하연, 박철민, 김동완, 김민준"
				,"크리스찬 베일, 히스 레저, 아론 에크하트"
		};

		double[] reserve= {17.3
				,12.6
				,7.8
				,1.3
				,1.0
		};
		int[] rank= {1,2,3,4,5};

		for (int i = 0; i < rank.length; i++) {
			System.out.println("영화명:"+title[i]);
			System.out.println("출연:"+actor[i]);
			System.out.println("감독:"+director[i]);
			System.out.println("예매율:"+reserve[i]);
			System.out.println("순위:"+rank[i]);
			System.out.println("============================================");
		}
		
		
	}

}
