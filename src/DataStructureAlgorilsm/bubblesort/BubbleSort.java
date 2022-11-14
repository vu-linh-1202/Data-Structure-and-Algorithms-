package DataStructureAlgorilsm.bubblesort;

public class BubbleSort {
    /**
     * Nguyên lý
     * Chạy từ đầu đến cuối mảng
     * Nếu phần tử đứng trước mà lớn hơn phần tưr đúng sau thì đổi chỗ
     * Sau mỗi vòng lặp thì phần tử lớn nhất sẽ trôi xuống dưới
     */

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        bubbleSort(a);
    }

    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d", a[i]);
        }
        System.out.println();
    }

    /**
     * Bubble Sort
     * If day da duoc sap xep thi break
     * @param a
     */
    private static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            printArray(i, a);
            if (isSorted) {
                break;
            }
        }
    }
}
