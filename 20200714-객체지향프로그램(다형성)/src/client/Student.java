package client;

public class Student {
	
	// studentŬ���� ������ �Ʒ� 4�� ���� ��� ��� ����
	private int hakbun;
	public String name;
	String subject;
	protected String tel;
	
	
	// �����ڸ� default�� ������ �ٸ� ��Ű������ ��� �Ұ�
	/*
	Student() {
		hakbun=1;
		name="ȫ�浿";
		subject="����";
		tel="010-1111-1111";
	*/
		
	// �ٸ� ��Ű������ ����ϱ� ���ؼ� �����ڴ� �ǵ��� public�� ��� ��
	public Student() {
		hakbun=1;
		name="ȫ�浿";
		subject="����";
		tel="010-1111-1111";		
	}


	
	// public �̿� ������ ���� getter/setter
	public int getHakbun() {
		return hakbun;
	}


	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

}
