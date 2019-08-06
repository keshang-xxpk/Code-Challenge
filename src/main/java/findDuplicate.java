//Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
//prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.


import java.util.HashSet;
import java.util.Set;

//method1 HashSet O(N) O(N)
public class findDuplicate {
    public int findDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<Integer>();
        int i = 0;
        for(i = 0;i<nums.length - 1;i++){
            if(!hash.contains(nums[i])) {
                hash.add(nums[i]);
            }else {
                break;
            }
        }
        return nums[i];
    }
}
