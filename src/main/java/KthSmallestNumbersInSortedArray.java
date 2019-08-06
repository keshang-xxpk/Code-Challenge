//Find the kth smallest number in an unsorted integer array.
//quicksort
//O(n)
public class KthSmallestNumbersInSortedArray {
    /**
     * @param k: An integer
     * @param nums: An integer array
     * @return: kth smallest element
     */
    public int kthSmallest(int k, int[] nums) {
        // write your code here
        return quickSelct(k - 1,0,nums.length - 1,nums);

    }

    public int quickSelct(int k,int start,int end,int[] nums) {
        if (start == end) {
            return nums[start];
        }
        int left = start;
        int right = end;
        int mid = nums[(left + right)/2];

        while (left <= right){
            while (left <= right && nums[left] < mid) {
                left ++;
            }
            while (left <= right && nums[right] > mid) {
                right --;
            }
            if (left <= right) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left ++;
                right --;
            }
        }
        if(right >= k && right >= start) {
            return quickSelct(k,start,right,nums);
        }else if(left <= k && left <= end) {
            return quickSelct(k,left,end,nums);
        }else return nums[k];
    }
}
