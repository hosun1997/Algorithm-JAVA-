package Chapter04.A_selectionsort;

import java.util.Scanner;
// 오름차순 (최댓값 기준)
public class selectionSort1 {
  public int[] A;
  public static int count = 1;

  public static void makeArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      arr[i] = (int)(Math.random() * 99 + 1);
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

  public static void selectionsort1(int arr[], int n) {
    int tmp;
    for (int i = n - 1; i > 0; i--) {
      System.out.println(count + "회");
      int k = theLargest(arr, i);
      tmp = arr[i];
      arr[i] = arr[k];
      arr[k] = tmp;
      printArray(arr, n);
      count++;
      System.out.println();
    }
  }

  public static int theLargest(int arr[], int n) {
    int max_idx = 0;
    for (int i = 1; i <= n; i++) {
      if (arr[max_idx] < arr[i]) max_idx = i;
    }
    return max_idx;
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
    selectionsort1(A, n);

    System.out.print("결과: ");
    printArray(A, n);

  }
}
