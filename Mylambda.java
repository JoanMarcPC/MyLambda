
import java.util.ArrayList;

public class Mylambda {

	@FunctionalInterface
	interface Odd {
		// abstract method
		public boolean isOdd(int number);
	}

	@FunctionalInterface
	interface Prime {
		// abstract method
		public boolean isPrime(int number);
	}

	@FunctionalInterface
	interface Palindrome {
		// abstract method
		public boolean isPalindrome(int number);
	}

	static Odd odd1 = n -> { 
		if (n % 2 == 0)
			return true;
		else
			return false;
	};

	static Prime prime1 = n -> {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	};

	static Palindrome palindrome1 = n -> {
		int temp = 0;
		int remainder = 0;
		int reverse = 0;
		int duplicate = n;
		int aux = n;
		while (aux > 0) {

			remainder = aux % 10;
			aux /= 10;
			reverse = reverse * 10 + remainder;
			temp = reverse;
		}
		if (duplicate == temp) {
			return true;
		} else {
			return false;
		}
	};

	public static ArrayList<Boolean> checker(ArrayList<Integer> nums) {
		ArrayList<Boolean> results = new ArrayList<Boolean>();
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) < 0) {
				results.add(false);
				results.add(false);
				results.add(false);
				if (nums.get(i) == 0)
					System.out.println("NOT A POSSIBLE OPTION");

			} else {
				results.add(odd1.isOdd(nums.get(i)));
				results.add(prime1.isPrime(nums.get(i)));
				results.add(palindrome1.isPalindrome(nums.get(i)));

			}
		}
		return results;
	}

	
}
