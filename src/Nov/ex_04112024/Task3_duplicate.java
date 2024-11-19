package Nov.ex_04112024;

import java.util.HashSet;
import java.util.List;

/*
Find Duplicate Elements of an Array
int[] numbers = {1, 2, 3, 4, 5, 1, 2};  o/p →  1,2
 */
public class Task3_duplicate {
    public static void main(String[] args) {
        // Input array
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};

        // Create a HashSet to store unique elements
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Iterate through the array
        for (int num : numbers) {
            // If the element is already in 'seen', it's a duplicate
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        // Print the duplicates
        System.out.println("Duplicate elements: " + duplicates);

    }
}
