package MethodTest;

public class MethodTest {

	// �޼ҵ�� �ҷ����~~��°� ����ϴ� �޼��� iamMethod�� �����Ѵ�.
	public static void iamMethod() {
		System.out.printf("�޼ҵ�� �ҷ����~~\n");

	}

	// ���� �޼��忡�� iamMethod�޼��带 ȣ���Ѵ�.
	public static void main(String[] args) {
		// ���� Ŭ������ ������ �ȿ� �ִ� iamMethod�޼��带 ȣ���Ѵ�.
		MethodTest.iamMethod();
		// static���� �����߱⶧���� �ٷ� ȣ���Ѵ�.
		iamMethod();
	}
}
