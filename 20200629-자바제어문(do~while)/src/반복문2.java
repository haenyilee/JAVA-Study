// do~while 
// ����ڰ� �Է��� ������ �ش�Ǵ� ������ 
import java.util.*; // Ű���� �Է°��� �޾ƿ��� ��� => Scanner
// BufferedReader => ����ó�� 
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� ���� 
		int user=0; // ����ڰ� �Է��� �� ���� �޸� ���� 
		int i=9; // 1~9���� �����ϴ� ���� ==> 9�� ���� 
		
		// Ű���� �Է°� �ޱ� 
		Scanner scan=new Scanner(System.in);
		// ��� Ŭ������ �޸𸮿� �����Ҷ� new�̿��Ѵ� 
		// ���� ==> Math.random() => static�޼ҵ� :���۰� ���ÿ� �޸� �ڵ� ���� 
		
		System.out.print("2~9���� ������ ���� �Է�:");
		// => scanner => ���� , ���ͽÿ� ���� �޸� ���� 
		
		user=scan.nextInt();
		// ����ڰ� Ű����� �Է��� ������ �о�ͼ� ���� => user��� ���� 
		
		do
		{
			// printf ==> %n , \n ==> �����ٿ� ��� 
			// print , println ==> \n
			System.out.printf("%d * %d = %d\n",user,i,user*i);
		    i--;//i=0
		}while(i>=1);
	}

}


