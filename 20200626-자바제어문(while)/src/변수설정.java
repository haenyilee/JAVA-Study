import sun.launcher.resources.launcher;

/*
	��ȭ => ���� �����ϴ� ����
	

#����ִ�(2020) ����   
 ���� 06 . 7  
 �ѱ�
2020.06.24 ����  
98��, 15���̻������ 
���� ������  
�ֿ� ������, �ڽ���  
���� 1��  
��������357,069�� 



���(2019) ����   
���� 08 . 8  
���
�ѱ�
2020.06.10 ���� 
110��, 15���̻������ 
���� �ڻ���  
�ֿ� ������, ������, ����ȣ  
���� 2��  
��������617,898�� 


 
 */
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����
		String title="#����ִ�(2020)";
		boolean isOpen=true;
		double score=6.7;
		String genre="";
		String na="�ѱ�";
		String regdate="2020.06.24";
		String director="������";
		String actor="������, �ڽ���";
		int time=98;
		int grade=15;
		int rank=1;
		int showUser=357069; // �޸� ����~!
		
		int a=0;
		System.out.println("============��ȭ����"+(int)(++a)+"============");
		System.out.println("��ȭ��"+title);
		System.out.println(""+(isOpen==true?"����":"�̰���")); // ���׿�����
		System.out.println("��Ÿ:"+na+" ,����:"+grade+"�̻������");
		System.out.println("�ð�:"+time+"��");
		System.out.println("������:"+regdate+"����");
		System.out.println("����:"+director);
		System.out.println("�ֿ�:"+actor);
		System.out.println("����:"+rank+"��");	
		System.out.println("����������:"+showUser+"��");
		
		
		title="���(2019)";
		isOpen=true;
		score=8.8;
		genre="���";
		na="�ѱ�";
		regdate="2020.06.10";
		director="�ڻ���";
		actor="������, ������, ����ȣ";
		time=110;
		grade=15;
		rank=2;
		showUser=617898;
		
		System.out.println("============��ȭ����"+(int)(++a)+"============");
		System.out.println("��ȭ��"+title);
		System.out.println(""+(isOpen==true?"����":"�̰���")); // ���׿�����
		System.out.println("��Ÿ:"+na+" ,����:"+grade+"�̻������");
		System.out.println("�ð�:"+time+"��");
		System.out.println("������:"+regdate+"����");
		System.out.println("����:"+director);
		System.out.println("�ֿ�:"+actor);
		System.out.println("����:"+rank+"��");	
		System.out.println("����������:"+showUser+"��");

	}

}
