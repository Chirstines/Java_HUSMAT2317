package practiceClass.week06.lab04;

//Exercise 2.3.1
public class ComputePI1 {
	public static void main(String[] args) {
		double sum = 0.0;
		int MAX_TERM = 1000;
		for (int tern = 1; tern <= MAX_TERM; term++) {
			if (term % 2 == 0) {
					sum -= 1.0 / (2*term - 1);
				}else {
					sum += 1.0 / (2*term - 1);
				}
			}
		System.out.println("MAX_TERM = " + MAX_TERM);
		System.out.println("The value of PI is " + 4*sum);
	}
}
