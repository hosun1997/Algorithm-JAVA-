package Homework;

// return값 받는 대신 merge 함수 실행 직후에 출력되게끔 코드 수정.
public class ch04 {
  public static int[] A = {90,2,7,1,50,40, 21, 19, 3, 11};
  public static int[] tmp = new int[A.length];
  public static int count = 1;

  public static void printarray(int arr[], int size1, int size2) {
    for (int i = size1; i < size2; i++) {
      System.out.printf("%d ", arr[i]);
    }
    System.out.println();
  } // 배열을 출력하는 함수

  public static void mergeSort(int[] arr, int start, int end) {
    if (start < end) {
      int mid = (int)(start + end) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid+1, end);
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
    System.out.print("분할 + 병합" + count + ": ");
    count++;
    printarray(arr, start, end+1);
    System.out.print("현 배열 상태: ");
    printarray(arr, 0, A.length);
  }
  public static void main(String[] args) {
    System.out.println();
    System.out.printf("초기 배열 상태: ");
    printarray(A, 0, A.length);
    System.out.printf("<과정>\n\n");
    mergeSort(A, 0, A.length - 1);
    System.out.println();
    System.out.print("Sort된 배열 상태: ");
    printarray(A, 0, A.length);
    System.out.println();
  }
}