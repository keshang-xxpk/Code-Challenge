import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//*Given an array S of n integers, are there elements a, b, c
// in S such that a + b + c = 0?
// Find all unique triplets in the array which gives the sum of zero.
public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res=new ArrayList<>();

        if(nums==null||nums.length==0){
            return res;
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length - 2;i++){
            if(i>0&&nums[i]==nums[i - 1]){
                continue;
            }

            int target= -nums[i];
            int start=i + 1;
            int end=nums.length - 1;

            helper(nums,start,end,target,res);
        }
        return res;
    }


    public void helper(int[] nums,
                       int start,
                       int end,
                       int target,
                       List<List<Integer>> res){


        while(start<end){
            if(start<end&&target==nums[start]+nums[end]){

                List<Integer> triple=new ArrayList<Integer>();

                triple.add(-target);
                triple.add(nums[start]);
                triple.add(nums[end]);
                res.add(triple);
                start++;
                end--;

                while(start<end&&nums[start]==nums[start - 1]){
                    start++;
                }

                while(start<end&&nums[end]==nums[end + 1]){
                    end--;
                }
            } else if(start<end&&nums[start]+nums[end]<target){
                start++;
            }else{
                end--;
            }
        }
    }
}
