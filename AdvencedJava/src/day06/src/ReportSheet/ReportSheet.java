package ReportSheet;

public class ReportSheet {

	public static void main(String[] args) {

		// ������ ���� ������ 10���� �ʱ�ȭ
		int kopo07_iPerson = 10;

		// InputData��ü �����ڿ� iPerson�� ����
		InputData kopo07_inData = new InputData(kopo07_iPerson);

		// iPerson�� ��ŭ �ݺ�������.
		for (int kopo07_i = 0; kopo07_i < kopo07_iPerson; kopo07_i++) {
			// ���ڿ� ���� ������ �̸��� ����+1�����Ѱ͸�ŭ ��´�.
			String kopo07_name = String.format("ȫ��%02d", kopo07_i);
			// Math.random()�Լ��� 1~100�ڸ� �������� ����,����,���� ������ ��´�.
			int kopo07_kor = (int) (Math.random() * 100);
			int kopo07_eng = (int) (Math.random() * 100);
			int kopo07_math = (int) (Math.random() * 100);
			// ������ SetData()�Լ��� �����Ѵ�.
			// �̷��� �Ǹ� InputDataŬ�����ȿ� ������ �迭�� ������ iPerson����ŭ ���� ���̴�.
			kopo07_inData.SetData(kopo07_i, kopo07_name, kopo07_kor, kopo07_eng, kopo07_math);

		}
		// iPerson��ŭ �ݺ� ������.
		for (int kopo07_i = 0; kopo07_i < kopo07_iPerson; kopo07_i++) {
			// ������ �迭�� �� �ִ� ������ ������� ����Ѵ�.
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%s, ����:%s, ����:%s, ����:%d, ���%6.2f\n", kopo07_i,
					kopo07_inData.kopo07_nameArr[kopo07_i], kopo07_inData.kopo07_korArr[kopo07_i],
					kopo07_inData.kopo07_engArr[kopo07_i], kopo07_inData.kopo07_mathArr[kopo07_i],
					kopo07_inData.kopo07_sumArr[kopo07_i], kopo07_inData.kopo07_avgArr[kopo07_i]);
		}
	}

}
