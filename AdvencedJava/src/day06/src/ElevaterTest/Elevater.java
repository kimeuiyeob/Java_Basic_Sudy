package ElevaterTest;

public class Elevater {

	int kopo07_limit_up_floor = 10; // �ֻ���10�� ������ ��´�
	int kopo07_limit_down_floor = 0; // ������ 0�� ������ ��´�.
	int kopo07_floor = 1; // ���� ������ ������ ��´�
	String kopo07_help; // ���ڸ� ����� ���ڿ����� �����Ѵ�.

	// up()�޼��带 �����Ѵ�.
	void up() {
		// ���� ���� ���� �ֻ���10�� ���ٸ�
		if (kopo07_floor == kopo07_limit_up_floor) {
			// �Ʒ� ���ڿ� ����Ѵ�.
			kopo07_help = "���������Դϴ�.";
		} else {
			// �ƴϸ� ���� 1�� �����Ѵ�.
			kopo07_floor++;
			// �׸��� �Ʒ� ���� ����Ѵ�.
			kopo07_help = String.format("%d���Դϴ�.", kopo07_floor);
		}
	}

	// down()�޼��带 �����Ѵ�.
	void down() {
		// ���� ���� ���� ������0���̶��
		if (kopo07_floor == kopo07_limit_down_floor) {
			// �Ʒ� ���ڿ��� ����Ѵ�.
			kopo07_help = "ó�����Դϴ�.";
		} else {
			// �ƴϸ� �������� 1�� ����.
			kopo07_floor--;
			// �׸��� �Ʒ� ���ڿ��� ����Ѵ�.
			kopo07_help = String.format("%d���Դϴ�.", kopo07_floor);
		}
	}

}
