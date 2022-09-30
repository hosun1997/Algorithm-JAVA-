package Chapter04.D_mergesort;

import java.util.Scanner;

public class mergeSort2 {
    public static int[] A;
    public static int[] tmp;

    public static void makeArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 99 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) i--;
            }
        }
    }

    public static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int p, int r) {
        if (p < r) {
            int mid = (int)(p + r) / 2;
            mergeSort(arr, p, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, p, mid, r);
        }
    } // mergeSort -> 배열 분할

    public static void merge(int[] arr, int start, int mid, int end) {
        int i = start, j = mid + 1, t = 0;
        while ((i <= mid) && (j <= end)) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[j++];
            } else {
                tmp[t++] = arr[i++];
            }
        } // -> 분할된 두 배열에서 작은 숫자부터 tmp에 넣기.
        while (i <= mid) {
            tmp[t++] = arr[i++];
        } // -> 분할된 2개 배열 중 왼쪽 배열이 남은 경우
        while (j <= end) {
            tmp[t++] = arr[j++];
        } // -> 분할된 2개 배열 중 오른쪽 배열이 남은 경우
        // System.out.print("tmp: ");
        i = start;
        t = 0;
        while (i <= end) {
            arr[i++] = tmp[t++];
        } // -> Sort된 배열 tmp에서 배열 arr에 넣기.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("배열의 크기 n값을 입력하세요: ");
        n = sc.nextInt();
        A = new int[n];
        tmp = new int[n];

        makeArray(A, n);

        System.out.println();
        System.out.printf("초기 배열 상태: ");
        printarray(A, n);
        mergeSort(A, 0, n - 1);
        System.out.print("Sort된 배열 상태: ");
        printarray(A, n);
        System.out.println();
    }
}