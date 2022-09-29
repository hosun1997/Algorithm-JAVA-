package Chapter04.B_bubblesort;

import java.util.Scanner;


public class bubbleSort1_upgrade {
    public int[] A;
    public static int count = 1;

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

    public static void bubblesort1(int arr[], int n) {
        for (int i = n - 1; i > 0; i--) {
            String sorted = "TRUE";
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    System.out.println(count + "회");
                    count++;
                    printArray(arr, n);
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
        System.out.println();
        System.out.println("<과정>");
        bubblesort1(A, n);
        System.out.println();
        System.out.print("결과: ");
        printArray(A, n);
    }
}
