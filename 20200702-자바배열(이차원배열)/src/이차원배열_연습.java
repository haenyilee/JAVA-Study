// ���� : 3 x 3 ũ�� ���� �迭�� 0���� 8���� �����ϰ� �ߺ����� �־��

import java.util.*;

public class �������迭_���� {

	public static void main(String[] args) {
		Random r = new Random(); // ���� ���� �������� ���� ����

		int[][] practice2 = new int[3][3]; // 3x3 ������ �迭 �޸� �Ҵ�

		for (int i = 0; i < practice2.length; i++) {
			for (int j = 0; j < practice2.length; j++) {
				practice2[i][j] = -1; // 0~8�� ����ϱ� ���� ��� �� -1�� �ʱ�ȭ(�⺻ �ʱ�ȭ�� 0�̱� ����)
			}
		}
		
		
		int num; // ���� �� ����
		boolean condition = false; // �ߺ��� ���� �� �ݺ����� ó������ ������ ����

		for (int i = 0; i < practice2.length; i++) {
			for (int j = 0; j < practice2.length; j++) {

				num = r.nextInt(9); // 0~8 ���� ���� �� ��������

				if (!(i == 0 && j == 0)) { // ���� ó�� �׸��� ��� ���� �ʿ䰡 ���� ������
					for (int k = 0; k < practice2.length; k++) {
						int l = 0;
						
						while (l < practice2.length) {
							if (num == practice2[k][l]) { // �ߺ��� ���
								num = r.nextInt(9); // ���ο� ���� ��
								condition = true; // �ߺ����� ǥ��
							} else {
								condition = false; // �ߺ��� �ƴ��� ǥ��
							}
							l++;
							
							if (condition == true) { // �ߺ��� ��� �ʱ�ȭ ó������ �ٽ� ��
								k = 0;
								l = 0;
							}
						}
					}
				}

				practice2[i][j] = num; // �ߺ����� ���� ���� ���� �迭�� ����

				System.out.println("index (" + i + "," + j + ") " + practice2[i][j]);
			}
		
		}
	}
}