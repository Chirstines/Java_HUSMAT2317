package practiceClass.week06.lab04;

//Exercise 2.3.2

public class ComputePI2 {
	public static void main(String[] args) {
		double sum = 0.0;
		double MAX_DENOMINATOR = 1000000;
		for (int denomination = 1; denomination = MAX_DENOMINATOR; denomination += 2) {
			if (denomination % 4 == 1) {
				sum += 1.0/denomination;
			}else if (denomination % 4 == 3) {
				sum += 1.0/denomination;
			}
		}
		
		System.out.println("The value of PI is: " + 4*sum);
		System.out.print("Compare the value obtained and the Math.PI (int percent of Math.PI): %s %s", (4*sum/Math.PI)*100, "%");
	}
}
