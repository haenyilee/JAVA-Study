/*	
	���ڿ��� ������ �� �ִ� ���� : String
	String : �Ϲݺ����� ����
			  Ŭ������ ���� => ���(�޼ҵ�)
			 
			 �ֿ� ���
			 	= ���ڿ� �� : .equals()
			 	= ���� ���� : contains()
			 	= ���ڿ��߿� �� �� ���� : charAt()
			 	= ����� ������ ���� : length()
			 	= ���� �ڸ��� : substring()
			 	= ã�� ������ ��ġ Ȯ�� : indexOf(), lastIndexOf()
			 	= ��� ���������� ���ڿ��� ��ȯ => valueOf()
			 	= ���鹮�� ���� : trim() => �¿츸 ����
			 		" Hello Java " => "Hello Java"
			 	= ���ڿ��� char[]�� ��ȯ ���� => toCharArray()
			 	= startsWith, endsWith => �˻���
			 	
			 	==============================================
			 	Wrapper Class
			 	=============
			 	�⺻�� ������(����,�Ǽ�,����,��)
			 	int => Integer => "2" => 2 => parseInt("2") => 2
			 	"10" + "100" ==> 110
			 	===================== 10100
			 	double => Double Boolean, Float, Byte....
 */

// substring : �ʿ��� ���ڸ� ���� => ���¼� �м�(�����,�λ�,���)
/*
	
	1. �߰����� ������ ����
	"Hello Java" => String => char[]
	       ==== substring(6)
	
	2. 2~5��°���� ����
	"Hello Java"     
	  ==== substring(1,5)
	  
	substring(int start)
	substring(int start,int end)
						======= �̰� �������� �����(��� ����)
 */
public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="100-010";
				//  0123456 <= �ڸ���
		System.out.println(msg.substring(0,3));
		System.out.println(msg.substring(4,7));
		System.out.println(msg.substring(4));		

	}

}
