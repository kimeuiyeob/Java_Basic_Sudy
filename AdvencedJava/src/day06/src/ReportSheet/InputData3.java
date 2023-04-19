package ReportSheet;

public class InputData3 {

	// ������ �̸��� �������� ����ϱ� ���� �迭�� ���� �����Ͽ���.
	static String[] kopo07_nameArr;
	static int[] kopo07_korArr;
	static int[] kopo07_engArr;
	static int[] kopo07_mathArr;
	static int[] kopo07_sumArr;
	static float[] kopo07_avgArr;

	// ���� �������� ������ �����ϱ� ���� �����Ͽ���.
	static int kopo07_korea;
	static int kopo07_english;
	static int kopo07_math;
	static int kopo07_totalSum;
	static float kopo07_totalavg;

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

	// ������� ReportSheetŬ�������� �ѿ����� �׼���ŭ �迭�� �����Ѵ�.
	InputData3(int kopo07_iPerson) {

		// �迭�� 1�� ��Ű�������� �ݺ��� 1���� �����ؼ��̴�.
		kopo07_nameArr = new String[kopo07_iPerson + 1];
		kopo07_korArr = new int[kopo07_iPerson + 1];
		kopo07_engArr = new int[kopo07_iPerson + 1];
		kopo07_mathArr = new int[kopo07_iPerson + 1];
		kopo07_sumArr = new int[kopo07_iPerson + 1];
		kopo07_avgArr = new float[kopo07_iPerson + 1];

	}

	// SetData�޼���� ReportSheetŬ�������� �ݺ��� ���� ������ ���⼭ �迭�� �ϳ��ϳ� ����ذ��̴�.
	public static void SetData(int kopo07_i, String kopo07_name, int kopo07_kor, int kopo07_eng, int kopo07_mathes) {

		kopo07_nameArr[kopo07_i] = kopo07_name;
		kopo07_korArr[kopo07_i] = kopo07_kor;
		kopo07_engArr[kopo07_i] = kopo07_eng;
		kopo07_mathArr[kopo07_i] = kopo07_mathes;

		kopo07_sumArr[kopo07_i] = kopo07_kor + kopo07_eng + kopo07_mathes; // �����̴�.
		kopo07_avgArr[kopo07_i] = (float) ((kopo07_kor + kopo07_eng + kopo07_mathes) / 3.0); // ����� �� ���Ѱ��� 3�� �������̴�.

//		=======================================================================

		// ����� ������ ���������� �˱����ؼ� ��� ������Ų���̴�.
		kopo07_korea += kopo07_kor;
		kopo07_english += kopo07_eng;
		kopo07_math += kopo07_mathes;
		kopo07_totalSum += kopo07_kor + kopo07_eng + kopo07_mathes;
		kopo07_totalavg += (kopo07_kor + kopo07_eng + kopo07_mathes) / 3.0;

	}
}