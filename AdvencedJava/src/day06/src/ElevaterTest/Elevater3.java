package ElevaterTest;

//Elevater3Ŭ������ Elevater2�� ��ӹ޴´�.
public class Elevater3 extends Elevater2 {

	// Repair()�޼��带 �����Ѵ�.
	void Repair() {
		// �� �޼��尡 ȣ���̵Ǹ� help������ �������Դϴٸ� ��´�.
		kopo07_help = String.format("�������Դϴ�.");
	}

	// up()�޼��带 �����Ѵ�.
	void up() {
		// ���� �������� �ֻ������� ���ų� ������ �Ʒ��� ����Ѵ�.
		if (kopo07_floor >= kopo07_limit_up_floor) {
			kopo07_help = "���������Դϴ�.";
		} else {
			// �ƴϸ� �������� 2�� �����ϰ� �Ʒ� �� ����Ѵ�.
			kopo07_floor = kopo07_floor + 2;
			kopo07_help = String.format("%d���Դϴ�.", kopo07_floor);
		}
		// down()�޼��带 ȣ���Ѵ�.
		this.down();
	}

	// down()�޼��带 �����Ѵ�.
	void down() {
		// �θ��� down()�޼��带 ȣ���ϰ� �Ʒ����ڿ��� ����Ѵ�.
		super.down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.kopo07_help);
	}

}
