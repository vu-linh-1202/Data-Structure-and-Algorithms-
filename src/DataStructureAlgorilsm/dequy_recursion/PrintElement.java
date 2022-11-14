package DataStructureAlgorilsm.dequy_recursion;

public class PrintElement {
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,4,5,6,7,8,9};
        printElement(arr, 0);
    }
    public static void printElement(int[] arr, int index) {
        // bai toan co so
        if (index < 0 | index >= arr.length)
            return;
        // Cong thuc quy nap: in phan tu index, then print index+1;
        System.out.println(arr[index]);
        printElement(arr, index + 1);
    }
}
