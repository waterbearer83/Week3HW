import java.util.Arrays;

public class Week3HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Homework Coding assignment week 3
		//Question 1, 1a
		int[] ages = {3,9,23,64,2,8,28,93};
		int firstAge = ages[0];
		int lastAge = ages[ages.length-1];
	//		System.out.println("Difference of ages: " + (lastAge - firstAge));
			
		//Question 1b
		int[] ages2 = {3,9,23,64,2,8,28,93,57};
		int fAge = ages2[0];
		int lAge = ages2[ages2.length-1];
	//		System.out.println("Differences with add: " + (lAge - fAge));
		
		//Question 1c using array from 1b
		int[] ages3 = {3,9,23,64,2,8,28,93,57};
		int sum = 0;
		for (int age = 0; age < ages3.length; age++) {
			sum = sum + ages3[age];
		}
//			System.out.println("The avrg age is: " + (double)sum / ages3.length);

		//Question 2
		String[] names = new String[6];
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";
			names[4] = "Buck";
			names[5] = "Bob";
		//Question 2a
		double total = 0.0;
		for (int i = 0; i < names.length; i++) {
			total += names[i].length();
		}
//			System.out.println("The avrg of letters per name is: " + total / names.length);
		
		//Question 2b
		String out = "";
		for (String name : names) {
			out = out + name + " "; 
		}
	//	System.out.println(out.substring(0,out.length() - 1));
		for (int i = 0; i < names.length; i++ ) {
	    	out = out + names[i];
	    if (i < names.length - 1) {
	    	out = out + " ";
		}
		}
		// Question 3 Answer:
		//By declaring: name = array[array.length-1]
		//Question 4 Answer:
		//By declaring: name = array[0], the 0 indicates the first element in the array
		
		//Question 5
		int[] nameLengths = new int[names.length];
		for (int c = 0; c < names.length; c++) {
			nameLengths[c] = names[c].length();
		}
	//	System.out.println(Arrays.toString(nameLengths));
		//Question 6
		int totals = 0;
		for (int l = 0; l < nameLengths.length; l++) {
			totals += nameLengths[l];  
	//	} System.out.println("Sum of elements: " + totals);
		}	
		boolean gotSmart = true;
		int amntOfSleep = 4;
		System.out.println("Am I finally done with homework? " + toFinishHomework(gotSmart, amntOfSleep));
	}
	
		
		//Question 7
	public static String words(String x, int y) {
		String space = "";
		for (int i = 0; i < y; i++) {
			space += x;
		}return space;
	}	
		//Question 8
	public static String fullName(String a, String b) {
		return a + " " + b;

 } 
		//Question 9
	public static boolean over100(int[] array) {
		int balance = 0;
		for (int num : array) {
			balance += num; 
		}
		int end = balance + array[array.length - 1]; {
		if (end > 100) return true;
		}return (false);
	}
		//Question 10
	public static double calcAvrg(double[] elements) {
		double sum = 0;
		for (double element : elements) {
			sum += element;
		}return sum / elements.length;
	}
		//Question 11
	public static boolean avrg2(double[] first, double[] second) {
		if(calcAvrg(first) > calcAvrg(second)) return true;
			return false;
}
		//Question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) return true;
		return false;
	}
		//Question 13
	public static boolean toFinishHomework(boolean beSmart, int needSleep) {
		if (beSmart == true && needSleep < 8) return true;
		return false;
	}
	/*
		This method will tell you if I finally get to be done with homework
		I created it because I am tired and proud of all I learned
		see below for code used to test that this is indeed a true statement:
		boolean gotSmart = true;
		int amntOfSleep = 4;
		System.out.println("Am I finally done with homework? " + toFinishHomework(gotSmart, amntOfSleep));
		output: Am I finally done with homework? true
	*/
}

		
