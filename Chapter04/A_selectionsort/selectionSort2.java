package Chapter04.A_selectionsort;

import java.util.Scanner;
// 내림차순 (최댓값 기준)
public class selectionSort2 {
    public static int[] A;

    public static void makeArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 99 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) i--;
            }
        }
    }

    public static void selectionsort2(int arr[], int n) {
        for(int first = 0; first < n; first++) {
            int k = theLarge(arr, first, n);
            swap(arr, first, k);
        }
    }

    public static int theLarge(int arr[], int first, int n) {
        int largest = n-1;
        for(int i = first; i<n; i++) {
            if(arr[largest] < arr[i]) largest = i;
        }
        return largest;
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
        selectionsort2(A,n);
        System.out.print("결과: ");
        printArray(A, n);
    }

}
