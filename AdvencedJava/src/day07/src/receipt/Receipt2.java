package receipt;

public class Receipt2 {

	public static void main(String[] args) {

		String[] kopo07_OneRec = { "��,��,���س⵵,�һ���� ��ü ��,�һ���� ������ ��,���ձ��� ���� ��,�������� ���� ��,�ڷγ�19 �糭������ �����",

				"����Ư����,���ı�,2020��,94200,125610,11,10,23500",
				"����Ư����,���ı�,2020��,94200,125610,11,10,55550", 
				"����Ư����,���ı�,2021��,50000,300000,11,43,512500000",
				"����Ư����,���ı�,2022��,104200,35410,20,30,288000000" };

		String[] kopo07_field_name = kopo07_OneRec[0].split(","); // field_name�� , �������� ����鸸 ����.

		for (int kopo07_i = 1; kopo07_i < kopo07_OneRec.length; kopo07_i++) { // OneRec�迭�� ������ŭ �ݺ��� ����.

			String[] kopo07_field = kopo07_OneRec[kopo07_i].split(","); // OneRec[i]�� �ε��� �ι�°�� �ִ� ������ ,�������� ���´�.
																		// �ڿ� ������� ������ field�� ����.
			System.out.printf("***********************************\n");
			// field_name�� �ݺ��� ���񰹼���ŭ �ݺ��� �ϴ°Ŵ�.
			for (int kopo07_j = 0; kopo07_j < kopo07_field_name.length; kopo07_j++)
				System.out.printf(" %s : %s\n", kopo07_field_name[kopo07_j], kopo07_field[kopo07_j]); // ����� ������
		}
		System.out.printf("***********************************\n");

	}
}
