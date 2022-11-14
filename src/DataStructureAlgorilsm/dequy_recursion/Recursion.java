package DataStructureAlgorilsm.dequy_recursion;

public class Recursion {
    /**
     * Đặc điểm của đệ quy:
     * Một bài toán chỉ áp dụng được phương pháp đệ quy nếu đủ 2 yếu tố sau đây:
     * Bài toán cơ sở/Điều kiện dừng
     * 0!=1
     * Công thức quy nạp: phải đưa về bài toán con nhỏ hơn (cuối cùng là bài toán cơ sở)
     * n!=n*(n-1)!
     */
    public static void main(String[] args) {
        System.out.println(giaiThua(4));
    }

    //tinh n giai thua
    public static int giaiThua(int n) {
        // bai toan co so
        if (n == 0)
            return 1;
        //cong thuc quy nap
        int t = n * giaiThua(n - 1);
        return t;
    }
}
