package DataStructureAlgorilsm.dequy_recursion;

import java.util.concurrent.Future;

public class Fibonaci {
    static int[] F = new int[1000];

    /**
     * Bài toán cơ sở:
     * Fibo(1)=1;
     * Fibo(2)=1
     * <p>
     * Cong thúc quy nạp:
     * Fibo(n)= Fibo(n-1)+Fibo(n-2)
     */
    public static void main(String[] args) {
        System.out.println(FiBo2(5));
    }

    public static int FiBo(int n) {
        // bai toan co so
        if (n <= 2)
            return 1;
        // Cong thuc quy nap
        int Fn = FiBo(n - 1) + FiBo(n - 2);
        return Fn;
    }

    /**
     * De quy co nho
     * @param n
     * @return
     */
    public static int FiBo2(int n) {
        if (F[n] != 0)
            return F[n];
        System.out.println("Can tinh F["+n+"]");
        // bai toan co so
        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = FiBo2(n - 1) + FiBo2(n - 2);
        return F[n];
    }
}
