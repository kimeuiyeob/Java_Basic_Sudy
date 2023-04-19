package MethodOverLoading;

public class MethodOverLoad {

	public static void main(String[] args) {

		// ���� �������� �����Ͽ� ������ ����� �ʱ�ȭ�Ѵ�.
		int kopo07_korean = 100;
		int kopo07_eng = 80;
		int kopo07_math = 92;
		int kopo07_sci = 95;
		int kopo07_soc = 83;

		// ���� ���� ���� ���� ��ȸ���� ������� ����Ѵ�.
		System.out.printf("3�� ����ǥ\n");
		System.out.printf("========================================================\n");
		System.out.printf("�̸�      ����   ����   ����  ����   ���\n");
		System.out.printf("========================================================\n");
		System.out.printf("������    %-7s%-7s%-7s%-7s%-7s\n", kopo07_korean, kopo07_eng, kopo07_math,
				// kopo07_Cal ��ü�ȿ� �ִ� sum()�޼��带 ���� ���հ��� ����Ѵ�.
				kopo07_Cal.kopo07_sum(kopo07_korean, kopo07_eng, kopo07_math),
				// kopo07_Cal ��ü�ȿ� �ִ� avg()�޼��带 ���� ���հ��� ����Ѵ�.
				kopo07_Cal.kopo07_avg(kopo07_korean, kopo07_eng, kopo07_math));
		System.out.printf("\n\n");

		System.out.printf("4�� ����ǥ\n");
		System.out.printf("========================================================\n");
		System.out.printf("�̸�      ����   ����   ����  ����   ����   ���\n");
		System.out.printf("========================================================\n");
		System.out.printf("������    %-7s%-7s%-7s%-7s%-7s%-7s\n", kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci,
				// kopo07_Cal ��ü�ȿ� �ִ� sum()�޼��带 ���� ���հ��� ����Ѵ�.
				kopo07_Cal.kopo07_sum(kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci),
				// kopo07_Cal ��ü�ȿ� �ִ� avg()�޼��带 ���� ���հ��� ����Ѵ�.
				kopo07_Cal.kopo07_avg(kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci));
		System.out.printf("\n\n");

		System.out.printf("5�� ����ǥ\n");
		System.out.printf("========================================================\n");
		System.out.printf("�̸�      ����   ����   ����  ����   ��ȸ   ����   ���\n");
		System.out.printf("========================================================\n");
		System.out.printf("������    %-7s%-7s%-7s%-7s%-7s%-7s%-7s\n", kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci,
				// kopo07_Cal ��ü�ȿ� �ִ� sum()�޼��带 ���� ���հ��� ����Ѵ�.
				kopo07_soc, kopo07_Cal.kopo07_sum(kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci, kopo07_soc),
				// kopo07_Cal ��ü�ȿ� �ִ� avg()�޼��带 ���� ���հ��� ����Ѵ�.
				kopo07_Cal.kopo07_avg(kopo07_korean, kopo07_eng, kopo07_math, kopo07_sci, kopo07_soc));

	}

}

//==================================================================================================
//kopo07_Cal �̳�Ŭ������ �����Ѵ�.
class kopo07_Cal {
	// sum()�޼��带 �����Ѵ�. / sum�� ���հ��̹Ƿ� ����,����,���������� �ŰԺ����� �޾ƿ´�.
	public static int kopo07_sum(int kopo07_korea, int kopo07_english, int kopo07_math) {
		int kopo07_sum = 0; // ������ �����ؼ� ����� sum������ �����Ѵ�.
		kopo07_sum += kopo07_korea + kopo07_english + kopo07_math; // �� �����ذ��� sum�� ��´�.
		return kopo07_sum; // sum������ �����Ѵ�.
	}

	// avg()�޼��带 �����Ѵ�. / avg�� ����̹Ƿ� ����,����,���������� �ŰԺ����� �޾ƿ´�.
	public static int kopo07_avg(int kopo07_korea, int kopo07_english, int kopo07_math) {
		int kopo07_avg = 0; // ��հ��� ����� avg���� ����
		kopo07_avg += (kopo07_korea + kopo07_english + kopo07_math) / 3; // avg������ �����Ѵ�.
		return kopo07_avg; // avg�� �����Ѵ�.
	}

//	=====================================================================
	// �����ε� / sum()�޼��带 �����Ѵ�. / sum�� ���հ��̹Ƿ� ����,����,����,��Ȯ ������ �ŰԺ����� �޾ƿ´�.
	public static int kopo07_sum(int kopo07_korea, int kopo07_english, int kopo07_math, int kopo07_science) {
		int kopo07_sum = 0; // ������ �����ؼ� ����� sum������ �����Ѵ�.
		kopo07_sum += kopo07_korea + kopo07_english + kopo07_math + kopo07_science; // �� �����ذ��� sum�� ��´�.
		return kopo07_sum; // sum������ �����Ѵ�.
	}

	// avg()�޼��带 �����Ѵ�. / avg�� ����̹Ƿ� ����,����,����,���� ������ �ŰԺ����� �޾ƿ´�.
	public static int kopo07_avg(int kopo07_korea, int kopo07_english, int kopo07_math, int kopo07_science) {
		int kopo07_avg = 0; // ��հ��� ����� avg���� ����
		kopo07_avg += (kopo07_korea + kopo07_english + kopo07_math + kopo07_science) / 4; // avg������ �����Ѵ�.
		return kopo07_avg; // avg�� �����Ѵ�.
	}

//	=====================================================================
	// �����ε� / sum()�޼��带 �����Ѵ�. / sum�� ���հ��̹Ƿ� ����,����,����,����,���� ������ �ŰԺ����� �޾ƿ´�.
	public static int kopo07_sum(int kopo07_korea, int kopo07_english, int kopo07_math, int kopo07_science,
			int kopo07_history) {
		int kopo07_sum = 0; // ������ �����ؼ� ����� sum������ �����Ѵ�.
		kopo07_sum += kopo07_korea + kopo07_english + kopo07_math + kopo07_science + kopo07_history; // �� �����ذ��� sum��
																										// ��´�.
		return kopo07_sum; // sum������ �����Ѵ�.
	}

	// avg()�޼��带 �����Ѵ�. / avg�� ����̹Ƿ� ����,����,����,����,���� ������ �ŰԺ����� �޾ƿ´�.
	public static int kopo07_avg(int kopo07_korea, int kopo07_english, int kopo07_math, int kopo07_science,
			int kopo07_history) {
		int kopo07_avg = 0; // ��հ��� ����� avg���� ����
		kopo07_avg += (kopo07_korea + kopo07_english + kopo07_math + kopo07_science + kopo07_history) / 5;// avg������
																											// �����Ѵ�.
		return kopo07_avg; // avg�� �����Ѵ�.
	}
}
