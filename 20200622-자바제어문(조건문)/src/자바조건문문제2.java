/*
 <����>
	2. ���� 3���� �Է¹޾Ƽ� ������ ����� ���ϰ� ������ ���ض� 
	=> ���� : 
	60�̻��̸� d
	70	==> c
	80	==> b
	90	==> a
	������==> f
	
	���� : 80
	���� : 80
	���� : 80
	
	���� : 240
	��� : 80.0
	���� : B
 */


import java.util.Scanner;

public class �ڹ����ǹ�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2�� ����	
		int kor=0;
		int eng=0;
		int math=0;
		
		Scanner scan2=new Scanner(System.in);
		// scan ==> ������ ���� �� ����
		System.out.println("������ �Է��Ͻÿ� : ");
		// �Է� ��� : �Է� + �����̽�
		
		kor=scan2.nextInt();
		eng=scan2.nextInt();		
		math=scan2.nextInt();
		
		char grade='A';
		
		int total=(kor+eng+math);
		double avg=(total/3); // int�� �ƴ϶� double��! �Ҽ��ڸ����� ������ ����̴ϱ�...
		
		// ���� if�� �� ���� (if > else if > else if > else if > else)
		if (avg>=60 && avg<70)
			grade='D'; 			//System.out.println("D"); (x)
		if (avg>=70 && avg<80)
			grade='C'; 			// System.out.println("C"); 
		if (avg>=80 && avg<90)
			grade='B';			// System.out.println("B");
		if (avg>=90 && avg<=100)
			grade='A';			// System.out.println("A"); 
		if (avg<60) // else ���̸� �ȵ� ==> ���� ����� �ٷ� �� ���ǿ� ���� else�� ���͹��� ==> if ���� �ɾ���� ��
			grade='F';
	
		System.out.println("����:"+total);
		System.out.printf("���:%.2f%n",avg); // %��ü�ڸ�.�Ҽ����Ʒ��ڸ�f ex. %14.10f%n
		System.out.println("����:"+grade);
	}

}
