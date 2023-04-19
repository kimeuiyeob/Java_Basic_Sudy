package Array;

import java.util.ArrayList;

public class ArrayListPrac {

	public static void main(String[] args) {

		// ���׸� �� Ÿ���� String���� ����Ʈ�� �����Ѵ�.
		ArrayList<String> kopo07_list = new ArrayList<>();

		// ����Ʈ�� add��°ɷ� ���� ����ִ´�.
		kopo07_list.add("abc");
		kopo07_list.add("abcd");
		kopo07_list.add("efga");
		kopo07_list.add("������0");
		kopo07_list.add("1234");
		kopo07_list.add("12rk34");

		System.out.printf("******************************************\n");
		System.out.printf(" ���� ArraySize %d \n", kopo07_list.size()); // ����Ʈ ���� ���
		// ����Ʈ ������ŭ �ݺ��ϰ� ù��° ������� �ϳ��ϳ� ���
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// ����Ʈ �ȿ� ������ ���
			System.out.printf(" ArrayList %d = %s\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

		// set�� 3��° �ε����ȿ� ���� �ٱ��ִ°��̴�.
		kopo07_list.set(3, "������");
		System.out.printf("******************************************\n");
		System.out.printf(" ���� ���� ArraySize %d \n", kopo07_list.size()); // ����Ʈ ���� ���
		// ����Ʈ ������ŭ �ݺ��ϰ� ù��° ������� �ϳ��ϳ� ���
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// ����Ʈ �ȿ� ������ ���
			System.out.printf(" ArrayList %d = %s\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

		// remove�� 4��° �ε����� ���� ����°��̴�.
		kopo07_list.remove(4);
		System.out.printf("******************************************\n");
		System.out.printf(" ���� ���� ArraySize  %d \n", kopo07_list.size()); // ����Ʈ ���� ���
		// ����Ʈ ������ŭ �ݺ��ϰ� ù��° ������� �ϳ��ϳ� ���
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// ����Ʈ �ȿ� ������ ���
			System.out.printf(" ArrayList %d = %s\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

		// sort�� ����Ʈ�ȿ� ������ ������� �����Ѵ� ���� ���� ���ĺ� ���� �ѱۼ��̴�.
		kopo07_list.sort(null);
		System.out.printf("******************************************\n");
		System.out.printf(" ���� ���� ArraySize  %d \n", kopo07_list.size()); // ����Ʈ ���� ���
		// ����Ʈ ������ŭ �ݺ��ϰ� ù��° ������� �ϳ��ϳ� ���
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// ����Ʈ �ȿ� ������ ���
			System.out.printf(" ArrayList %d = %s\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

		// clear removeAll ���� ����Ʈ���� ���ڴٴ°Ŵ�.
		kopo07_list.clear(); // removeAll ����ѰŴ�.
		System.out.printf("******************************************\n");
		System.out.printf(" ���� ���� ArraySize %d \n", kopo07_list.size()); // ����Ʈ ���� ���
		// ����Ʈ ������ŭ �ݺ��ϰ� ù��° ������� �ϳ��ϳ� ���
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// ����Ʈ �ȿ� ������ ���
			System.out.printf(" ArrayList %d = %s\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

	}

}
