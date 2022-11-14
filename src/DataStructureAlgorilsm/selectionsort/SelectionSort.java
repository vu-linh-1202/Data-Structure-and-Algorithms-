package DataStructureAlgorilsm.selectionsort;

public class SelectionSort {
    /**
     * Chạy từ đầu đến cuối mảng
     * Tại vòng lặp thứ i, tìm phần tử nhỏ nhất từ [i+1, n-1], nếu nhỏ hơn a[i] thì đổi chỗ cho a[i]
     * Sau vòng lặp thứ i, thì dãy [0,i] đã được sắp xếp
     */
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 8, 9, 2, 0};
        selectionSort(a);
    }

    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d", a[i]);
        }
        System.out.println();
    }

    private static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                //search min [i, n]
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
            printArray(i, a);
        }
    }
}
