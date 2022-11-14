package DataStructureAlgorilsm.dequy_recursion;

/**
 * Find max using Recursion
 */
public class FindMax {
    private static int currentMax = -1;

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2, 4, 0};
        currentMax = -1;
        findMax1(arr, 0);
        System.out.println(currentMax);
        System.out.println(findMax2(arr, 0, -1));
    }

    // Not return result
    public static void findMax1(int[] arr, int i) {
        if (i < arr.length) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            }
            findMax1(arr, i + 1);
        }
    }

    // return result
    public static int findMax2(int[] arr, int i,int previousMax){
        if (i<arr.length){
            int curMax= Math.max(previousMax, arr[i]);
           return findMax2(arr, i+1, curMax);
        }
        return previousMax;
    }
}
