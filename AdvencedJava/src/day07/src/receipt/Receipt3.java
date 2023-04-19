package receipt;

public class Receipt3 {

	public static void main(String[] args) {

		// ����Ʈ���� �ٿ���� scv������ �迭�ȿ� ��´�.
		String[] kopo07_OneRec = { "��,��,���س⵵,�һ���� ��ü ��,�һ���� ������ ��,���ձ��� ���� ��,�������� ���� ��,�ڷγ�19 �糭������ �����",

				"����Ư����,���ı�,2020��,94200,125610,11,10,23500", "����Ư����,���ı�,2020��,94200,125610,11,10,55550",
				"����Ư����,���ı�,2021��,50000,300000,11,43,512500000", "����Ư����,���ı�,2022��,104200,35410,20,30,288000000" };

		// �迭�ȿ� ����, �� ������ ����� ����� �������´�.
		String[] kopo07_field_name = kopo07_OneRec[0].split(","); // field_name�� , �������� ����鸸 ����.
		// ���ڿ� ���� ����
		String returnHangle;

		for (int kopo07_i = 1; kopo07_i < kopo07_OneRec.length; kopo07_i++) { // OneRec�迭�� ������ŭ �ݺ��� ����.

			String[] kopo07_field = kopo07_OneRec[kopo07_i].split(","); // OneRec[i]�� �ε��� �ι�°�� �ִ� ������ ,�������� ���´�.

			// �ε��� 3���� �����̱⶧���� �װ����� ������ ��´�.
			String kopo07_kim1 = kopo07_field[3];
			String kopo07_kim2 = kopo07_field[4];
			String kopo07_kim3 = kopo07_field[5];
			String kopo07_kim4 = kopo07_field[6];
			String kopo07_kim5 = kopo07_field[7];

			// ������ �ǽ��ߴ� ���ڷ� �ѱ� ����� �ڵ带 �޼���ȭ�ؼ� ���� ���ڿ��� �ѱ۷� �ٲ۴�.
			returnHangle = changeToHangel(kopo07_kim1);
			kopo07_field[3] = returnHangle;
			returnHangle = changeToHangel(kopo07_kim2);
			kopo07_field[4] = returnHangle;
			returnHangle = changeToHangel(kopo07_kim3);
			kopo07_field[5] = returnHangle;
			returnHangle = changeToHangel(kopo07_kim4);
			kopo07_field[6] = returnHangle;
			returnHangle = changeToHangel(kopo07_kim5);
			kopo07_field[7] = returnHangle;

			// ����� ���� ����ϴµ� �̶� ���ڵ��� ���� �ѱ۷� �ٲ��� ��µȴ�.
			System.out.printf("***********************************\n");
			for (int kopo07_j = 0; kopo07_j < kopo07_field_name.length; kopo07_j++)
				System.out.printf(" %s : %s\n", kopo07_field_name[kopo07_j], kopo07_field[kopo07_j]); // ����� ������
		}

		System.out.printf("***********************************\n");

	}
//	=============================================================================================================

	// ���ڸ� �ѱ۷� �ٱ��ִ� �޼���
	public static String changeToHangel(String text) {
		// �ε��� ���� ���ϱ� ������ �Ʒ����� ���� �ʱ�ȭ�Ѵ�.
		String[] kopo07_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		String[] kopo07_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };
		// ���� ����־��� ������ �����Ѵ�.
		String kopo07_sNumVal;
		String kopo07_sNumVoice;

		int kopo07_i, kopo07_j;

		kopo07_sNumVal = text;
		kopo07_sNumVoice = "";
		kopo07_i = 0;
		kopo07_j = kopo07_sNumVal.length() - 1; // �ε����� �ڸ��� ���ؼ� ������-1���� ��´�.

		while (true) {
			// ���� i�� sNumVal���̿� ���ٸ� break
			if (kopo07_i >= kopo07_sNumVal.length()) {
				// i�� 0���ͽ����ؼ� ���̸� �ʰ��ϰ� �Ǹ� while���� ����� �ȴ�.
				break;
			}
			// sNumVal�� substring���� ù��°���� �ϳ��ϳ��� �ڸ���. �׸��� �װ�0�� ���ٸ� ������ ����.
			if (kopo07_sNumVal.substring(kopo07_i, kopo07_i + 1).equals("0")) {
				if (kopo07_unitX[kopo07_j].equals("��")) { // ���� �ڸ����� �ִ��� �Ǵ�
					kopo07_sNumVoice = kopo07_sNumVoice + "" + kopo07_unitX[kopo07_j]; // sNumVoice�� ���� "��" ���� �� ����
				} else if (kopo07_unitX[kopo07_j].equals("��") && kopo07_sNumVal.length() > 8 && kopo07_sNumVal
						.substring(kopo07_sNumVal.length() - 8, kopo07_sNumVal.length() - 5).equals("000")) {
					kopo07_sNumVoice = kopo07_sNumVoice + ""; // ���ǿ� �´ٸ� ���� "��"�� ������ ����
				} else if (kopo07_unitX[kopo07_j].equals("��")) {
					kopo07_sNumVoice = kopo07_sNumVoice + "" + kopo07_unitX[kopo07_j];
				} else {
				}
			} else {
				// �������� 0�� ���� ��찡 �ƴ� ��
				kopo07_sNumVoice = kopo07_sNumVoice
						+ kopo07_units[Integer.parseInt(kopo07_sNumVal.substring(kopo07_i, kopo07_i + 1))]
						+ kopo07_unitX[kopo07_j];
			}
			kopo07_i++;
			kopo07_j--;
		}
		return kopo07_sNumVoice; // ����� �����Ѵ�.
	}

}
