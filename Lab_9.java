import java.util.Scanner;
public class Lab_9 {
	public static void main(String[] args) {
		
		Scanner jarvis = new Scanner(System.in);
		
		// Initialize array of integers
		
		int[] ass = new int[6];
		int attend, mTerm, sumAss = 0, avgAttend;
		double avgAss, avgMTerm;
		
		// for loop to get user input & store in array
		
		for(int i = 1; i <= ass.length-1; i++) {
			System.out.println("Input the grade for assignment " + i);
			ass[i] = jarvis.nextInt();
		}
		
		System.out.println("Input the number of attendances: ");
		attend = jarvis.nextInt();
		
		System.out.println("Input the midterm grade: ");
		mTerm= jarvis.nextInt();

		// for loop to iterate over the array & perform calculations
		for(int i = 1; i <= ass.length-1; i++) {
			sumAss += ass[i];
		}
		avgAss = (sumAss*0.3)/(5);
		
		avgAttend = (attend*5)/7;
		
		avgMTerm = mTerm * 0.3;

		// display output to user
		
		System.out.println("Assignments (30%): " + (int)avgAss + "\n" + 
							"Attendance (5%): " + (int)avgAttend + "\n" + 
							"Midterm (30%): " + (int)avgMTerm);
		
		}
}
