/*
	Math.random() ==> ���Ƿ� ��ǻ�� ���� (����)
					  ==============
					  	0.0 ~ 0.99
					  => �ζ�
					  1~45	==> (int)(Math.random()*45) +1
					  			=======================
					  					0 ~ 44
 */
public class �迭_�����߻� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ζ� ��ȣ �����ϴ� ���� ==> 6
		int[] lotto = new int[6];
		for(int i=0;i<6;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
		}
		
		// ���
		for(int i:lotto) {
			System.out.println(i+" ");
		}

	}

}
