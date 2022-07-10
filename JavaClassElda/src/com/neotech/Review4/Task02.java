
package com.neotech.Review4;

public class Task02 {

	public static void main(String[] args) {
		// Create a method that will get an array of integers,
		// and return the sum
		// Make the method protected
		// Task3
		// Create method that will get an array of integers,
		// and return the average as a double
		// Make the method private
	
			int[] array = { 5, 2, 9, 6, 1, 8 };
	​
			System.out.println("The values indide the array are:");
			for (int el : array) {
				System.out.print(el + " ");
			}
			System.out.println();
	​
			ArrayParameter ap = new ArrayParameter();
	​
			int result = ap.largestNumber(array);
			System.out.println("The largest number int the array is -> " + result);
	​
			result = ap.arraySum(array);
			System.out.println("The sum of the array is -> " + result);
	​
			double d = ap.arrayAvg(array);
			System.out.println("The average of the array is -> " + d);
	​
		}
	​
		// Task3
		// Create method that will get an array of integers
		// and return the average as a double
		// Make the method private
		private double arrayAvg(int[] arr) {
			// I am calling arraySum() method and passing the arr
			double sum = arraySum(arr);
	​
			double avg = sum / arr.length;
			return avg;
		}
	​
		// Task2
		// Create a method that will get an array of integers,
		// and return the sum
		// Make the method protected
		protected int arraySum(int[] arr) {
			int sum = 0;
	​
			for (int el : arr) {
				sum += el;
			}
	​
			return sum;
		}
	​
		public int largestNumber(int[] arr) {
			int largest = arr[0];
	​
			for (int el : arr) {
				if (el > largest) {
					largest = el;
				}
			}
	​
			return largest;
		}
	​
	}
	}

}
