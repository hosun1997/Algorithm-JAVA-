package Chapter04.F_heapsort;

import java.util.Scanner;

public class heapSort2 {
    public static int[] A;


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

    public static void swap(int arr[], int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void heapSort(int arr[], int n) {
        buildHeap(arr, n);
        for (int i = n; i>0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i-1);
        }
    }

    public static void buildHeap(int arr[], int n) {
        for(int i = (n/2); i>=0; i--) {
            heapify(arr, i, n);
        }

    }

    public static void heapify(int arr[], int k, int n) {
        int left = 2 * k; int right = 2* k + 1;
        int large;
        if(right <= n) {
            if (arr[left] < arr[right]) {
                large = right;
            } else {
                large = left;
            }
        } else if (left <= n) {
            large = left;
        } else return;

        if(arr[large] > arr[k]) {
            swap(arr, k, large);
            heapify(arr, large, n);
        }
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
        heapSort(A, n-1);
        System.out.println();
        System.out.print("결과: ");
        printArray(A, n);
    }
}
