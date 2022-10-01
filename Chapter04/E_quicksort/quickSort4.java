package Chapter04.E_quicksort;

import java.util.Scanner;

public class quickSort4 {
    public int[] A;

    public static void makeArray(int arr[], int n) {
        for(int i = 0; i < n; i ++) {
            arr[i] = (int) (Math.random()*99+1);
            for(int j=0; j<i; j++) {
                if (arr[j] == arr[i]) i--;
            }
        }
    }

    public static void printArray(int arr[], int n) {
        for(int i=0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int p, int r) {
        if(p < r) {
            int q = partition(arr, p, r);
            quicksort(arr, p, q-1);
            quicksort(arr, q+1, r);
        }
    }

    public static int partition(int arr[], int p, int r) {
        int x = arr[p];
        int i = r+1;
        for(int j = r; j > 0; j--) {
            if(arr[j] < x) swap(arr, --i, j);
        }
        swap(arr,i-1,p);
        return i-1;
    } // x값보다 작으면 i part에 저장, 크면 j part에 저장. 끝나면 r위치의 x값을 i와 j 사이로 이동

    public static void swap(int arr[], int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("배열의 크기 n값을 입력하세요: ");
        n = sc.nextInt();
        int A[] = new int[n];
        makeArray(A, n);
        System.out.print("배열: ");
        printArray(A, n);
        quicksort(A, 0, n-1);
        System.out.println();
        System.out.print("결과: ");
        printArray(A, n);
    }
}
