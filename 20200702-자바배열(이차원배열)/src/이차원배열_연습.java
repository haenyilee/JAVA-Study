// 문제 : 3 x 3 크기 이중 배열에 0부터 8까지 랜덤하게 중복없이 넣어보기

import java.util.*;

public class 이차원배열_연습 {

	public static void main(String[] args) {
		Random r = new Random(); // 랜덤 값을 가져오기 위해 선언

		int[][] practice2 = new int[3][3]; // 3x3 사이즈 배열 메모리 할당

		for (int i = 0; i < practice2.length; i++) {
			for (int j = 0; j < practice2.length; j++) {
				practice2[i][j] = -1; // 0~8을 출력하기 위해 모든 값 -1로 초기화(기본 초기화가 0이기 때문)
			}
		}
		
		
		int num; // 랜덤 값 변수
		boolean condition = false; // 중복이 있을 시 반복문을 처음부터 돌리기 위함

		for (int i = 0; i < practice2.length; i++) {
			for (int j = 0; j < practice2.length; j++) {

				num = r.nextInt(9); // 0~8 사이 랜덤 값 가져오기

				if (!(i == 0 && j == 0)) { // 제일 처음 항목일 경우 비교할 필요가 없기 때문에
					for (int k = 0; k < practice2.length; k++) {
						int l = 0;
						
						while (l < practice2.length) {
							if (num == practice2[k][l]) { // 중복일 경우
								num = r.nextInt(9); // 새로운 랜덤 값
								condition = true; // 중복임을 표시
							} else {
								condition = false; // 중복이 아님을 표시
							}
							l++;
							
							if (condition == true) { // 중복일 경우 초기화 처음부터 다시 비교
								k = 0;
								l = 0;
							}
						}
					}
				}

				practice2[i][j] = num; // 중복되지 않은 최종 값을 배열에 저장

				System.out.println("index (" + i + "," + j + ") " + practice2[i][j]);
			}
		
		}
	}
}