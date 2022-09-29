import java.util.Scanner;

// return값 받는 대신 merge 함수 실행 직후에 출력되게끔 코드 수정.
public class mergesort {
  public static int[] A;
  public static int[] tmp;
  public static int count = 1;

  public static void makeArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      arr[i] = (int)(Math.random() * 99 + 1);
      for (int j = 0; j < i; j++) {
        if (arr[j] == arr[i]) i--;
      }
    }
  }

  public static void printarray(int arr[], int size1, int size2) {
    for (int i = size1; i < size2; i++) {
      System.out.printf("%d ", arr[i]);
    }
    System.out.println();
  }

  public static void mergeSort(int[] arr, int start, int end) {
    if (start < end) {
      int mid = (int)(start + end) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, start, mid, end);
    }
  } // mergeSort -> 배열 분할

  public static void merge(int[] arr, int start, int mid, int end) {
    int i = start, j = mid + 1, t = 0;
    while ((i <= mid) && (j <= end)) {
      if (arr[i] <= arr[j]) {
        tmp[t++] = arr[i++];
      } else {
        tmp[t++] = arr[j++];
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
    System.out.println();
    System.out.print("과정" + count + ": ");
    count++;
    printarray(arr, start, end+1);
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
    printarray(A, 0, n);
    System.out.printf("<과정>\n");
    mergeSort(A, 0, n - 1);
    System.out.println();
    System.out.print("Sort된 배열 상태: ");
    printarray(A, 0, n);
    System.out.println();
  }
}