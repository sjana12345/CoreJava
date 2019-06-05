
import java.util.Scanner;
public class LeapYearDetector {

		public static void main(String[] args) {
			System.out.println("Please enter a year..");
			Scanner scanner1 = new Scanner(System.in);
			int year = scanner1.nextInt();
			System.out.println(year);
			
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						System.out.println(year + " is a Leap Year");
					}else {
						System.out.println(year + " is not a leap year.");
					}
				}else {
					System.out.println(year + " is a Leap Year");
				}
			}else {
				System.out.println(year + " is not a leap year.");
			}

		}

	}


