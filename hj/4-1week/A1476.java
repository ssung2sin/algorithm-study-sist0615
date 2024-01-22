import java.util.Scanner;

public class A1476 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int earthInput = sc.nextInt();
		int sunInput = sc.nextInt();
		int moonInput = sc.nextInt();

		int earth = 1;
		int sun = 1;
		int moon = 1;

		int year = 1;

		while (earth != earthInput || sun != sunInput || moon != moonInput) {
			year++;
			earth++;
			sun++;
			moon++;
			if (earth > 15) {
				earth = 1;
			}
			if (sun > 28) {
				sun = 1;
			}
			if (moon > 19) {
				moon = 1;
			}
		}
		System.out.println(year);

	}
}
