/*
	���������� : !
		==> true -> false , false -> true
		==> ����� : boolean
		
			���� : 
				���� => int
				���� => boolean
			���� : 
				��� => ?
					int + int = int
					double + int = double
				��, �� => boolean
			���� : ��1 or ��2 (������� ������ ���� ���� �޶���)
				����?��1:��2
					sex==1?"����":"����"
					sex==1?1:2
					sex==1?"m":"w"
	
 */
public class ���׿�����_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck = true;
		bCheck=!bCheck; // true�� �ݴ밪�� �����Ѵ�.
		bCheck=!bCheck; // false�� �ݴ밪�� �����Ѵ�. ==> ��/����, �Ͻ�����/��� ���� �ݺ��� �� ���
		System.out.println("bCheck="+bCheck);
	}

}
