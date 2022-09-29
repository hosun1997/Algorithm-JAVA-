package Chapter04.C_insertionsort;

import java.util.Scanner;

public class insertionSort1 {
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

    public static void insertionsort1(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int loc = i - 1;
            int newItem = arr[i];
            while ((loc >= 0) && (newItem < arr[loc])) {
                arr[loc + 1] = arr[loc];
                loc--;
            }
            arr[loc + 1] = newItem;
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
        insertionsort1(A, n);
        System.out.print("결과: ");
        printArray(A, n);
    }
}
