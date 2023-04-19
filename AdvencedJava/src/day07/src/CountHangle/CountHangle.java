package CountHangle;

public class CountHangle {

	public static void main(String[] args) {

		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ�abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ��ѱ�aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackeword("�ѱ�aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackeword("�ѱ��ѱ�aa", 15));
		System.out.printf("�ѱ��� [%d]��\n", HanCount("�ѱ��ѱ���aa"));

	}

//	===================================================================================
	// �ѱ����� ���� ���� �Լ�
	public static int HanCount(String kopo07_text) {
		// ī��Ʈ�� ���� ���� ����
		int kopo07_count = 0;
		// ���ڿ��� ���̸�ŭ �ݺ��� ����.
		for (int kopo07_i = 0; kopo07_i < kopo07_text.length(); kopo07_i++) {
			// �� ���ڿ��� ������ �ѹ��ڸ� textSplit�� ��´�.
			char kopo07_textSplit = kopo07_text.charAt(kopo07_i);
			// �� ������ ����Ʈ ���̸� textByteCount�� ��´�.
			int kopo07_textByteCount = String.valueOf(kopo07_textSplit).getBytes().length;
			// ���� 2�� ������ �װ� �ѱ��̱⶧���� ī��Ʈ ������ ����.
			if (kopo07_textByteCount == 2) {
				kopo07_count++;
			}
		}
		return kopo07_count;
	}

//	===================================================================================
	// ���ڿ� �տ� ���� �ִ� �Լ�
	public static String HanBlankForeword(String kopo07_text, int kopo07_length) {
		// �޾ƿ� ���ڿ��� ����Ʈ ������ bytelength�� ��´�.
		int kopo07_bytelength = kopo07_text.getBytes().length;
		// 15���� �� ����Ʈ ������ ������ blankCount��´�.
		int kopo07_blankCount = kopo07_length - kopo07_bytelength;
		String kopo07_blank = " ";
		String kopo07_key = "";
		// �� ������ŭ �ݺ��� ���� key������ ��´�.
		for (int kopo07_i = 0; kopo07_i < kopo07_blankCount; kopo07_i++) {
			kopo07_key += kopo07_blank;
		}
		// �� ������ ������� text���ڿ� �տ��� �ٿ��� �����Ѵ�.
		return kopo07_key + kopo07_text;
	}

//	===================================================================================
	// ���ڿ� �ڿ� ���� �ִ� �Լ�
	public static String HanBlankBackeword(String kopo07_text, int kopo07_length) {
		// �޾ƿ� ���ڿ��� ����Ʈ ������ bytelength�� ��´�.
		int kopo07_bytelength = kopo07_text.getBytes().length;
		// 15���� �� ����Ʈ ������ ������ blankCount��´�.
		int kopo07_blankCount = 15 - kopo07_bytelength;
		String kopo07_blank = " ";
		String kopo07_key = "";
		// �� ������ŭ �ݺ��� ���� key������ ��´�.
		for (int kopo07_i = 0; kopo07_i < kopo07_blankCount; kopo07_i++) {
			kopo07_key += kopo07_blank;
		}
		// �� ������ ������� text���ڿ� �ڿ��� �ٿ��� �����Ѵ�.
		return kopo07_text + kopo07_key;
	}

}
