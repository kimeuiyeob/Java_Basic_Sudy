package ReportSheet;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet3 {

	static int kopo07_countTitle = 1; // ������ ó���� ���� �������� ���� �� 1�� �ʱ�ȭ

	public static void main(String[] args) {

		int kopo07_iPerson = 200; // ���� ���� ������ ��¹��� ����� �ʱ�ȭ
		int kopo07_perPage = 30; // ����� 30������ ����� ���� ����
		int kopo07_finalPersonMinus = kopo07_iPerson % kopo07_perPage; // ������ ���� �ο� ����� ���� ���� ����

		InputData3 kopo07_inData3 = new InputData3(kopo07_iPerson); // ��ü ������ 200�� ������.

		// �������ŭ �ݺ��Ѵ�.
		for (int kopo07_i = 1; kopo07_i <= kopo07_iPerson; kopo07_i++) {
			// �������ŭ �̸�,��������,��������,�������� �� �����Լ������� ������ ��´�.
			String kopo07_name = String.format("ȫ��%02d", kopo07_i);
			int kopo07_kor = (int) (Math.random() * 100);
			int kopo07_eng = (int) (Math.random() * 100);
			int kopo07_math = (int) (Math.random() * 100);
			// setData�޼��带 ���� ������ ������.
			kopo07_inData3.SetData(kopo07_i, kopo07_name, kopo07_kor, kopo07_eng, kopo07_math);

		}

		// ����� �޼��忡 ��Ƴ��� ����Ѵ�.
		titleHeader();
		int kopo07_count = 0; // ī��Ʈ�� ���� ���� ����
		int kopo07_e = 1; // ī��Ʈ�� ���� ���� ����

		for (int kopo07_i = 1; kopo07_i <= kopo07_iPerson; kopo07_i++) {
			// �̸�,��������,��������,��������,��Ż����,��������� ������� ����Ѵ�.
			System.out.printf("%03d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s     %6.2f\n", kopo07_i,
					kopo07_inData3.kopo07_nameArr[kopo07_i], kopo07_inData3.kopo07_korArr[kopo07_i],
					kopo07_inData3.kopo07_engArr[kopo07_i], kopo07_inData3.kopo07_mathArr[kopo07_i],
					kopo07_inData3.kopo07_sumArr[kopo07_i], kopo07_inData3.kopo07_avgArr[kopo07_i]);

			kopo07_count++; // ������ 1�� �ø���.

			// �Ʒ� ������ ������������ ���������� ������ ���� ������ ������ ��Ƽ� �����־���.
			kopo07_inData3.kopo07_koreaNow += kopo07_inData3.kopo07_korArr[kopo07_i];
			kopo07_inData3.kopo07_englishNow += kopo07_inData3.kopo07_engArr[kopo07_i];
			kopo07_inData3.kopo07_mathNow += kopo07_inData3.kopo07_mathArr[kopo07_i];

			kopo07_inData3.kopo07_totalSumNow += kopo07_inData3.kopo07_sumArr[kopo07_i];
			kopo07_inData3.kopo07_totalavgNow += kopo07_inData3.kopo07_avgArr[kopo07_i];

			// ���� ī��Ʈ�� 30�̸� ���ο� ���� ������ �ؼ� ���ǹ��� �־���.
			if (kopo07_count % kopo07_perPage == 0) {

				System.out.printf("==================================================================\n");
				// ���� ������ ����� �Ѵ�.
				System.out.printf("����������\n");
				System.out.printf("�հ�            %10d%10d%10d%10d   %6.2f\n", kopo07_inData3.kopo07_koreaNow,
						kopo07_inData3.kopo07_englishNow, kopo07_inData3.kopo07_mathNow,
						kopo07_inData3.kopo07_totalSumNow, kopo07_inData3.kopo07_totalavgNow);

				// ��� ������ ����� �Ѵ�. /����������� ����� 30���־ 30���� �����ذ��̴�.
				System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
						(kopo07_inData3.kopo07_koreaNow / kopo07_perPage),
						(kopo07_inData3.kopo07_englishNow / kopo07_perPage),
						(kopo07_inData3.kopo07_mathNow / kopo07_perPage),
						(kopo07_inData3.kopo07_totalSumNow / kopo07_perPage),
						(kopo07_inData3.kopo07_totalavgNow / kopo07_perPage));

				// �Ʒ� ������ ������������ ���������� ������ ���� ������ ������ ��Ƽ� �����־���.
				kopo07_inData3.kopo07_koreaNowMore += kopo07_inData3.kopo07_koreaNow;
				kopo07_inData3.kopo07_englishNowMore += kopo07_inData3.kopo07_englishNow;
				kopo07_inData3.kopo07_mathNowMore += kopo07_inData3.kopo07_mathNow;
				kopo07_inData3.kopo07_totalSumNowMore += kopo07_inData3.kopo07_totalSumNow;
				kopo07_inData3.kopo07_totalavgNowMore += kopo07_inData3.kopo07_totalavgNow;

				// ������������ �ٽ� �ʱ�ȭ�ؼ� �����ؾߵǹǷ� ���⼭ �ʱ�ȭ�� �����־���.
				kopo07_inData3.kopo07_koreaNow = 0;
				kopo07_inData3.kopo07_englishNow = 0;
				kopo07_inData3.kopo07_mathNow = 0;
				kopo07_inData3.kopo07_totalSumNow = 0;
				kopo07_inData3.kopo07_totalavgNow = 0;

				System.out.printf("==================================================================\n");
				// ���� ������ ������ ���� ���� ���������� ����Ѵ�.
				System.out.printf("����������\n");
				System.out.printf("�հ�            %10d%10d%10d%10d   %6.2f\n", kopo07_inData3.kopo07_koreaNowMore,
						kopo07_inData3.kopo07_englishNowMore, kopo07_inData3.kopo07_mathNowMore,
						kopo07_inData3.kopo07_totalSumNowMore, kopo07_inData3.kopo07_totalavgNowMore);

				// �Ʒ� ��հ��� ����� 30���� ī��Ʈ�� ���ؼ� 2���� 60���� ������ 3���� 90���� �����ְ��ؼ� ���� ���ߴ�.
				System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
						(kopo07_inData3.kopo07_koreaNowMore / (kopo07_perPage * kopo07_e)),
						(kopo07_inData3.kopo07_englishNowMore / (kopo07_perPage * kopo07_e)),
						(kopo07_inData3.kopo07_mathNowMore / (kopo07_perPage * kopo07_e)),
						(kopo07_inData3.kopo07_totalSumNowMore / (kopo07_perPage * kopo07_e)),
						(kopo07_inData3.kopo07_totalavgNowMore / (kopo07_perPage * kopo07_e)));

				kopo07_e++; // ������ 2���� 60, 3���� 90�̷��� ��������ؼ� ���ϳ� ī������ ���ذ��̴�.
				System.out.printf("\n\n"); // 2�� �ٹٲ��Ѵ�.
				titleHeader(); // ����� ����Ѵ�.

			}
		}

		System.out.printf("==================================================================\n");
		// ���� �����ϰ� �ʱ�ȭ�� �������� ������ ���� ������������ ����Ѵ�.
		System.out.printf("����������\n");
		System.out.printf("�հ�            %10d%10d%10d%10d    %6.2f\n", kopo07_inData3.kopo07_koreaNow,
				kopo07_inData3.kopo07_englishNow, kopo07_inData3.kopo07_mathNow, kopo07_inData3.kopo07_totalSumNow,
				kopo07_inData3.kopo07_totalavgNow);

		// �������� ����� ���� ������� ���ؾ��ϹǷ� ������ �������� ��� % 30 ����������� ������ �忡 ���� ���̱⶧���� �װɷ� �����ذ��̴�.
		System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
				(kopo07_inData3.kopo07_koreaNow / kopo07_finalPersonMinus),
				(kopo07_inData3.kopo07_englishNow / kopo07_finalPersonMinus),
				(kopo07_inData3.kopo07_mathNow / kopo07_finalPersonMinus),
				(kopo07_inData3.kopo07_totalSumNow / kopo07_finalPersonMinus),
				(kopo07_inData3.kopo07_totalavgNow / kopo07_finalPersonMinus));

		System.out.printf("==================================================================\n");

		// ������������ ���� �� ������ �������� ����ϰ��̴�.
		System.out.printf("����������\n");
		System.out.printf("�հ�            %10d%10d%10d%10d   %6.2f\n", kopo07_inData3.kopo07_korea,
				kopo07_inData3.kopo07_english, kopo07_inData3.kopo07_math, kopo07_inData3.kopo07_totalSum,
				kopo07_inData3.kopo07_totalavg);

		System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
				(kopo07_inData3.kopo07_korea / kopo07_iPerson), (kopo07_inData3.kopo07_english / kopo07_iPerson),
				(kopo07_inData3.kopo07_math / kopo07_iPerson), (kopo07_inData3.kopo07_totalSum / kopo07_iPerson),
				(kopo07_inData3.kopo07_totalavg / kopo07_iPerson));

	}

//	===================================================================================================================

	// ����� �����ϰ� ����ϱ� ���� �޼��忡 ���� ��Ƽ� ����ߴ�.
	public static void titleHeader() {

		// Ÿ��Ʋ �ȿ� ��¥ ǥ�ð� �־ Calendar ��ü�� ȣ���ؼ� ���˽��Ѽ� ��¿���.
		Calendar kopo07_cal = Calendar.getInstance();
		SimpleDateFormat kopo07_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		System.out.printf("                           ��������ǥ\n");
		System.out.printf("PAGE : %d                              ������� : %s\n", kopo07_countTitle,
				kopo07_dt.format(kopo07_cal.getTime()));
		System.out.printf("==================================================================\n");
		System.out.printf("��ȣ    �̸�          ����      ����      ����      ����      ���\n");
		System.out.printf("==================================================================\n");
		kopo07_countTitle++; // ����� �������� ������Ű���� 1�������� �÷��־���.

	}
}
