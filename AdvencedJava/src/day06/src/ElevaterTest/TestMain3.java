package ElevaterTest;

public class TestMain3 {

	public static void main(String[] args) {

		// Elevater3��ü�� �����Ͽ� kopo07_elevater3���������� ��´�.
		Elevater3 kopo07_elevater3 = new Elevater3();

		// �ݺ��� 10��ŭ �Ѵ�.
		for (int i = 0; i < 10; i++) {
			// ���������� Elevater3�� �ִ� up()�޼��带 ȣ���ϰ� �Ʒ��� ����Ѵ�.
			kopo07_elevater3.up();
			System.out.printf("MSG elev[%s]\n", kopo07_elevater3.kopo07_help);
		}
		// �ݺ��� 10��ŭ �Ѵ�.
		for (int i = 0; i < 10; i++) {
			// ���������� Elevater3�� �ִ� down()�޼��带 ȣ���ϰ� �Ʒ��� ����Ѵ�.
			kopo07_elevater3.down();
			System.out.printf("MSG elev[%s]\n", kopo07_elevater3.kopo07_help);
		}
		// Repair()�޼��带 ȣ���Ѵ�. �׷��� �ȿ� �ִ� help���ڿ��� ����Ȱ��� �˼��ִ�.
		kopo07_elevater3.Repair();
		System.out.printf("MSG elev[%s]\n", kopo07_elevater3.kopo07_help);

	}
}