/*
		���α׷�
			= ������ ����
				���� ===> �迭, Ŭ����
			= ��ɹ�
				===> ��ɹ� ����	==> �޼ҵ�
			=============================
			��ü ���� ���α׷�(Web)
			
		=======================================================
		������ ����
			�Ѱ�		==> 	����/���
			������	==>		�迭
		
		������ ó��(������� ��û��� ó��)
			���, ������
		
		����� ���� ==> ����, ������, ������, �ڵ����� ���� ���� �ٸ�
		======================================================= Ŭ����			
		
		==> �׽�Ʈ, ����ڰ� �Է°��� �߸��Ǹ� => ���� ����
				=> if
				=> ����ó��
 */

// �� �� �Է� ==> �Է°� �ޱ�
import java.util.*;
public class �޷¸���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0,month=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("�⵵�Է�:");
		year=scan.nextInt();
		
		System.out.println("�� �Է�:");
		month=scan.nextInt();
		
		// �Է��� (��/��)���
		System.out.println(year+"�� "+month+"��");
		
		// ���� �� �����
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		for(String week:strWeek) {
			System.out.print(week+"\t");
		}
		
		// ù�� ���� ���ϱ�
		/*
			2020
			���⵵������ �ѳ��� 1��~2019.12.31���� �� ���� 
			7
			���ޱ����� �� 2020.01.01 ~ 2020.06.30
			+1
		 */
		// ��������� ��
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100 	// ����
				+(year-1)/400;
		// ���� ������ ��
		int[] lastDay= {31,28,31,30,31,30,
						31,31,30,31,30,31};
		
			// ���� ���� ����
			if((year%4==0 && year%100!=0)||(year%400==0))
					lastDay[1]=29;
			else {
				lastDay[1]=28;
			}
		
		for(int i=0; i<month-1;i++) {
			total+=lastDay[i];
		}
		
		// 1������ ����
		total++;
		
		int week=total%7;
		// �޷� ���
		System.out.println();
		for(int i=1;i<=lastDay[month-1];i++) // ���ؾȰ�����
		{
			if(i==1) {
				for(int j=0;j<week;j++) {
				System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			
			// 5�Ϻ��� �ؿ� ��µǰ� �ϱ�
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
		
		
			

		
		
		
		
		
		
		
		
		
		
		

	}

}
