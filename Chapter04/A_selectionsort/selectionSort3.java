package Chapter04.A_selectionsort;

import java.util.Scanner;
// 오름차순 (최솟값 기준)
public class selectionSort3 {
    public static int[] A;

    public static void makeArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 99 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) i--;
            }
        }
    }

    public static void selectionsort3(int arr[], int n) {
        for (int first = 0; first < n; first++) {
            int k = theLeast(arr, first, n);
            swap(arr, first, k);
        }
    }

    public static int theLeast(int arr[], int first, int n) {
        int least = n-1;
        for(int i = first; i < n; i++) {
            if(arr[least] > arr[i]) least = i;
        }
        return least;
    }

    public static void swap(int arr[], int first, int k) {
        int temp;
        temp = arr[first];
        arr[first] = arr[k];
        arr[k] = temp;
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
        selectionsort3(A,n);
        System.out.print("결과: ");
        printArray(A, n);
    }

}
