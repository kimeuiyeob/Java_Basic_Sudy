package ReportSheet;

public class InputData2 {

	// ���ڿ� ���� ���� ->�̸��� ����ٰ��̴�.
	static String[] kopo07_nameArr;

	// ������ ������ ����,����,����,������ ��� �Ǽ��� �������� ����� ����ٰŴ�.
	static int[] kopo07_korArr;
	static int[] kopo07_engArr;
	static int[] kopo07_mathArr;
	static int[] kopo07_sumArr;
	static float[] kopo07_avgArr;

	// �����հ����� ������ ������ �����Ѵ�.
	static int kopo07_korea;
	static int kopo07_english;
	static int kopo07_math;
	static int kopo07_totalSum;
	static float kopo07_totalavg;

	// �⺻ �����ڿ� �Ķ���ͷ� �����ϳ��� �޴´�.
	InputData2(int kopo07_iPerson) {
		// ���� ��������ŭ �ݺ��� ������ ������ ��ũ�⸸ŭ �迭�� �����.
		kopo07_nameArr = new String[kopo07_iPerson];
		kopo07_korArr = new int[kopo07_iPerson];
		kopo07_engArr = new int[kopo07_iPerson];
		kopo07_mathArr = new int[kopo07_iPerson];
		kopo07_sumArr = new int[kopo07_iPerson];
		kopo07_avgArr = new float[kopo07_iPerson];
	}

	// SetData()������ ��ȣ,�̸�,����,����,���������� �޴´�.
	public static void SetData(int kopo07_i, String kopo07_name, int kopo07_kor, int kopo07_eng, int kopo07_mathes) {
		// ������ �迭�� �� ������ ������� �����Ѵ�.
		kopo07_nameArr[kopo07_i] = kopo07_name;
		kopo07_korArr[kopo07_i] = kopo07_kor;
		kopo07_engArr[kopo07_i] = kopo07_eng;
		kopo07_mathArr[kopo07_i] = kopo07_mathes;
		// �հ� �迭�� 3���� ������� ���� ���ؼ� ����ش�.
		kopo07_sumArr[kopo07_i] = kopo07_kor + kopo07_eng + kopo07_mathes;
		// ��� �迭�� 3���� ������� �տ� /3�� ������ ��հ��� ����ش�.
		// ��հ��� �������� �迭�� �Ǽ��� �迭�� �����ϰ� ���� �Ǽ������� �����Ѵ�.
		kopo07_avgArr[kopo07_i] = (float) ((float) (kopo07_kor + kopo07_eng + kopo07_mathes) / 3.0);

//		=======================================================================
		// �Ʒ� �������� �ݺ��� �������� ������ ������� �հ踦 ������Ų��.
		kopo07_korea += kopo07_kor;
		kopo07_english += kopo07_eng;
		kopo07_math += kopo07_mathes;
		// �հ�� ��յ� ��� �������Ѽ� ������ ��¶� ���հ�� ������� ����Ұ��̴�.
		kopo07_totalSum += kopo07_kor + kopo07_eng + kopo07_mathes;
		// ��հ��� �������� �迭�� �Ǽ��� �迭�� �����ϰ� ���� �Ǽ������� �����Ѵ�.
		kopo07_totalavg += (float) (kopo07_kor + kopo07_eng + kopo07_mathes) / 3.0;
	}

}
