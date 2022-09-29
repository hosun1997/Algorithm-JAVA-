import java.util.Scanner;
// 내림차순 (최솟값 기준)
public class test {
    public static int[] A;

    public static void makeArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 99 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) i--;
            }
        }
    }

    public static void selectionsort4(int arr[], int n) {
        for (int last = n-1; last > 0; last--) {
            int k = theLeast(arr, last);
            swap(arr, last, k);
        }
    }

    public static int theLeast(int arr[], int last) {
        int least = 0;
        for(int i = 1; i <= last; i++) {
            if(arr[least] > arr[i]) least = i;
        }
        return least;
    }

    public static void swap(int arr[], int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("배열의 크기 n값을 입력하세요: ");
        n = sc.nextInt();
        A = new int[n];
        makeArray(A, n);
        System.out.print("배열: ");
        printArray(A, n);
        selectionsort4(A,n);
        System.out.print("결과: ");
        printArray(A, n);
    }

}
