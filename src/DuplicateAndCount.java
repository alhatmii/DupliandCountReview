import java.util.HashSet;
import java.util.Set;

public class DuplicateAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countAndReviewNumbers(new int[] {0, 8, 1, 9, 9, 9, 9, 6, 4, 4, 5, 5, });
		// Output: There are 5 unique numbers: [1, 2, 3, 4, 5]
	}

	public static void countAndReviewNumbers(int[] numbers) {
		// Create a set from the numbers to remove duplicates
		Set<Integer> uniqueNumbers = new HashSet<>();
		for (int number : numbers) {
			uniqueNumbers.add(number);
		}

		// Get the count of unique numbers
		int count = uniqueNumbers.size();

		// Print a review of the unique numbers
		System.out.println("There are " + count + " unique numbers: " + uniqueNumbers);
	}

}
