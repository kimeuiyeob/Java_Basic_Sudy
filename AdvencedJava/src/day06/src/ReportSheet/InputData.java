package ReportSheet;

public class InputData {

	static String[] kopo07_nameArr;// �̸��� ���� ���ڿ� �迭 ����
	static int[] kopo07_korArr; // ���� ������ ���� ������ �迭 ����
	static int[] kopo07_engArr; // ���� ������ ���� ������ �迭 ����
	static int[] kopo07_mathArr; // ���� ������ ���� ������ �迭 ����
	static int[] kopo07_sumArr; // ���� ������ ���� ������ �迭 ����
	static float[] kopo07_avgArr; // ��� ������ ���� ������ �迭 ����

	// �⺻ ������ ������ �����ϳ��� �Ķ���ͷ� �޴´�.
	InputData(int kopo07_iPerson) {
		// �Ķ���ͷ� �޾ƿ� ������ŭ �迭 ũ�� ����
		kopo07_nameArr = new String[kopo07_iPerson];
		kopo07_korArr = new int[kopo07_iPerson];
		kopo07_engArr = new int[kopo07_iPerson];
		kopo07_mathArr = new int[kopo07_iPerson];
		kopo07_sumArr = new int[kopo07_iPerson];
		kopo07_avgArr = new float[kopo07_iPerson];
	}

	// SetData �޼��� ������ �Ķ���ͷ� ����,�̸�,��������,��������,���������� �޴´�.
	public static void SetData(int kopo07_i, String kopo07_name, int kopo07_kor, int kopo07_eng, int kopo07_math) {
		// �޾ƿ� ������ �迭�� �����Ѵ�.
		kopo07_nameArr[kopo07_i] = kopo07_name;
		kopo07_korArr[kopo07_i] = kopo07_kor;
		kopo07_engArr[kopo07_i] = kopo07_eng;
		kopo07_mathArr[kopo07_i] = kopo07_math;

		kopo07_sumArr[kopo07_i] = kopo07_kor + kopo07_eng + kopo07_math; // �����̴ϱ� �� ���Ѱ��� ��´�
		kopo07_avgArr[kopo07_i] = (float) ((float) (kopo07_kor + kopo07_eng + kopo07_math) / 3.0); // ����̴ϱ� �� ���Ѱ����� 3����
																									// ��������
		// ��´�.
	}

}
