package Array;

public class OneRecMain {

	public static void main(String[] args) {

		// ���� ���� ������ 10���� �ʱ�ȭ
		int kopo07_iPerson = 10;
		// ���� �������ŭ �迭 ����
		OneRec[] kopo07_inData = new OneRec[kopo07_iPerson];
		// ������ �迭�� ������ ����ش�.
		kopo07_inData[0] = new OneRec("���ǿ�", 100, 100, 100);
		kopo07_inData[1] = new OneRec("������", 50, 70, 100);
		kopo07_inData[2] = new OneRec("������", 100, 30, 60);
		kopo07_inData[3] = new OneRec("������", 70, 100, 100);
		kopo07_inData[4] = new OneRec("���ο�", 100, 100, 100);
		kopo07_inData[5] = new OneRec("���ǿ�", 50, 100, 100);
		kopo07_inData[6] = new OneRec("������", 100, 100, 100);
		kopo07_inData[7] = new OneRec("������", 100, 40, 100);
		kopo07_inData[8] = new OneRec("������", 100, 100, 20);
		kopo07_inData[9] = new OneRec("���ο�", 100, 30, 100);

		// �迭�� ����ŭ �ݺ��Ѵ�.
		for (int kopo07_i = 0; kopo07_i < kopo07_inData.length; kopo07_i++) {
			// �迭�� 0��° �ε������� ������� ����Ѵ�.
			System.out.printf("��ȣ:%d  �̸�:%5.5s  ����:%5d  ����:%5d  ����:%5d  ����:%5d  ���:%6.2f\n", kopo07_i,
					kopo07_inData[kopo07_i].name(), kopo07_inData[kopo07_i].korea(), kopo07_inData[kopo07_i].english(),
					kopo07_inData[kopo07_i].math(), kopo07_inData[kopo07_i].sum(), kopo07_inData[kopo07_i].avg());
		}

	}

}
