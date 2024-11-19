package Nov.ex_04112024;

import java.util.HashMap;

/*
Find the Frequency of Each Element in an Array ( Hashmap)
Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};   O/p 2→ 3 , 3 → 2 , 4→ 2,  5→ 3
 */
public class Task2_frequency {
    public static void main(String[] args) {
                // Input array
                Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

                // Create a HashMap to store element frequencies
                HashMap<Integer, Integer> frequencyMap = new HashMap<>();

                // Use a for-each loop to populate the HashMap
                for (Integer num : numbers) {
                    frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
                }

                // Print the frequency of each element
                for (Integer key : frequencyMap.keySet()) {
                    System.out.println(key + " → " + frequencyMap.get(key));
                }

    }
}

