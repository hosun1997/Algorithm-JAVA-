package Chapter04.B_bubblesort;

import java.util.Scanner;

public class bubbleSort2 {
    public int[] A;

    public static void makeArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 99 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) i--;
            }
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void swap(int arr[], int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void bubblesort2(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            String sorted = "TRUE";
            for (int last = n - 1; last >= 1; last--) {
                if (arr[last] < arr[last - 1]) {
                    swap(arr, last, last - 1);
                    sorted = "FALSE";
                }
            }
            if (sorted == "TRUE") return;
        }
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
        bubblesort2(A, n);
        System.out.println();
        System.out.print("결과: ");
        printArray(A, n);
    }

}
