
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // if the element is already in the set we found a duplicate
            if (seen.contains(num)) {
                return true;
            }
            // othrws add the element to the set
            seen.add(num);
        }
        
        return false;
    }
}