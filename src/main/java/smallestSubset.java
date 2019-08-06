//Description
//Given an array of non-negative integers. Our task is to find minimum number of elements such that their sum should be greater than the sum of rest of the elements of the array.

import java.util.Arrays;

public class smallestSubset {
    /**
     * @param arr:  an array of non-negative integers
     * @return: minimum number of elements
     */
    public int minElements(int[] arr) {
        // write your code here
        int sum = 0;
        for(int i = 0;i < arr.length;i++) {
            sum += arr[i];
        }
        int res = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1;i > 0;i --) {
            int currSum = 0;
            currSum += arr[i];
            res ++;
            if (currSum > sum - currSum) {
                break;
            }
        }
        return res;
    }
}


