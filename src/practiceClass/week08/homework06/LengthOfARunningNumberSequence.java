package practiceClass.week08.homework06;

//Exercise 1.3

public class LengthOfARunningNumberSequence {
	public static int getLengthOfSn(int n) {
		if (n == 1) {
			return 1;
		}
		return (n + "").length() + getLengthOfSn(n-1);
	}

	public static void main(String[] args) {
		int n = 12;
		System.out.printf("The length of S(%d) is %d", n, getLengthOfSn(n));
	}
}