// ����ڰ� �Է�(����) ==> 2���� ���
// bit => 16bit ==> 32676
// 17�� ���� => 01(16)
// 0000 0000 0000 1010  10 => �迭

/*
	�뷡����,������,�ٹ���,������,����
	
	=> 50��=========50*(�뷡����,������,�ٹ���,������,����)=250���� ���� �ʿ���
 */


/*
	����
		���
			����
			�ݺ�
				= for (Ƚ���� ���� => �ڵ� ����)
				= while (������� => �ݵ�� �Է� �ʿ�)
				
 */
import java.util.*;
public class �ڹٹ迭_�뵵3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		// 0,1�� ����
		// ����ڰ� ��û�� ����
		int user=0;
		
		int index=15; // �ڿ������� ��� => �迭����
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է�(0~32767) : ");
		user=scan.nextInt();
		
		System.out.println("===== Lib�̿� =====");
		System.out.println(Integer.toBinaryString(user));
		
		
		while(true) {	// ��������� ������ �� Ȯ���ؼ� break�༭ ������������ => �ƴϸ� ����loop
			binary[index]=user%2;
			user=user/2;
			if (user==0) {
				break;
			}
			index--;
		}
		
		System.out.println();
		// ��� ���
		for(int i=0;i<16;i++) {
			if(i%4==0 && i!=0)
				System.out.print(" ");
				System.out.print(binary[i]);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
