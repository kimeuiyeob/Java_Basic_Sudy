package Remocon;

public class Remocon2 {
	static Remocon kopo07_remocon1;

	public static void main(String[] args) {

		// remocon1������ Remocon��ü�� ������ ��´�.
		kopo07_remocon1 = new Remocon();

		// 10�� �ݺ��� ������.
		for (int kopo07_i = 0; kopo07_i < 10; kopo07_i++) {
			// upchannel()�� ȣ���Ѵ�.
			kopo07_remocon1.upchannel();
		}
		// upchannel()���� 3�� �Ķ���ͷ� �����ؼ� �޼ҵ带 ȣ���ϸ� ä���� 3��ŭ �����Ѵ�.
		kopo07_remocon1.upchannel(3);

		// 10�� �ݺ��� ������.
		for (int kopo07_i = 0; kopo07_i < 10; kopo07_i++) {
			// upVolume()�� ȣ���Ѵ�.
			kopo07_remocon1.upVolume();
		}
		// downVolume()���� 3�� �Ķ���ͷ� �����ؼ� �޼ҵ带 ȣ���ϸ� ä���� 3��ŭ ��������.
		kopo07_remocon1.downVolume(3);
	}
}

class Remocon {

	private int kopo07_limit_up_channel; // �ֻ��� ���� ����
	private int kopo07_limit_down_channel; // ������ ���� ����
	private int kopo07_channel; // ������ ���� ����

	private int kopo07_limit_up_volume; // �ֻ� ���� ���� ����
	private int kopo07_limit_down_volume; // ���� ���� ���� ����
	private int kopo07_volume; // ���� ���� ���� ����

	public String kopo07_help; // ���ڿ� ���� ����

	// �⺻ ������ ����
	public Remocon() {
		super();
		kopo07_limit_up_channel = 20; // �ֻ��� ������ 20���� �ʱ�ȭ
		kopo07_limit_down_channel = 1; // ������ ������ 1�� �ʱ�ȭ
		kopo07_channel = 1; // �������� 1�� �ʱ�ȭ

		kopo07_limit_up_volume = 30; // �ֻ� ������ 30���� �ʱ�ȭ
		kopo07_limit_down_volume = 1; // ���� ������ 1�� �ʱ�ȭ
		kopo07_volume = 1; // ���� ������ 1�� �ʱ�ȭ

		kopo07_help = "���¾� ������~"; // ���ڿ� �ʱ�ȭ

	}

//=================================================================================
//ä�� ��ĭ�� ��
	void upchannel() {
		System.out.println("ä�� ��ĭ ��!");
		// ���� �������� �ֻ����̶�� �Ʒ� ���ڿ� ���
		if (kopo07_channel == kopo07_limit_up_channel) {
			kopo07_help = "������ ä���Դϴ�.";
		} else {
			// ä�� 1�� ������ �Ʒ� ���
			kopo07_channel++;
			kopo07_help = String.format("[%d] ä���Դϴ�.", kopo07_channel);
		}
	}

	// ä�� ��ĭ�� �ٿ�
	void downchannel() {
		System.out.println("ä�� ��ĭ �ٿ�!");
		// ���� �������� �������̶�� �Ʒ� ���ڿ� ���
		if (kopo07_channel == kopo07_limit_down_channel) {
			kopo07_help = "ó�� ä���Դϴ�.";
		} else {
			// ä�� 1�� ���� �Ʒ� ���
			kopo07_channel--;
			kopo07_help = String.format("[%d] ä���Դϴ�.", kopo07_channel);
		}
	}

//=================================================================================
//���� ��ĭ�� ��
	void upVolume() {
		System.out.println("���� ��ĭ ��");
		// ���� ���� ������ �ֻ� �����̶�� �̷� ���
		if (kopo07_volume == kopo07_limit_up_volume) {
			kopo07_help = "������ �����Դϴ�.";
		} else {
			// ���� 1�� ������ �Ʒ� ���� ���
			kopo07_volume++;
			kopo07_help = String.format("[%d] �����Դϴ�.", kopo07_volume);
		}
	}

	// ���� ��ĭ�� �ٿ�
	void downVolume() {
		System.out.println("���� ��ĭ �ٿ�");
		// ���� ���� ������ ���� ������ ���ٸ� �Ʒ� ���
		if (kopo07_volume == kopo07_limit_down_volume) {
			kopo07_help = "ó�� �����Դϴ�.";
		} else {
			// ���� 1�� ���� �Ʒ� ���ڿ� ���
			kopo07_volume--;
			kopo07_help = String.format("[%d] �����Դϴ�.", kopo07_volume);
		}
	}

//==================================================================================
//���� ���ڸ�ŭ ��
	void upVolume(int kopo07_u) {
		// �Ķ���ͷ� ���� ����ŭ �ݺ�
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			// upVolume()�޼��� ȣ��
			this.upVolume();
		}
		// �Ʒ� ���ڿ��� ���
		System.out.println(kopo07_u + "ĭ ���� ��");
		System.out.println("���纼�� : " + kopo07_volume);
	}

	// ���� ���ڸ�ŭ �ٿ�
	void downVolume(int kopo07_u) {
		// �Ķ���ͷ� ���� ����ŭ �ݺ�
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			// downVolume()�޼��� ȣ��
			this.downVolume();
		}
		// �Ʒ� ���ڿ��� ���
		System.out.println(kopo07_u + "ĭ ���� �ٿ�");
		System.out.println("���纼�� : " + kopo07_volume);
	}

//==================================================================================
	// ä�� ���ڸ�ŭ ��
	void upchannel(int kopo07_u) {
		// �Ķ���ͷ� ���� ����ŭ �ݺ�
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			// upchannel()�޼��� ȣ��
			this.upchannel();
		}
		// �Ʒ� ���ڿ��� ���
		System.out.println(kopo07_u + "ĭ ä�� ��");
		System.out.println("����ä�� : " + kopo07_channel);
	}

	// ä�� ���ڸ�ŭ �ٿ�
	void downchannel(int kopo07_u) {
		// �Ķ���ͷ� ���� ����ŭ �ݺ�
		for (int kopo07_i = 0; kopo07_i < kopo07_u; kopo07_i++) {
			// downchannel()�޼��� ȣ��
			this.downchannel();
		}
		// �Ʒ� ���ڿ��� ���
		System.out.println(kopo07_u + "ĭ ä�� �ٿ�");
		System.out.println("����ä�� : " + kopo07_channel);
	}

//==================================================================================

}
