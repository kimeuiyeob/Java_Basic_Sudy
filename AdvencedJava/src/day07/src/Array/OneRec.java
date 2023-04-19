package Array;

public class OneRec {

	// ���ڿ� ������ ������ ���� �����Ѵ�.
	private String kopo07_name;
	private int kopo07_korea;
	private int kopo07_english;
	private int kopo07_math;

	// �⺻�����ڿ� �Ķ���ͷ� �̸�,��������,��������,���������� �޴´�.
	public OneRec(String kopo07_name, int kopo07_korea, int kopo07_english, int kopo07_math) {
		super();
		this.kopo07_name = kopo07_name;
		this.kopo07_korea = kopo07_korea;
		this.kopo07_english = kopo07_english;
		this.kopo07_math = kopo07_math;
	}

	// �̸� ��������
	public String name() {
		return this.kopo07_name;
	}

	// ���� ���� ��������
	public int korea() {
		return this.kopo07_korea;
	}

	// ���� ���� ��������
	public int english() {
		return this.kopo07_english;
	}

	// ���� ���� ��������
	public int math() {
		return this.kopo07_math;
	}

	// �������� �հ� ��������
	public int sum() {
		return kopo07_korea + kopo07_english + kopo07_math;
	}

	// �������� ��� ��������
	public double avg() {
		return sum() / 3.0;
	}

}
