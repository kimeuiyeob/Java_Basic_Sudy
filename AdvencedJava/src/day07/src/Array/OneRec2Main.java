package Array;

import java.util.ArrayList;

public class OneRec2Main {
	// OneRec2Ÿ���� ����ƮArrayOneRec�� �����Ѵ�.
	static ArrayList<OneRec2> kopo07_ArrayOneRec = new ArrayList<OneRec2>();

	public static void main(String[] args) {
		// �Լ��� ȣ���Ѵ�. / 20�� �������� �̸��� ������ ������.
		dataSet();
		// ����� ����Ѵ�.
		HeaderPrint();
		// ItemPrint()�޼���� 20���� �������� ����Ѵ�.
		for (int kopo07_i = 0; kopo07_i < kopo07_ArrayOneRec.size(); kopo07_i++) {
			ItemPrint(kopo07_i);
		}
		// ������ ����Ѵ�.
		TailPrint();
	}

	// ���� �հ踦 ����� �������� ����
	static int kopo07_sumKorea = 0;
	static int kopo07_sumEnglish = 0;
	static int kopo07_sumMath = 0;
	static int kopo07_sumSum = 0;
	static int kopo07_sumAvg = 0;

	// 20���� ����� ������ ����ϱ� ���ؼ� ������ 20���� �ʱ�ȭ
	static final int kopo07_IPERSON = 20;

	// 20�� �ݺ��� ���� ���ο� �̸��� ���ο� �������� �����س��� ����Ʈ�� �߰��Ѵ�.
	public static void dataSet() {
		// ���� �������ŭ �ݺ��� ����.
		for (int kopo07_i = 0; kopo07_i < kopo07_IPERSON; kopo07_i++) {
			// ������ �����̸��� �������� �������� ������ ��´�.
			String kopo07_name = String.format("ȫ��%02d", kopo07_i);
			int kopo07_korea = (int) (Math.random() * 100);
			int kopo07_english = (int) (Math.random() * 100);
			int kopo07_math = (int) (Math.random() * 100);
			// �̶� new OneRec2�Ǳ⺻ �����ڸ� ���ؼ� ������ �ѹ��� ����ش�.
			kopo07_ArrayOneRec.add(new OneRec2(kopo07_i, kopo07_name, kopo07_korea, kopo07_english, kopo07_math));
		}
	}

	// ��� �޼���
	public static void HeaderPrint() {
		System.out.printf("******************************************\n");
		System.out.printf("  %2s%4s  %2s %2s %2s %2s     %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("******************************************\n");
	}

	public static void ItemPrint(int kopo07_i) {
		// ArrayOneRec ����Ʈ�ȿ� ������� ������ rec�� ��� �� rec������ ���ο� �ִ� ������ ����Ѵ�.
		OneRec2 kopo07_rec = kopo07_ArrayOneRec.get(kopo07_i);
		System.out.printf("%4d  %4s  %3d  %3d  %3d  %3d     %6.2f\n", kopo07_rec.number(), kopo07_rec.name(),
				kopo07_rec.korea(), kopo07_rec.english(), kopo07_rec.math(), kopo07_rec.sum(), kopo07_rec.avg());

		// ���� �޼���ȿ� ���������� ���ؼ� += �� ���� ������ ����ش�.
		kopo07_sumKorea += kopo07_rec.korea();
		kopo07_sumEnglish += kopo07_rec.english();
		kopo07_sumMath += kopo07_rec.math();
		kopo07_sumSum += kopo07_rec.sum();
		kopo07_sumAvg += kopo07_rec.avg();

	}

	// ���� �޼���
	public static void TailPrint() {
		System.out.printf("******************************************\n");
		// �հ�� �հ������ ����ϴ°Ŷ� �Ѵ����� ������ ����Ʈ�� ������ŭ �����ָ� �װ� ����̵ȴ�. ����Ʈ ������ �� ������̱� �����̴�.
		System.out.printf("�����հ�: %d  �������: %6.2f\n", kopo07_sumKorea,
				kopo07_sumKorea / (double) kopo07_ArrayOneRec.size());
		System.out.printf("�����հ�: %d  �������: %6.2f\n", kopo07_sumEnglish,
				kopo07_sumEnglish / (double) kopo07_ArrayOneRec.size());
		System.out.printf("�����հ�: %d  �������: %6.2f\n", kopo07_sumMath,
				kopo07_sumMath / (double) kopo07_ArrayOneRec.size());
		System.out.printf("******************************************\n");
		System.out.printf("������հ�: %d  �����: %6.2f\n", kopo07_sumAvg, kopo07_sumAvg / (double) kopo07_ArrayOneRec.size());
	}

}
