package ElevaterTest;

public class Elevater2 {

	public int kopo07_limit_up_floor; // �ֻ��� ���� ����
	public int kopo07_limit_down_floor; // ������ ���� ����
	public int kopo07_floor; // ������ ���� ����
	public String kopo07_help; // ���ڿ� ���� ����

	// �⺻ ������ ����
	Elevater2() {
		super();
		kopo07_limit_up_floor = 10; // �ֻ��� ���� 10���� �ʱ�ȭ�Ѵ�.
		kopo07_limit_down_floor = 1; // ������ ���� 1���� �ʱ�ȭ�Ѵ�.
		kopo07_floor = 1; // ������ 1������ �ʱ�ȭ�Ѵ�.
		kopo07_help = "���������� ���� �ذ��Ϸ�";
		System.out.println(kopo07_help); // help�� ����Ѵ�.
	}

	// �⺻ ������ ���� / �Ķ���ͷ� �ֻ���, ������, �������� �޴´�.
	Elevater2(int kopo07_limit_up_floor, int kopo07_limit_down_floor, int kopo07_floor) {
		super();
		this.kopo07_limit_up_floor = kopo07_limit_up_floor;
		this.kopo07_limit_down_floor = kopo07_limit_down_floor;
		this.kopo07_floor = kopo07_floor;
		kopo07_help = "���������� ���� �ذ��Ϸ�";
	}

	// up()�޼��带 �����Ѵ�
	void up() {
		// �������� 10�̸� �Ʒ� ���ڿ� ���
		if (kopo07_floor == kopo07_limit_up_floor) {
			kopo07_help = "������ ���Դϴ�.";
		} else {
			// ������ 1 ������ �Ʒ� ���ڿ� ���
			kopo07_floor++;
			kopo07_help = String.format("%d ���Դϴ�.", kopo07_floor);
		}
	}

	// down()�޼��带 �����Ѵ�
	void down() {
		// �������� 0�̸� �Ʒ� ���ڿ� ���
		if (kopo07_floor == kopo07_limit_down_floor) {
			kopo07_help = "ó�� ���Դϴ�.";
		} else {
			// ������ 1�� ���� �Ʒ� ���ڿ� ���
			kopo07_floor--;
			kopo07_help = String.format("%d ���Դϴ�.", kopo07_floor);
		}
	}

	// �޼��� �����ε� / ���� �̸������� �Ķ���͸� �ޱ� ������ �ٸ��޼����̴�.
	void up(int kopo07_u) {
		// �Ķ���ͷ� ����� ������ŭ �ݺ��� ���� up�޼��带 ȣ���Ѵ�.
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			this.up();
		}
	}

	// �޼��� �����ε� / ���� �̸������� �Ķ���͸� �ޱ� ������ �ٸ��޼����̴�.
	void down(int kopo07_u) {
		// �Ķ���ͷ� ����� ������ŭ �ݺ��� ���� down�޼��带 ȣ���Ѵ�.
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			this.down();
		}
	}

	// msg�޼��带 �����Ѵ�.
	void msg(String kopo07_id) {
		// ���ڿ��� ������ �ش� ���ڿ��� �Ʒ� ������ ����Ѵ�.
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n", kopo07_id, kopo07_help, kopo07_limit_up_floor,
				kopo07_limit_down_floor, kopo07_floor);
	}

}
