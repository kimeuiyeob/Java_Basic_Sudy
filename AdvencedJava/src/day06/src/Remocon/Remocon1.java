package Remocon;

public class Remocon1 {
	public static void main(String[] args) {

		// TvRemocon��ü�� tv�� ��´�.
		TvRemocon tv = new TvRemocon();
		// 10�� �ں� �Ѵ�.
		for (int i = 0; i < 10; i++) {
			// tv�� TvRemocon��ü�� �ִ� channelUp()�޼��带 ȣ���Ѵ�.
			tv.channelUp();
		}
		// 10�� �ں� �Ѵ�.
		for (int i = 0; i < 10; i++) {
			// tv�� TvRemocon��ü�� �ִ� channelDown()�޼��带 ȣ���Ѵ�.
			tv.channelDown();
		}
		// ���� ���� ���� �ٳ����� �ѹ� �Ѵ�
		System.out.println();
		// 5�� �ں� �Ѵ�.
		for (int i = 0; i < 5; i++) {
			// tv�� TvRemocon��ü�� �ִ� Volup()�޼��带 ȣ���Ѵ�.
			tv.Volup();
		}
		// 5�� �ں� �Ѵ�.
		for (int i = 0; i < 5; i++) {
			// tv�� TvRemocon��ü�� �ִ� Voldown()�޼��带 ȣ���Ѵ�.
			tv.Voldown();
		}

	}

}

//TvRemocon �̳�Ŭ���� �����Ѵ�.
class TvRemocon {
	// ������ ���� volume,channel ������ 1�� �ʱ�ȭ�Ѵ�.
	int volume = 1;
	int channel = 1;

	// channelUp()�޼��带 �����Ѵ�.
	void channelUp() {
		++channel; // ä���� 1�� �����ϰ� ����Ѵ�.
		System.out.println("���� ä���� : " + channel);
	}

	// channelDown()�޼��带 �����Ѵ�.
	void channelDown() {
		--channel; // ä���� 1�� ���� ����Ѵ�.
		System.out.println("���� ä���� : " + channel);
	}

	// Volup()�޼��带 �����Ѵ�.
	void Volup() {
		++volume; // ������ 1�� �����ϰ� ����Ѵ�.
		System.out.println("���� ������ : " + volume);
	}

	// Voldown()�޼��带 �����Ѵ�.
	void Voldown() {
		--volume; // ������ 1�� ���� ����Ѵ�.
		System.out.println("���� ������ : " + volume);
	}

}
