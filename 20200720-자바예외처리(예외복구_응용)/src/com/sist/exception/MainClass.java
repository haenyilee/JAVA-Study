package com.sist.exception;
/*
 	예외처리
 		형식)
 			1. 직접처리
 				try
 				{
 					실행이 가능한 코딩(정상 수행 문장)
 				}catch(예외클래스 객체)
 				{
 					실행 과정에 에러가 날 경우에 처리 문장
 				}
 				*** catch는 여러번 사용이 가능
 				*** finally를 사용할 수 있다.(필요한 경우에만)
 					서버, 데이터 베이스 관련 : 서버닫기, 오라클 연결 해제
 			2. 자바에서 제공하는 예외처리
 				한개만 처리
 					NmberFormatException
 					ArrayIndexOutBoundsException
 					NullPointException
 					IOException
 					SQLException
 				여러개 처리
 					RuntimeException
 					Exception
 					Throwable
 			3. catch는 여러개를 사용할 수 있다.
 				해당 에러를 찾는 경우에는 처음부터 마지막까지 검색 => 예외처리 순서대로 코딩
 				
 			4. try절에서 발새하면 발생 위치에서 catch로 이동
 			   ======================== 밑에 있는 소스는 시행되지 않는다
 			   
 			5. 목적 : 에러체크(에러확인) => 소스변경 => 디버깅
 			
 			6. 예외처리 => 수정이 가능한 에러
 			
 			7. 자바의 모든 코딩은 예외처리가 존재한다. 
 				단, 실행시는 생략이 가능하다.
 			
 			8. 예외처리는 반드시 처리해야 하는 클래스가 존재ㅏㄴ다.
 				
 */
import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String num1=JOptionPane.showInputDialog("첫 번째 정수입력:");
			String num2=JOptionPane.showInputDialog("두 번째 정수입력:");
			// 배열에 첨부
			int[]arr=new int[2];
			// 문자열을 정수로 변환
			arr[0]=Integer.parseInt(num1); // 숫자입력 ==> "10" 문자로 변환 ==> " 1 0" "1  0" "ㅁㅁㅁ" (오류)
			arr[1]=Integer.parseInt(num2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
		}
		/*catch (NumberFormatException e) {
			System.out.println("정수만 입력");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위 초과");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
		}*/
		catch (RuntimeException e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("처음부터 다시!");

	}

}
