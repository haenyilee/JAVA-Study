// ����ڰ� ���� ���������� �����

class MovieInfo{
	// ������� = �ν��Ͻ����� => �޸� ������ �������ַ��� => new�� ��� ��� ����
	String title;
	String director;
	String actor;
	double reserve;
	int rank;
	static String site_name=""; // ������ �ϳ��̱� ������ ���� �����ϸ� ��ü�� �� �� �ٲ�~!
}
// MovieInfo m1=new MovieInfo()

public class MainClass2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovieInfo m1=new MovieInfo();
		
		// m1 => �޸𸮿� ����Ǿ� �ִ� ������ �ʱⰪ
		m1.title="#����ִ�(2020)";
		m1.director="������";
		m1.actor="������, �ڽ���";
		m1.reserve=17.3;
		m1.rank=1;
		m1.site_name="CGV"; // => �Ե��ó׸� => �ް��ڽ�
		
		MovieInfo m2=new MovieInfo();
		// m2 => �޸𸮿� ����Ǿ� �ִ� ������ �ʱⰪ
		m2.title="���(2019)";
		m2.director="�ڻ���";
		m2.actor="������, ������, ����ȣ";
		m2.reserve=12.6;
		m2.rank=2;
		m2.site_name="�Ե��ó׸�";
		
		MovieInfo m3=new MovieInfo();
		// m2 => �޸𸮿� ����Ǿ� �ִ� ������ �ʱⰪ
		m3.title="�¿���: �� �Ϸ��� ����(2020)";
		m3.director="�� ��ĵ��";
		m3.actor="ũ���� ����, �� Ȧ����, ��Ÿ��� ���漭, �ٸ��� ���̽� �巹Ƕ��";
		m3.reserve=7.8;
		m3.rank=3;
		m3.site_name="�ް��ڽ�"; // static���� ���ٹ��(1)
		
		MovieInfo.site_name="�������"; // static���� ���ٹ��(2)
		
		System.out.println("��ȭ��: "+m1.site_name);
		m3.title="�Ҹ���(2020)";
		System.out.println("��ȭ����: "+m1.title);
				


	}

}
