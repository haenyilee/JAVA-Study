/* ��ȭ > ��ȭ���� �����͸� ��ƾ���
1. ��ȭ�� 	2.�⿬ 	3. �⿬ 	������ 	���� ==> ��ȭ 5��


*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �迭�� index�� ����ϴ� ���α׷�
		String[] title= {"#����ִ�(2020)"
				,"���(2019)"
				,"�¿���: �� �Ϸ��� ����(2020)"
				,"�Ҹ���(2020)"
				,"��ũ ����Ʈ(2008)"
		};
		String[] director= {"������"
				,"�ڻ���"
				,"�� ��ĵ��"
				,"������"
				,"ũ�������� ���"
		};
		String[] actor= {"������, �ڽ���"
				,"������, ������, ����ȣ"
				,"ũ���� ����, �� Ȧ����, ��Ÿ��� ���漭, �ٸ��� ���̽� �巹Ƕ��"
				,"�̺���, ������, ���Ͽ�, ��ö��, �赿��, �����"
				,"ũ������ ����, ���� ����, �Ʒ� ��ũ��Ʈ"
		};

		double[] reserve= {17.3
				,12.6
				,7.8
				,1.3
				,1.0
		};
		int[] rank= {1,2,3,4,5};

		for (int i = 0; i < rank.length; i++) {
			System.out.println("��ȭ��:"+title[i]);
			System.out.println("�⿬:"+actor[i]);
			System.out.println("����:"+director[i]);
			System.out.println("������:"+reserve[i]);
			System.out.println("����:"+rank[i]);
			System.out.println("============================================");
		}
		
		
	}

}
