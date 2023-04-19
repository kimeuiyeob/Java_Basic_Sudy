package SplitMethod;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class SplitMethod {
//	=======================================================================================
	// ���ڿ� �迭�� ������ ������� ��´�.
	static String[] kopo07_items = { "aaaa��������������Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 10", "��������E", "���� ���Ϸ� �� ��������",
			"����Ȩ SAFE �ڵ����", "��� �Ŷ��120g*5", "(��)����������", "���ѱ� ������� 156g", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)",
			"����ũ ź�θ� �߰���", "(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ ����̿���500",
			"���� ���ִ¿���GT ��", "���������÷�10��", "��������(��)65g*6", "�ɶ�ý� ���� Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g", "CJ ����Ĩ 20G",
			"����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư��", "������ݺ�����ġ��ȹ" };

	// ������ �迭�� ���� ������ ������ �°� ������ ��´�.
	static int[] kopo07_price = { 10, 6920, 59820, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980,
			7130, 3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };

	// ������ �迭�� ���� ������ ������ �°� ������ ��´�.
	static int[] kopo07_amount = { 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 };

	// �Ҹ��� �迭�� ���� ������ ������ �°� true,false�� ��´� / �̰� ���ݰ������������� �ƴ����� �����ϱ� ���ؼ��̴�.
	static boolean[] kopo07_tax = { false, false, false, false, true, false, true, false, true, false, false, false,
			false, false, false, false, true, false, false, false, false, false, false, false, false, true, false, true,
			false, false, false };

	static int kopo07_totalAmount = kopo07_items.length; // ������ ���� totalAmount�� ������ ������ ��´�. ->�ݺ��� ������ ���ؼ���.
	static int kopo07_count = 1; // ������ ���� count�� 1�� �ʱ�ȭ�Ѵ�. -> ������ ���� ���ؼ���.
	static double kopo07_taxFreeItems = 0; // �Ǽ��� ���� taxFreeItems�� 0���� �ʱ�ȭ�Ѵ�. -> ���ݰ����������� ������ ��� ���ؼ���.
	static double kopo07_taxNotFreeItems = 0; // �Ǽ��� ���� taxNotFreeItems�� 0���� �ʱ�ȭ�Ѵ�. -> ���ݾ������� ������ ��� ���ؼ���.
	static double kopo07_bugase = 0; // �Ǽ��� ���� bugase�� 0���� �ʱ�ȭ�Ѵ�. -> �ΰ��� ������ ��� ���ؼ���.
	static double kopo07_TotalPrice = 0; // �Ǽ��� ���� TotalPrice�� 0���� �ʱ�ȭ�Ѵ�. ->�� ������ ��� ���ؼ���.
	static int i = 0;

	// LocalDateTime��ü�� ������ ���� �ð��� now���������� ��´�.
	static LocalDateTime kopo07_now = LocalDateTime.now();
	// Calendar��ü�� ������ currentDateTime�� ��´�.
	Calendar kopo07_currentDateTime = Calendar.getInstance();
	// DecimalFormat��ü�� ����� ���� 3�ڸ�����,�� �ٿ��ش�.
	static DecimalFormat kopo07_df = new DecimalFormat("###,###,###,###,###");

//	=======================================================================================
//	=======================================================================================

	public static void main(String[] args) {
		int itemCounnt = kopo07_items.length; // ������ ������ itemCounnt������ ��´�.
		TitlePrint(); // ������ ����Ѵ�.
		HeaderPrint(); // ����� ����Ѵ�.
		for (int i = 0; i < itemCounnt; i++) {
			itemPrint(i); // ������ ������ŭ �ݺ��� ���� �����۵��� ����Ѵ�.
		}
		TotalPrint();// ������ ����Ѵ�.
	}

//	=======================================================================================
//	=======================================================================================

	// ����Ʈ�� ������ ���ڿ� ���� ���� �ڸ���
	public static void itemSub() {
		for (int i = 0; i < kopo07_items.length; i++) { // ������ ������ŭ �ݺ��� ������.
			// ��� �����ۿ� ����ŭ�� ������ �߰��ؼ� ���δ�. / ������ ���̴� ������ �������̸��� ����Ʈ14���� ���̰� ������������ ��������
			// �־�̴�.
			kopo07_items[i] += "                          ";
			int kopo07_getBytesCount = 0; // ����Ʈ������ ���� ���� ���� ����
			for (int j = 0; j < kopo07_items[i].length(); j++) { // ������ �ϳ��� ���̸�ŭ �ݺ��� ������.
				char changeText = kopo07_items[i].charAt(j); // ������ �ϳ��� �ѹ��ڸ� ������ ������ ��´�.
				kopo07_getBytesCount += String.valueOf(changeText).getBytes().length; // �� ������ ����Ʈ ���̸� ������ ������ ��´�.
				if (kopo07_getBytesCount == 13) { // ������ ���̸�ŭ �ݺ��� �����ϱ� ��� �ݺ��� ���ٰ� ����Ʈ������ 13��ŭ ������ �Ʒ��� ����.
					char checkText = kopo07_items[i].charAt(j + 1); // 13����Ʈ �������� �� ���ڸ� ������ ��´�.
					// checkText������ ����Ʈ ���̸� checking�� ��´�./�̶� 2�� ���� �ѱ��̰� 1�̴��� �����������̴�.
					int checking = String.valueOf(checkText).getBytes().length;
					if (checking == 1) { // ���� checking�� 1�̶��
						// �ش� �����ۿ� �Ѿ�� ������ ���ڸ� �ڸ���.
						kopo07_items[i] = kopo07_items[i].substring(0, j + 2);
					} else {
						// �ƴϸ� �ش� �����ۿ� �Ѿ�� ������ ���ڿ� ������� �߰��Ѵ�.
						kopo07_items[i] = kopo07_items[i].substring(0, j + 1) + " ";
					}
					// 14�� �¾� �������� ���� �Ѿ�� ���ڸ� �ڸ���.
				} else if (kopo07_getBytesCount == 14) {
					kopo07_items[i] = kopo07_items[i].substring(0, j + 1);
				}
			}
		}
	}

//	=======================================================================================
	// ����� ����Ѵ�.
	public static void TitlePrint() {
		System.out.printf("%s %29.29s\n", "emart", "�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%30.30s\n", "206-86-50913 ����");
		System.out.printf("%29.29s\n", "���� ������ ������� 552");
		System.out.printf("\n");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż�7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
	}

//	=======================================================================================
	// �ð� �Լ����� ������ ���Ŀ� ���� �޼��带 �����Ѵ�.
	public static String TimeStamp1() {
		String kopo07_formatedNow = kopo07_now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		return kopo07_formatedNow;
	}

	public static String TimeStamp2() {
		String kopo07_formatedNow2 = kopo07_now.format(DateTimeFormatter.ofPattern("MM��dd��"));
		return kopo07_formatedNow2;
	}

	public static String TimeStamp3() {
		String kopo07_formatedNow3 = kopo07_now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		return kopo07_formatedNow3;
	}

	public static String TimeStamp4() {
		String kopo07_formatedNow4 = kopo07_now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		return kopo07_formatedNow4;
	}

	// �����ð��� �ҷ����� �Լ��̴�.
	public static String ParkingTime() {
		// Calendar��ü�� ������ currentDateTime���������� ��´�. / �� ��ü�� ������ ������ Calendar��ü���� ����
		// ��¥�ð����� ���ϰ� ���� �ֱ⶧���̴�.
		Calendar kopo07_currentDateTime = Calendar.getInstance();
		// .add�޼ҵ带 ���Ͽ� �ð��� -2�ð���ŭ �����ش�.
		kopo07_currentDateTime.add(Calendar.HOUR, -2);
		// ���� ���ϴ� ��¥ ������ kopo07_format1�� ����ش�.
		SimpleDateFormat kopo07_format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// formattedCurrentDateTime������ ���� ���ϴ� ���Ŀ��� -2�ð��� ���� �� ������ ��´�.
		String kopo07_formattedCurrentDateTime = kopo07_format1.format(kopo07_currentDateTime.getTime());
		// �����Ѵ�.
		return kopo07_formattedCurrentDateTime;
	}

//	=======================================================================================

	// ��� ���
	public static void HeaderPrint() {
		String kopo07_time1 = TimeStamp1();
		// TimeStamp1()ȣ���� ���ϴ� �ð������� time������ ��´�.
		System.out.printf("[%s]%s%18.18s\n", "�� ��", kopo07_time1, "POS:0011-9861"); // time�� ����Ѵ�.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  %s %15.15s %4.4s %5.5s\n", "��ǰ��", "�� ��", "����", "�� ��");
		System.out.printf("-----------------------------------------\n");
	}

//	=======================================================================================
	// ������ ���
	public static void itemPrint(int itemlength) { // �������� ����ϱ� ���ؼ� �Ķ���ͷ� ������ �޴´�.
		// itemSub()�޼��带 ���Ͽ� ���� �����۵��� ���� ���ϴ� ��ŭ �߶��ش�.
		itemSub();
		// ���� true / false�� �ش� �������� ���ݾ������ΰ� �������� �������ΰ��� �Ǻ��ϱ� ���� ���ǹ��̴�.
		if (kopo07_tax[i] == false) {
			// ���� �������� �ƴ϶�� ��¹� �տ� ������� �߰��Ͽ� ����Ѵ�.
			System.out.printf("%s %s%11.11s%3.3s%11.11s\n", " ", kopo07_items[i], kopo07_df.format(kopo07_price[i]),
					kopo07_df.format(kopo07_amount[i]), kopo07_df.format(kopo07_price[i] * kopo07_amount[i]));
			kopo07_TotalPrice += (kopo07_price[i] * kopo07_amount[i]);
		}
		if (kopo07_tax[i] == true) {
			// ���� �������̶�� ��¹� �տ� ���� �߰��Ͽ� ����Ѵ�.
			System.out.printf("%s %s%11.11s%3.3s%11.11s\n", "*", kopo07_items[i], kopo07_df.format(kopo07_price[i]),
					kopo07_df.format(kopo07_amount[i]), kopo07_df.format(kopo07_price[i] * kopo07_amount[i]));
			kopo07_taxFreeItems += (kopo07_price[i] * kopo07_amount[i]);
		}
		// �������� 5���� ���ö����� ----�� �߰��Ѵ�.
		if (kopo07_count % 5 == 0) {
			System.out.printf("-----------------------------------------\n");
		}
		// �ݺ��� �ѹ��������� count , i �� 1�� �����Ѵ�.
		kopo07_count++;
		i++;
		kopo07_bugase = (int) kopo07_TotalPrice / 11; // �ΰ��� ����� �Ѵ�.
		// �ΰ����ݾ׿� ������ �Ҽ����� �ø��� �ؾ��ϱ� ������ Math.ceil�Լ��� ����ߴ�.
		kopo07_taxNotFreeItems = kopo07_TotalPrice - (Math.ceil(kopo07_TotalPrice / 11));
	}

//	=======================================================================================
	// �ϴ� �߷�
	public static void TotalPrint() {
		SplitMethod kopo07_splitMethod = new SplitMethod();
		// ParkingTime()�޼��带 ȣ���� �ش� ���� parkingTime�� ��´�.
		String kopo07_parkingTime = kopo07_splitMethod.ParkingTime();
		// TimeStamp4()�޼��带 ȣ���� �ش� ���� time�� ��´�.
		String kopo07_time4 = kopo07_splitMethod.TimeStamp4();

		System.out.printf("\n");
		System.out.printf("%22.22s %13.13s\n", "�� ǰ�� ����", kopo07_df.format(kopo07_totalAmount));
		System.out.printf("%23.23s %13.13s\n", "(*)�� ��  ǰ ��", kopo07_df.format(kopo07_taxFreeItems));
		System.out.printf("%23.23s %13.13s\n", "�� ��  �� ǰ", kopo07_df.format(kopo07_taxNotFreeItems));
		System.out.printf("%24.24s %13.13s\n", "��   ��   ��",
				kopo07_df.format(kopo07_TotalPrice - kopo07_taxNotFreeItems));
		System.out.printf("%25.25s %13.13s\n", "��        ��", kopo07_df.format(kopo07_TotalPrice + kopo07_taxFreeItems));
		System.out.printf("%s %23.23s\n", "�� �� �� �� �� ��", kopo07_df.format(kopo07_TotalPrice + kopo07_taxFreeItems));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s %27.27s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%s    %11.11s %10.10s\n", "ī�����(IC)", "�Ͻú� /",
				kopo07_df.format(kopo07_TotalPrice + kopo07_taxFreeItems));

		System.out.printf("-----------------------------------------\n");
		System.out.printf("           [�ż�������Ʈ ����]\n");
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("%s %18.18s %7.7s\n", "��ȸ�߻�����Ʈ", "9350**9995", "164");
		System.out.printf("%s %17.17s %6.6s\n", "����(����)����Ʈ", "5,637(", "5,473)");
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   ���űݾױ��� ���������ð� �ڵ��ο�\n");
		System.out.printf("%s : %29.29s\n", "������ȣ", "27��****");
		System.out.printf("%s : %30.30s\n", "�����ð�", kopo07_parkingTime);
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s %24.24s\n", "ĳ��:084599 ��OO", "1150");
		System.out.printf("%14.14s%s\n", kopo07_time4, "/00119861/00164980/31");
	}
}
