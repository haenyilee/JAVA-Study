/*
	������ ���� => 5���� ������ �Ŀ�
	�ִ밪, �ּҰ� ���ϴ� ���α׷�
	
 */
public class �迭_�ִ��ּҰ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 5���� �����ϴ� ������ ����� ==> �迭
		int[] arr=new int[5]; // 0 0 0 0 0
		
		// 5���� ���� ����
		for(int i=0;i<5;i++)
		{
			// ���� = 0 ....�� =4
			arr[i]=(int)(Math.random()*100)+1;
			// 		2��			1�� 			3��
			// 1��:0.0~99.0 ==> 2��:������ȯ ==> 0~99 ==> 3��:1~100
		}
		
		// ���
		// int i ==> index�� �ƴ϶� => ���� ����� ���� ����
		for(int i:arr) {
			System.out.println(i+" ");
		}
		
		System.out.println("\n=====������=======");
		// �ּҰ��� �����ϴ� ����
		int min=100;
		/*
			min���� ���� �� ���� ū������ �����ص־� �� => �׷� ������ ���ؼ� ��� ���� ���� �ٲ��ٰ��� or ���� �� �ϳ��� ����
			20	30	50	60	80
		 */
		
	
		// �ִ밪�� �����ϴ� ����
		int max=1;// or int max=arr[0];
		
		// �ּҰ�/�ִ밪 ���ϱ�
		for(int i=0;i<5;i++) {
			if(min>arr[i]) {   // �ּ�����
				min=arr[i];
			}
			if(max<arr[i]) {   // �ִ�����
				max=arr[i];
			}
			
		}
		
		System.out.println("�ּҰ�:"+min);
		System.out.println("�ִ밪:"+max);		
			
		}

	}

