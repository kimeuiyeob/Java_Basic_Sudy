package MethodTest;

public class MethodTest2 {
	// ���� ���� ������ ���� ����
	static int kopo07_iStatic;

	// add�޼��� ���� / �Ķ���ͷ� ������ �޴´�.
	public static void add(int kopo07_i) {
		kopo07_iStatic++; // add�޼��带 ���ο��� ȣ���ϰ� �Ǹ� iStatic�� 1�� �����Ѵ�.
		kopo07_i++; // �Ķ���ͷ� ���� ������ 1�� �����Ѵ�.
		// ������ iStatic�� ����Ѵ�.
		System.out.printf("add�޼ҵ忡�� -> iStatic=[%d]\n", kopo07_iStatic);
		// ������ i�� ����Ѵ�.
		System.out.printf("add�޼ҵ忡�� -> i=[%d]\n", kopo07_i);
	}

	// add2�޼��� ���� / �Ķ���ͷ� ������ �޴´�.
	public static int add2(int kopo07_i) {
		kopo07_iStatic++; // add�޼��带 ���ο��� ȣ���ϰ� �Ǹ� iStatic�� 1�� �����Ѵ�.
		kopo07_i++; // �Ķ���ͷ� ���� ������ 1�� �����Ѵ�.
		// ������ iStatic�� ����Ѵ�.
		System.out.printf("add�޼ҵ忡�� -> iStatic=[%d]\n", kopo07_iStatic);
		// ������ i�� ����Ѵ�.
		System.out.printf("add�޼ҵ忡�� -> i=[%d]\n", kopo07_i);
		// i�� ���� �����Ѵ�.
		return kopo07_i;
	}

	public static void main(String[] args) {

		int kopo07_iMain; // ���� ���� �����Ѵ�.
		// ������ ������ 1�� �ʱ�ȭ�Ѵ�
		kopo07_iMain = 1;
		// ���������� ������ iStatic�� 1�� �ʱ�ȭ�Ѵ�.
		kopo07_iStatic = 1;

		System.out.printf("*********************************************\n");
		// iStatic�� ����Ѵ� / �̶��� �޼��带 ȣ������ �ʾұ⶧���� �ʱ�ȭ�� ���� ��µȴ�.
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iStatic=[%d]\n", kopo07_iStatic);
		// iMain�� ����Ѵ� / �̶��� �޼��带 ȣ������ �ʾұ⶧���� �ʱ�ȭ�� ���� ��µȴ�.
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iMain=[%d]\n", kopo07_iMain);
		System.out.printf("*********************************************\n");

		// add�޼��� ȣ��� �Ķ���ͷ� iMain�� ������. (�̰� �Ķ���ͷ� ���� int i�̴�)
		// �׸��� add�޼��� �ȿ� �ִ� ��°����� ����Ѵ�.
		add(kopo07_iMain);

		System.out.printf("*********************************************\n");
		// iStatic�� ����Ѵ� /�̶��� �޼��尡 ȣ��Ǿ ������ ���� ��µȴ�.
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iStatic=[%d]\n", kopo07_iStatic);
		// iMain�� ����Ѵ� /�̶��� �޼��尡 ȣ��Ǿ ������ ���� ��µȴ�.
		System.out.printf("�޼ҵ�ȣ���� ���ο��� -> iMain=[%d]\n", kopo07_iMain);
		System.out.printf("*********************************************\n");

		// add�޼��� ȣ��� �Ķ���ͷ� iMain�� ������. (�̰� �Ķ���ͷ� ���� int i�̴�)
		// �׸��� add�޼��� �ȿ� �ִ� ��°����� ����Ѵ�.
		kopo07_iMain = add2(kopo07_iMain);

		System.out.printf("*********************************************\n");
		// iStatic�� ����Ѵ� /�̶��� �޼��尡 ȣ��Ǿ ������ ���� ��µȴ�.
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� -> iStatic=[%d]\n", kopo07_iStatic);
		// iMain�� ����Ѵ� /�̶��� �޼��尡 ȣ��Ǿ ������ ���� ��µȴ�.
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� -> iMain=[%d]\n", kopo07_iMain);
		System.out.printf("*********************************************\n");

	}

}
