public class test {
    public static int[] A = {3,3,3,2,2,1,1};
    public static int[] B;
    public static int[] C;

    public static int findK(int[] A) {
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (max < A[i]) max = A[i];
        }
        return max + 1;
    }


    public static void countingSort(int[] A, int[] B, int n) {
        int k = findK(A);
        B = new int[n];
        C = new int[k];

        for (int i = 0; i < k; i++) {
            C[i] = 0;
        }

        for (int j = 0; j < n; j++) {
            C[A[j]-1]++;
        }
        System.out.println("Counting(누적X): ");
        for (int i = 0; i < k; i++) {
            System.out.printf("%d  ", C[i]);
        }
        System.out.println();

        for (int i = 1; i < k; i++) {
            C[i] = C[i] + C[i - 1];
        }
        System.out.println("Counting(누적O): ");
        for (int i = 0; i < k; i++) {
            System.out.printf("%d  ", C[i]);
        }
        System.out.println();

        for (int j = n - 1; j >= 0; j--) {
            B[C[A[j]]] = A[j];
            C[A[j]]--;
        }

        System.out.println("결과: ");
        for (int i = 0; i < B.length; i++) {
            System.out.printf("%d  ", B[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("초기배열: ");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%d  ", A[i]);
        }
        System.out.println();

        countingSort(A, B, A.length);


    }

}
