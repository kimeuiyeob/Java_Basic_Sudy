package Array;

public class Array {

	public static void main(String[] args) {
		// ������ �迭 �Ʒ� ����� ����ش�.
		int[] kopo07_iArray = { 1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };

		// �迭�ȿ� ������ŭ �ݺ��� ������.
		for (int kopo07_i = 0; kopo07_i < kopo07_iArray.length; kopo07_i++) {
			// ����� �ش� �ε����� ���� ����Ѵ�.
			System.out.printf("iArray[%d]=%d\n", kopo07_i, kopo07_iArray[kopo07_i]);
		}

		// �迭���� �ִ밪 ���ϱ� / �켱������ �Ǿտ� ���� max������ ��� �ٺ��ϴ� ����̴�.
		int kopo07_max = kopo07_iArray[0];
		// �ִ밪�� �ε��� ���° �ִ����� Ȯ���ϱ� ���ؼ� �����ϳ��� �������.
		int kopo07_number = 0;
		// �迭 ������ŭ �ݺ��� ������ / �ִ밪�� ���ϱ� ���ؼ��� �� ���غ����ϱ� �����̴�.
		for (int kopo07_i = 0; kopo07_i < kopo07_iArray.length; kopo07_i++) {
			// ���� ���� ù��°�� ���� ������ �ε��� �״����� �ִ°��� �� ũ�ٸ� �״������� max�� �־ �ִ밪�� ���ϴ� ����̴�.
			if (kopo07_max < kopo07_iArray[kopo07_i]) {
				kopo07_max = kopo07_iArray[kopo07_i];
				kopo07_number = kopo07_i; // �ش� ���ڸ� ������ ��� �ִ밪�� ���° �ε����� �ִ��� Ȯ���ϴ°��̴�.
			}
		}
		// �ִ밪�� �� �ε��� ��ġ�� ����Ѵ�.
		System.out.printf("MAX : iArray[%d]=%d\n", kopo07_number, kopo07_max);

	}

}
