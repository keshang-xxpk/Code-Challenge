import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSets {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        if (nums == null) {
            return res;
        }

        Arrays.sort(nums);
        helper(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void helper(int[] nums, int startIndex, ArrayList<Integer> subset, List<List<Integer>> res) {
        if (startIndex == nums.length) {
            res.add(new ArrayList<Integer>(subset));
            return;
        }
        subset.add(nums[startIndex]);
        helper(nums, startIndex + 1, subset, res);
        subset.remove(subset.size() - 1);
        helper(nums, startIndex + 1, subset, res);

    }
}
