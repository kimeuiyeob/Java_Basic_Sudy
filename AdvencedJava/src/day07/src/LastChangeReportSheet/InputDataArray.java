package LastChangeReportSheet;

public class InputDataArray {

	String kopo07_name;
	int kopo07_num;

	// 각각 점수들의 값들을 누적하기 위해 생성하였다.
	int kopo07_korea;
	int kopo07_english;
	int kopo07_math;
	int kopo07_totalSum;
	float kopo07_totalavg;

	// 현재페이지에 합계와 평균을 출력하기 위해서 변수들을 한번더 생성하였다.
	static int kopo07_koreaNow;
	static int kopo07_englishNow;
	static int kopo07_mathNow;
	static int kopo07_totalSumNow;
	static float kopo07_totalavgNow;

	// 누적페이지에 현재페이지를 장당씩 더해서 출력하기 위해 한번더 생성하였다.
	static int kopo07_koreaNowMore;
	static int kopo07_englishNowMore;
	static int kopo07_mathNowMore;
	static int kopo07_totalSumNowMore;
	static float kopo07_totalavgNowMore;

//	=======================================================================

	// 기본생성자를 생성해 파라미터로 번호,이름,국어,영어,수학점수를 받는다.
	public InputDataArray(int kopo07_num, String kopo07_name, int kopo07_korea, int kopo07_english, int kopo07_math) {
		super();
		this.kopo07_num = kopo07_num;
		this.kopo07_name = kopo07_name;
		this.kopo07_korea = kopo07_korea;
		this.kopo07_english = kopo07_english;
		this.kopo07_math = kopo07_math;
	}

	// 기본 생성자 생성
	public InputDataArray() {
	}

	// 번호를 가져올 함수
	public int num() {
		return this.kopo07_num;
	}

	// 이름을 가져올 함수
	public String name() {
		return this.kopo07_name;
	}

	// 국어점수를 가져올 함수
	public int korea() {
		return this.kopo07_korea;
	}

	// 영어를 가져올 함수
	public int english() {
		return this.kopo07_english;
	}

	// 수학점수를 가져올 함수
	public int math() {
		return this.kopo07_math;
	}

	// 함계를 가져올 함수
	public int sum() {
		return kopo07_korea + kopo07_english + kopo07_math;
	}

	// 평균을 가져올 함수
	public double avg() {
		return sum() / 3.0;
	}

}
