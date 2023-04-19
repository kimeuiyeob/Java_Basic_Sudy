package LastChangeReportSheet;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class ReportSheetArray {

	// <InputDataArray>Ÿ���� list�����Ѵ�.
	static ArrayList<InputDataArray> kopo07_list = new ArrayList<InputDataArray>();

	// �������� ����� ������ �����ϰ� 1�� �ʱ�ȭ�Ѵ�.
	static int kopo07_countTitle = 1;

	public static void main(String[] args) {
		// ��������� 200�� ��´�.
		int kopo07_iPerson = 200;
		// ������ �������� 30�� ����ؾ��ϹǷ� ���ǹ��� �ʿ��ؼ� 30���� �ʱ�ȭ�� ������ �����Ѵ�.
		int kopo07_perPage = 30;
		// �Ʒ��� ������ ��¶� ���� ����� ����ϱ� ���ؼ� ������ ������ ��´�.
		int kopo07_finalPersonMinus = kopo07_iPerson % kopo07_perPage;

		// �������ŭ �ݺ��� �Ѵ�.
		for (int kopo07_i = 0; kopo07_i <= kopo07_iPerson; kopo07_i++) {
			// �����̸��� ������ ���������� ������ ��´�.
			String kopo07_ranDomName = String.format("ȫ��%02d", kopo07_i);
			int kopo07_koreaRandomScore = (int) (Math.random() * 100);
			int kopo07_englishRandomScore = (int) (Math.random() * 100);
			int kopo07_mathRandomScore = (int) (Math.random() * 100);
			// ������ ��� ������ ��ü�� ����Ʈ�� �߰��Ѵ�.
			kopo07_list.add(new InputDataArray(kopo07_i, kopo07_ranDomName, kopo07_koreaRandomScore,
					kopo07_englishRandomScore, kopo07_mathRandomScore));
		}

		// ����� �޼��忡 ��Ƴ��� ����Ѵ�.
		titleHeader();
		int kopo07_count = 0; // ī��Ʈ�� ���� ���� ����
		int kopo07_e = 1; // ī��Ʈ�� ���� ���� ����
		compareWith();

		// ����� ��ŭ �ݺ��Ѵ�.
		for (int kopo07_i = 1; kopo07_i <= kopo07_iPerson; kopo07_i++) {
			// get()�� ���� ����Ʈ�ȿ� �ִ� ������ ������� ������ ���� OneByOne������ ��´�.
			InputDataArray kopo07_OneByOne = kopo07_list.get(kopo07_i);

			// �̸�,��������,��������,��������,��Ż����,��������� ������� ����Ѵ�.
			System.out.printf("%03d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s     %6.2f\n",
					kopo07_OneByOne.num(), kopo07_OneByOne.name(), kopo07_OneByOne.korea(), kopo07_OneByOne.english(),
					kopo07_OneByOne.math(), kopo07_OneByOne.sum(), kopo07_OneByOne.avg());

			kopo07_count++; // ������ 1�� �ø���.

			// �Ʒ� ������ ������������ ���������� ������ ���� ������ ������ ��Ƽ� �����־���.
			InputDataArray.kopo07_koreaNow += kopo07_OneByOne.korea();
			InputDataArray.kopo07_englishNow += kopo07_OneByOne.english();
			InputDataArray.kopo07_mathNow += kopo07_OneByOne.math();

			InputDataArray.kopo07_totalSumNow += kopo07_OneByOne.sum();
			InputDataArray.kopo07_totalavgNow += kopo07_OneByOne.avg();

			// ���� ī��Ʈ�� 30�̸� ���ο� ���� ������ �ؼ� ���ǹ��� �־���.
			if (kopo07_count % kopo07_perPage == 0) {

				System.out.printf("==================================================================\n");
				// ���� ������ ����� �Ѵ�.
				System.out.printf("����������\n");
				System.out.printf("�հ�            %10d%10d%10d%10d   %6.2f\n", InputDataArray.kopo07_koreaNow,
						InputDataArray.kopo07_englishNow, InputDataArray.kopo07_mathNow,
						InputDataArray.kopo07_totalSumNow, InputDataArray.kopo07_totalavgNow);

				// ��� ������ ����� �Ѵ�. /����������� ����� 30���־ 30���� �����ذ��̴�.
				System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
						(InputDataArray.kopo07_koreaNow / kopo07_perPage),
						(InputDataArray.kopo07_englishNow / kopo07_perPage),
						(InputDataArray.kopo07_mathNow / kopo07_perPage),
						(InputDataArray.kopo07_totalSumNow / kopo07_perPage),
						(InputDataArray.kopo07_totalavgNow / kopo07_perPage));

				// �Ʒ� ������ ������������ ���������� ������ ���� ������ ������ ��Ƽ� �����־���.
				InputDataArray.kopo07_koreaNowMore += InputDataArray.kopo07_koreaNow;
				InputDataArray.kopo07_englishNowMore += InputDataArray.kopo07_englishNow;
				InputDataArray.kopo07_mathNowMore += InputDataArray.kopo07_mathNow;
				InputDataArray.kopo07_totalSumNowMore += InputDataArray.kopo07_totalSumNow;
				InputDataArray.kopo07_totalavgNowMore += InputDataArray.kopo07_totalavgNow;

				// ������������ �ٽ� �ʱ�ȭ�ؼ� �����ؾߵǹǷ� ���⼭ �ʱ�ȭ�� �����־���.
				InputDataArray.kopo07_koreaNow = 0;
				InputDataArray.kopo07_englishNow = 0;
				InputDataArray.kopo07_mathNow = 0;
				InputDataArray.kopo07_totalSumNow = 0;
				InputDataArray.kopo07_totalavgNow = 0;

				System.out.printf("==================================================================\n");
				// ���� ������ ������ ���� ���� ���������� ����Ѵ�.
				System.out.printf("����������\n");
				System.out.printf("�հ�            %10d%10d%10d%10d   %6.2f\n", InputDataArray.kopo07_koreaNowMore,
						InputDataArray.kopo07_englishNowMore, InputDataArray.kopo07_mathNowMore,
						InputDataArray.kopo07_totalSumNowMore, InputDataArray.kopo07_totalavgNowMore);

				// �Ʒ� ��հ��� ����� 30���� ī��Ʈ�� ���ؼ� 2���� 60���� ������ 3���� 90���� �����ְ��ؼ� ���� ���ߴ�.
				System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
						(InputDataArray.kopo07_koreaNowMore / (kopo07_perPage * kopo07_e)),
						(InputDataArray.kopo07_englishNowMore / (kopo07_perPage * kopo07_e)),
						(InputDataArray.kopo07_mathNowMore / (kopo07_perPage * kopo07_e)),
						(InputDataArray.kopo07_totalSumNowMore / (kopo07_perPage * kopo07_e)),
						(InputDataArray.kopo07_totalavgNowMore / (kopo07_perPage * kopo07_e)));

				kopo07_e++; // ������ 2���� 60, 3���� 90�̷��� ��������ؼ� ���ϳ� ī������ ���ذ��̴�.
				System.out.printf("\n\n"); // 2�� �ٹٲ��Ѵ�.
				titleHeader(); // ����� ����Ѵ�.

			}
		}

		System.out.printf("==================================================================\n");
		// ���� �����ϰ� �ʱ�ȭ�� �������� ������ ���� ������������ ����Ѵ�.
		System.out.printf("����������\n");
		System.out.printf("�հ�            %10d%10d%10d%10d    %6.2f\n", InputDataArray.kopo07_koreaNow,
				InputDataArray.kopo07_englishNow, InputDataArray.kopo07_mathNow, InputDataArray.kopo07_totalSumNow,
				InputDataArray.kopo07_totalavgNow);

		// �������� ����� ���� ������� ���ؾ��ϹǷ� ������ �������� ��� % 30 ����������� ������ �忡 ���� ���̱⶧���� �װɷ� �����ذ��̴�.
		System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
				(InputDataArray.kopo07_koreaNow / kopo07_finalPersonMinus),
				(InputDataArray.kopo07_englishNow / kopo07_finalPersonMinus),
				(InputDataArray.kopo07_mathNow / kopo07_finalPersonMinus),
				(InputDataArray.kopo07_totalSumNow / kopo07_finalPersonMinus),
				(InputDataArray.kopo07_totalavgNow / kopo07_finalPersonMinus));

		System.out.printf("==================================================================\n");

		System.out.printf("����������\n");
		System.out.printf("�հ�            %10d%10d%10d%10d   %6.2f\n",
				InputDataArray.kopo07_koreaNowMore + InputDataArray.kopo07_koreaNow,
				InputDataArray.kopo07_englishNowMore + InputDataArray.kopo07_englishNow,
				InputDataArray.kopo07_mathNowMore + InputDataArray.kopo07_mathNow,
				InputDataArray.kopo07_totalSumNowMore + InputDataArray.kopo07_totalSumNow,
				InputDataArray.kopo07_totalavgNowMore + InputDataArray.kopo07_totalavgNow);

		// �Ʒ� ��հ��� ����� 30���� ī��Ʈ�� ���ؼ� 2���� 60���� ������ 3���� 90���� �����ְ��ؼ� ���� ���ߴ�.
		System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s    %6.2f\n",
				(InputDataArray.kopo07_koreaNowMore / kopo07_iPerson),
				(InputDataArray.kopo07_englishNowMore / kopo07_iPerson),
				(InputDataArray.kopo07_mathNowMore / kopo07_iPerson),
				(InputDataArray.kopo07_totalSumNowMore / kopo07_iPerson),
				(InputDataArray.kopo07_totalavgNowMore / kopo07_iPerson));

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

//	===================================================================================================================
	// �հ� �������� ������ ���� ���������� ����ϱ� ���� �޼����Դ�.
	public static void compareWith() {
		// ��ü���� ������ �񱳸� �ؾ��ϴ� ��Ȳ�̹Ƿ� Comparator��ü�� ������ �������̵����ش�.
		Comparator<InputDataArray> kopo07_MyCompare = new Comparator<InputDataArray>() {

			// compare�޼��带 �����Ѵ�.
			@Override
			public int compare(InputDataArray kopo07_o1, InputDataArray kopo07_o2) {
				return kopo07_o1.sum() - kopo07_o2.sum(); // �հ踦 �������� ���ؼ� �����Ѵ�.
			}
		};
		// �հ� �������� ���ϴ°� Collections ����Ͽ� ���Ľ�Ų��.
		Collections.sort(kopo07_list, kopo07_MyCompare);
		// �հ谡 �������̹Ƿ� �ݴ�� �����´�.
		Collections.reverse(kopo07_list);
	}

}
