package net.davekirkwood.codewars.kyu6;

public class FindTheUniqueNumber {

	public static double findUniq(double arr[]) {
		
		double number1;
		double number2;
		
		number1 = arr[0];
		number2 = arr[1];
		for(int i=2; i<arr.length; i++) {
			if(number1 == number2) {
				if(arr[i] != number1) {
					return arr[i];
				}
			} else {
				if(arr[i] == number1) {
					return number2;
				} else {
					return number1;
				}
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		System.out.println(
			FindTheUniqueNumber.findUniq(new double[] { 1, 1, 1, 2, 1, 1 }) // => 2
		);
		System.out.println(
			FindTheUniqueNumber.findUniq(new double[] { 0, 0, 0.55, 0, 0 }) // => 0.55
		);
		System.out.println(
				FindTheUniqueNumber.findUniq(new double[] { 1, 1, 2 }) 
			);
		System.out.println(
				FindTheUniqueNumber.findUniq(new double[] { 2, 1, 1 })
			);
		System.out.println(
				FindTheUniqueNumber.findUniq(new double[] { 1, 2, 1 }) 
			);
		
	}
}
