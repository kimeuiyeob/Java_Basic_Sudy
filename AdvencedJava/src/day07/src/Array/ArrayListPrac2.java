package Array;

import java.util.ArrayList;

public class ArrayListPrac2 {

	public static void main(String[] args) {

		// ���������� 1000000���� �ʱ�ȭ
		int kopo07_iTestMax = 1000000;
		// IntegerŸ������ ����Ʈ ����
		ArrayList<Integer> kopo07_list = new ArrayList<>();

		// ���� ����ŭ �ݺ��� ������.
		for (int kopo07_i = 0; kopo07_i < kopo07_iTestMax; kopo07_i++) {
			// ����Ʈ�� ���������� ��´�.
			kopo07_list.add((int) (Math.random() * 1000000));
		}

		// ����Ʈ������ �� ����Ʈ�ȿ��ִ� ������ ������ŭ �ݺ�����. -> 1000000 ����.
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// ������ ������ �ϳ��� get()������ ����Ѵ�.
			System.out.printf(" ArrayList %d = %d\n", kopo07_i, kopo07_list.get(kopo07_i));
		}

		System.out.printf("*****************************\n");
		// sort()�Լ��� ����Ͽ� �ȿ��ִ� ������ ������� ���Ľ�Ų��.
		kopo07_list.sort(null);
		// ����Ʈ ���鸸ŭ �ݺ�����.
		for (int kopo07_i = 0; kopo07_i < kopo07_list.size(); kopo07_i++) {
			// ������ ������ �ϳ��� get()������ ����Ѵ�. -> �̷��� ���ڰ� ���ĵ� ���·� �ٽ� ��µȴ�.
			System.out.printf(" ArrayList %d = %d\n", kopo07_i, kopo07_list.get(kopo07_i));
		}
	}

}
