package ElevaterTest;

public class TestMain {

	private static int kopo07_inVal; // ������ �������� ����

	// TestMainŬ�����ȿ� up()�޼ҵ带 �ϳ� �� �����Ѵ�. /�̶� Elevator up�޼ҵ�ʹ� �ٸ��Ŵ�.
	public static void up() {
		kopo07_inVal++; // inVal�� 1�� �����Ѵ�.
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", kopo07_inVal); // inVal�� ����Ѵ�.
	}

	public static void main(String[] args) {

		kopo07_inVal = 0; // inVal�� 0���� �ʱ�ȭ�Ѵ�.
		Elevater kopo07_elev; // Elevater��ü�� ���� �������� kopo07_elev�� �����Ѵ�.
		kopo07_elev = new Elevater(); // Elevater��ü�� kopo07_elev�� ��´�.

		up(); // �̶� up()�޼���� ���� �޼��带 ȣ���Ѱ��̴�.

		// �ݺ��� 10����ŭ ������.
		for (int i = 0; i < 10; i++) {
			// �Ʒ� up()�޼���� Elevater��ü�ȿ� �ִ� up()�޼ҵ带 ȣ���Ѱ��̴�.
			kopo07_elev.up(); // �׷��� .���� �����ؼ� Ȯ���� ��� �޼������� �������ذ��̴�.
			// Elevater��ü�ȿ� �ִ� help���ڿ��� ����Ѵ�.
			System.out.printf("MSG[%s]\n", kopo07_elev.kopo07_help);
		}
		// �ݺ��� 10����ŭ ������.
		for (int i = 0; i < 10; i++) {
			// �Ʒ� down()�޼���� Elevater��ü�ȿ� �ִ� down()�޼ҵ带 ȣ���Ѱ��̴�.
			kopo07_elev.down();
			// Elevater��ü�ȿ� �ִ� help���ڿ��� ����Ѵ�.
			System.out.printf("MSG[%s]\n", kopo07_elev.kopo07_help);
		}

	}
}
