package receipt;

import java.text.DecimalFormat;

public class Receipt1 {

	public static void main(String[] args) {

		// 3�ڸ� ���ڵڿ� ,�� ���̱� ���ؼ� DecimalFormat��ü ������ �������� �����ش�.
		DecimalFormat kopo07_df = new DecimalFormat("###,###,###,###,###");

		String[] kopo07_items = { 
				"01   �ȳ��ϼ���         30,000  1     32,000", "02   (G)LH��������       6,920  1      7,000",
				"03   ��������E          59,820  1     59,820", "04   ���� ���Ϸ�       3,300  1      3,300",
				"05*  ����Ȩ SAFE �ڵ�    5,500  2     11,000", "06   ��� �Ŷ��120      3,380  1      3,380",
				"07*  (��)��������      6,610  1      6,610", "08   ���ѱ� �����       2,750  1      2,750",
				"09*  GAP ������ 4��   10,800  1     10,800", "10   �� ����� �ٳ�      4,980  1      4,980",
				"11   ����ũ ź�θ�       2,480  1      2,480", "12   (����)����߰�      7,920  1      7,920",
				"13   DZ�ִϾ�縻3��     4,980  1      4,980", "14   DZ�ִϾ�縻3       4,980  1      4,980",
				"15   �����̾�������      7,130  1      7,130", "16   ����ũ �����       3,980  1      3,980",
				"17*  ���� ���ִ¿�       4,480  1      4,480", "18   ���������÷�      4,980  1      4,980",
				"19   ��������(��)      3,210  1      3,210", "20   �ɶ�ý� ����      10,000  1     10,000",
				"21   Ǫ���� �̼�����     2,980  2      5,960", "22   ���Ϸν�������      1,990  1      1,990",
				"23   CJ ����Ĩ 20��    1,980  1      1,980", "24   ����ũ ���         3,980  1      3,980",
				"25   ����� ���� �а���  4,480  1      4,480", "26*  1+ ��޶� 10��      3,480  2      7,960",
				"27   ������ݺ�����ġ    7,980  1      7,980" };

//      =========================================================================================================================

		// ���߹迭 ���� / �迭�ȿ� ������ŭ ���� ����� ���� ���ڿ��� ���̷� ���Ѵ�. => ���ڿ��� ���̰� �� ���⶧���̴�.
		String[][] kopo07_matrix = new String[kopo07_items.length][kopo07_items[0].length()];

		// 2�߹迭�� ����ŭ �ݺ��� ����.
		for (int kopo07_i = 0; kopo07_i < kopo07_items.length; kopo07_i++) {
			// �� �ε����ȿ� �ϳ��� ���ڿ� sentence������ ��´�.
			String kopo07_sentence = kopo07_items[kopo07_i];
			// getStringArray()�޼��带 ����Ͽ� �ȿ� ���ڿ��� �ϳ��� ������ؼ���.
			String[] kopo07_row = getStringArray(kopo07_sentence);
			// �̷��� �� �迭�� �ִ� �����۵��� ������ �迭�� ���� �ȴ�.
			kopo07_matrix[kopo07_i] = kopo07_row;
		}

		// �迭�� ������ŭ �ݺ��� ����.
		for (String kopo07_sentence : kopo07_items) {
			// �迭���� ���� " " ���� �������� ���´�. => �̶� " "�̰Ŵ� �ᱹ 2���� �迭�� ��� �ִ°ǵ�
			// split(" +") �̷��� ����ȿ� +�� �߰����ָ� �����迭�� split�ؼ� ���Եȴ�.
			// => �̷��� 0��°�� ��ȣ, 1��°�� �̸�, 2��°�� ����, 3��°�� ����, 4��°�� ���ձݾ��� �����̴�.
			String[] kopo07_splitArray = kopo07_sentence.split("  +");
			// ����ϱ� ���� ������ �����鿡 ������ ����ش�.
			String kopo07_nums = kopo07_splitArray[0];
			String kopo07_names = kopo07_splitArray[1];
			
			// ���������� ���� �� ������ �ʿ��ϱ� ������ ","�� �����ְ� ��Ƽ���� ����ȯ�� ��Ų��.
			
			int kopo07_price = Integer.parseInt(kopo07_splitArray[2].replace(",", ""));
			int kopo07_quantity = Integer.parseInt(kopo07_splitArray[3]);
			int kopo07_total = Integer.parseInt(kopo07_splitArray[4].replace(",", ""));

			// ����� ������ ���ݰ� ������ �������� ������ ���ձݾ��� Ʋ�������̴ϱ� �̷��� ���ǹ��� �����.
			if (kopo07_price * kopo07_quantity != kopo07_total) {

				System.out.println("************************************************************");
				System.out.printf("����[%-5.5s %-12.12s\t\t%6.6s   %s   %6.6s]\n", kopo07_nums, kopo07_names,
						kopo07_df.format(kopo07_price), kopo07_quantity, kopo07_df.format(kopo07_total));
				System.out.printf("����[%-5.5s %-12.12s\t\t%6.6s   %s   %6.6s]\n", kopo07_nums, kopo07_names,
						kopo07_df.format(kopo07_price), kopo07_quantity,
						kopo07_df.format(kopo07_price * kopo07_quantity));
				System.out.println("************************************************************");

			}
		}
	}

	static String[] getStringArray(String kopo07_sentence) {
		// �ŰԺ����� ����� ������ŭ �ݺ��� ����.
		String[] kopo07_row = new String[kopo07_sentence.length()];
		// �̷��� �Ǹ� ������ ���ڿ��� �迭�� �������� �����ϰԵȴ�.
		for (int kopo07_i = 0; kopo07_i < kopo07_row.length; kopo07_i++) {
			kopo07_row[kopo07_i] = kopo07_sentence.substring(kopo07_i, kopo07_i + 1);
		}
		return kopo07_row;
	}

}