package com.sist.method;
class AA
{
	public void AA() // �Ϲ� �ν��Ͻ� �޼ҵ� ==> �����ڰ� �� �� ���� , void�� �������� ������(������� �������� ������ ����)
	{
		System.out.println("AA() Call...");
	}
	
	public AA() // ������ ==> ���������̳� �������� �����ϸ� �ȵ�(void���Ұ�) : �����ڴ� Ư���޼ҵ�
	{
		System.out.println("AA() Call...");
	}
}

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ȣ�� ==> �������� ����
		AA a=new AA();
		
		// �Ϲ� �޼ҵ� AAȣ��(������ �ҷ�����)
		a.AA();

	}

}
