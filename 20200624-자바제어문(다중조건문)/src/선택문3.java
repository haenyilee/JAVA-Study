/*
������ �־����� �� ==> if
Ű���� ������, �ϳ����� �����ϱ� ==> ���ù�
 */

// 3���� ������ �Է¹޾Ƽ� ��������ϴ� ���α׷�

import java.util.*;

public class ���ù�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math=0;
		char score='A';
		// ====> ���α׷��� �ʿ��� �޸� ���� ���� Ȯ��
		
		// �Է�
		Scanner scan=new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ��� : ");
		kor = scan.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		eng = scan.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		math= scan.nextInt();

		// ����� ��� => ���� (������+���)
		// �޼ҵ� ==> �����͸� �����ؼ� ������� �Ѱ��ش�
 		switch ((kor+eng+math)/30) // 30���� ���� ������ case ���� ���� ������ֱ� ���ؼ�...300�� �����̴ϱ� case 300�� ���� �� ������... 
 		{
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;		
		default:
//		case 5:
//		case 4:
//		case 3:
//		case 2:
//		case 1:
			score='F';
			break;			
		}		
 		System.out.println("====���====");
 		System.out.println("����:"+score);
		
		
		
		
		
		
	}

}
