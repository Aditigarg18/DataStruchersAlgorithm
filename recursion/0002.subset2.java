class Solution {
    
// Function to generate all unique subsets
private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {

    // Add current subset to result
    result.add(new ArrayList<>(current));

    // Iterate over array from start index
    for (int i = start; i < nums.length; i++) {

        // Skip duplicate elements at the same recursion level
        if (i > start && nums[i] == nums[i - 1]) {
            continue;
        }

        // Include current element
        current.add(nums[i]);

        // Recurse
        backtrack(i + 1, nums, current, result);

        // Backtrack
        current.remove(current.size() - 1);
    }
}

public List<List<Integer>> subsetsWithDup(int[] nums) {

    Arrays.sort(nums); // Sort to group duplicates

    List<List<Integer>> result = new ArrayList<>();

    backtrack(0, nums, new ArrayList<>(), result);

    return result;
}
}

    
