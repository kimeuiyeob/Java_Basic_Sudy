package ReportSheet;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet2 {

	public static void main(String[] args) {

		// Calendar ��ü�� ������ kopo07_cal������ ����ش�.
		Calendar kopo07_cal = Calendar.getInstance();
		// SimpleDateFormat��ü�� ������ ���� ���ϴ� ��¥ ������ kopo07_dt�� ����ش�.
		SimpleDateFormat kopo07_dt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		// ����� 30���� ����� ������ ����ش�.
		int kopo07_iPerson = 30;
		// InputData2�� �������� �⺻������ �Ķ���Ϳ� 30�� ������. -> �̶� ������ �迭���� ũ�Ⱑ ��������.
		InputData2 kopo07_inData2 = new InputData2(kopo07_iPerson);
		// �������ŭ �ݺ��� ������.
		for (int kopo07_i = 0; kopo07_i < kopo07_iPerson; kopo07_i++) {
			// ���ڿ� ������ ����� �̸��ڼ��ڸ� 1�������ؼ� ��´�.
			String kopo07_name = String.format("ȫ��%02d", kopo07_i);
			// Math.random()�Լ��� ����� 1~100������ �������� ������ ������ ����ش�.
			int kopo07_kor = (int) (Math.random() * 100);
			int kopo07_eng = (int) (Math.random() * 100);
			int kopo07_math = (int) (Math.random() * 100);
			// ��� ������ SetData()�Լ� �Ķ���ͷ� �����Ѵ�. -> �̷��� ���� �̸��� ������ ���� ������ �迭�� ���°��̴�.
			kopo07_inData2.SetData(kopo07_i, kopo07_name, kopo07_kor, kopo07_eng, kopo07_math);

		}

		System.out.printf("                  ��������ǥ\n");
		// format()�Լ��� ����� �׾ȿ� ���� ���� ��¥�� ��� ���� ���ϴ� ������ ��¥�� ����Ѵ�.
		System.out.printf("                            ������� : %s\n", kopo07_dt.format(kopo07_cal.getTime()));
		System.out.printf("=======================================================================\n");
		System.out.printf("��ȣ    �̸�          ����      ����      ����      ����      ���\n");
		System.out.printf("=======================================================================\n");
		// �������ŭ ����� �Ѵ�.
		for (int kopo07_i = 0; kopo07_i < kopo07_iPerson; kopo07_i++) {
			// ������ �迭�鿡 ����ִ� ������ ������� ����Ѵ�.
			System.out.printf("%03d  %5.5s         %4.4s      %4.4s      %4.4s      %4.4s    %6.2f\n", kopo07_i,
					kopo07_inData2.kopo07_nameArr[kopo07_i], kopo07_inData2.kopo07_korArr[kopo07_i],
					kopo07_inData2.kopo07_engArr[kopo07_i], kopo07_inData2.kopo07_mathArr[kopo07_i],
					kopo07_inData2.kopo07_sumArr[kopo07_i], kopo07_inData2.kopo07_avgArr[kopo07_i]);
		}

		System.out.printf("=======================================================================\n");
		// �������ѳ��� �հ� �������� ����Ѵ�.
		System.out.printf("�հ�            %10d%10d%10d%10d  %6.2f\n", kopo07_inData2.kopo07_korea,
				kopo07_inData2.kopo07_english, kopo07_inData2.kopo07_math, kopo07_inData2.kopo07_totalSum,
				kopo07_inData2.kopo07_totalavg);
		// �������ѳ��� ��� �������� ����Ѵ�.
		System.out.printf("���              %8.8s  %8.8s  %8.8s  %8.8s   %6.2f",
				(kopo07_inData2.kopo07_korea / kopo07_iPerson), (kopo07_inData2.kopo07_english / kopo07_iPerson),
				(kopo07_inData2.kopo07_math / kopo07_iPerson), (kopo07_inData2.kopo07_totalSum / kopo07_iPerson),
				(kopo07_inData2.kopo07_totalavg / kopo07_iPerson));

	}
}
