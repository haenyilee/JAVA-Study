import java.util.*;

// ���� ���
// �л� ���� ���������� ���� => ����� ���� ��������
class Student{
	String name; // null => ��� Ŭ���� (�ּ�) �ּҰ� ���� ���(null)
	int kor; // 0
	int eng;
	int math;
	int total;
	double avg; // 0.0
	int rank;
	
}
public class MainClass {

	static void process() {
		Student[] std=new Student[3]; // �л� 3��
		// �Է� => �ʱⰪ
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<std.length;i++) {
			// �޸� �Ҵ�
			std[i]=new Student();
			System.out.print("�̸� �Է�: ");
			std[i].name=scan.next();
			
			System.out.print("�������� �Է�: ");
			std[i].kor=scan.nextInt();
			
			System.out.print("�������� �Է�: ");
			std[i].eng=scan.nextInt();
			
			System.out.print("�������� �Է�: ");
			std[i].math=scan.nextInt();
			
			std[i].total=std[i].kor+std[i].eng+std[i].math;
			std[i].avg=std[i].total/3.0;
		}
		
		// ���
		for(Student s:std) {
			System.out.println(s.name+" : "+s.kor+" "+s.eng+" "+s.math+" "+s.total+" "+s.avg);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	process();

	}

}
