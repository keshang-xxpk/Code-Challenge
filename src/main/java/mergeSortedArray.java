//Given two sorted integer arrays A and B, merge B into A as one sorted array.
//You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B.
//The number of elements initialized in A and B are m and n respectively.

//Two Pointers
public class mergeSortedArray {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int i = m - 1;
        int j = n - 1;
        int x = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]){
                A[x --] = A[i--];
            }else{
                A[x--] = B[j--];
            }
        }
        while (i >= 0) {
            A[x --]=A[i --];
        }
        while (j >= 0) {
            A[x --]=B[j --];
        }
    }
}
