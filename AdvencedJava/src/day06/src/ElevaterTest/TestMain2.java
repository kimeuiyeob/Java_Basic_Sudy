package ElevaterTest;

public class TestMain2 {

	// Elevater2��ü�� el1,2,3������ ��´�.
	static Elevater2 kopo07_el1;
	static Elevater2 kopo07_el2;
	static Elevater2 kopo07_el3;

	public static void main(String[] args) {

		// el1,2,3������ Elevater2��ü�� �����Ѵ�.
		// �⺻ �����ڸ� el1�� ��´�.
		kopo07_el1 = new Elevater2();
		// �Ķ���ͷ� �޴� �����ڸ� el2�� ��´�.
		kopo07_el2 = new Elevater2(20, 1, 8);
		// �Ķ���ͷ� �޴� �����ڸ� el3�� ��´�.
		kopo07_el3 = new Elevater2(50, -3, 5);

		// 20��ŭ �ݺ��� ������.
		for (int kopo07_i = 0; kopo07_i < 20; kopo07_i++) {
			// 20�� up()�޼��带 ȣ���Ѵ�. / �̷��� �������� 20�� ������ �ֻ����� 10���̹Ƿ� ���ڹ����� ��µɰ��̴�.
			kopo07_el1.up();
			// msg() �޼��带 ����Ѵ�.
			kopo07_el1.msg("1�� ���� ���� ������");
		}

		// 20��ŭ �ݺ��� ������.
		for (int kopo07_i = 0; kopo07_i < 20; kopo07_i++) {
			// �Ʒ��� �Ķ���� �޴� up()�޼���� 2���� �� 20�� �ö󰡰� ��µȴ�.
			kopo07_el1.up(2);
			// msg() �޼��带 ����Ѵ�.
			kopo07_el1.msg("1�� ���� 2�� ������");
		}

		// 20��ŭ �ݺ��� ������.
		for (int kopo07_i = 0; kopo07_i < 20; kopo07_i++) {
			// �Ʒ��� �Ķ���� �޴� down()�޼���� 3���� �� 20�� �ö󰡰� ��µȴ�.
			kopo07_el1.down(3);
			// msg() �޼��带 ����Ѵ�.
			kopo07_el1.msg("1�� ���� 3�� ������");
		}

	}
}
