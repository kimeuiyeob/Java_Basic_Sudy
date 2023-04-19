package ChangeReportSheet;

public class InputDataArray {

	String kopo07_name;

	// ���� �������� ������ �����ϱ� ���� �����Ͽ���.
	int kopo07_korea;
	int kopo07_english;
	int kopo07_math;
	int kopo07_totalSum;
	float kopo07_totalavg;

	// ������������ �հ�� ����� ����ϱ� ���ؼ� �������� �ѹ��� �����Ͽ���.
	static int kopo07_koreaNow;
	static int kopo07_englishNow;
	static int kopo07_mathNow;
	static int kopo07_totalSumNow;
	static float kopo07_totalavgNow;

	// ������������ ������������ ��羿 ���ؼ� ����ϱ� ���� �ѹ��� �����Ͽ���.
	static int kopo07_koreaNowMore;
	static int kopo07_englishNowMore;
	static int kopo07_mathNowMore;
	static int kopo07_totalSumNowMore;
	static float kopo07_totalavgNowMore;

//	=======================================================================

	// �⺻ �����ڸ� �����ϰ� �ŰԺ����� ��ȣ,�̸�,����,����,���������� �޴´�.
	public InputDataArray(int kopo07_i, String kopo07_name, int kopo07_korea, int kopo07_english, int kopo07_math) {
		super();
		this.kopo07_name = kopo07_name;
		this.kopo07_korea = kopo07_korea;
		this.kopo07_english = kopo07_english;
		this.kopo07_math = kopo07_math;
	}

	// �⺻ ������ ����
	public InputDataArray() {
	}

	// �̸� �ҷ�����
	public String name() {
		return this.kopo07_name;
	}

	// ���� ���� �ҷ�����
	public int korea() {
		return this.kopo07_korea;
	}

	// ���� ���� �ҷ�����
	public int english() {
		return this.kopo07_english;
	}

	// ���� ���� �ҷ�����
	public int math() {
		return this.kopo07_math;
	}

	// �հ� ���� �ҷ�����
	public int sum() {
		return kopo07_korea + kopo07_english + kopo07_math;
	}

	// ��� ���� �ҷ�����
	public double avg() {
		return sum() / 3.0;
	}

}
