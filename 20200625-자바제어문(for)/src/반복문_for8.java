/*
	for => Ƚ���� ������ �ݺ���
	=> UPDOWN����
	=> ��ǻ�Ͱ� 1~100������ ���� �߻�
	=> ����ڰ� ���� ���ߴ� ����
		��Ʈ : ����, ����
	=> ��) ���� : 70, ����� : 60, ��� : UP!
 */

import java.util.*;
/*
	1. ��ǻ�Ͱ� �����߻�
		Math.random() => 0.0 ~ 0.99 => 0.0 ~ 99.0 ==> (+1) 1.0 ~ 100.0
	====================
	2. ����� �Է�
	3. �Է��ϸ�  => ��Ʈ�ֱ�
	4. ���Ῡ��  => 
 */
public class �ݺ���_for8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		// ���� => ���� ���� ����
		Scanner scan=new Scanner(System.in);
		int count=0; // ����Է��ߴ��� ���߱� ���� ����
		for(;;) { // ���ѷ���
			System.out.println("1~100������ ������ �Է� : ");
			int user=scan.nextInt();
			if (user<1 || user>100) {
				System.out.println("�߸��� �Է��Դϴ�!!");
				continue; // �����Ű�� ���� �ƴ϶� ó������ �ٽ� ���ư� �� ���� ��(for�� ���������� �̵�)		
				
			}
			// ���������� �Էµ� ����
			count++;
			
			//��
			if (com>user) {
				System.out.println("UP!!");
			}
			else if(user>com) {
				System.out.println("DOWN!!");
				}
			else {
				System.out.println("GAME OVER!!");
				
				// �� ������ ����ߴ��� ���߱�
				System.out.println("�Է�Ƚ��:"+count);
				
				// ���� �����ϱ�
				break;
			}

}
}
}