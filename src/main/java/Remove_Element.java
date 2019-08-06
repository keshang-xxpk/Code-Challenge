//Given an array and a value, remove all occurrences of that value in place and return the new length.

//The order of elements can be changed, and the elements after the new length

public class Remove_Element {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            if (A[left] == elem){
                A[left] = A[right];
                right --;
            }else {
                left ++;
            }
        }
        return right + 1;
    }
}

