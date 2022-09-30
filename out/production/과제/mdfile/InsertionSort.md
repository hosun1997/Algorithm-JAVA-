# InsertionSort [삽입 정렬]

## 1. Ascending SelectionSort

```
insertionSort(A[], n)
{
    for (i ← 2) to n {
        loc ← i-1;
        newItem ← A[i];
        while(loc >= 1 and newItem < A[loc]) {
            A[loc + 1] ← A[loc];
            loc--;
        }
        A[loc+1] ← newItem;
    }
}
```

## 2. Descending SelectionSort

```
insertionSort(A[], n)
{
    for (i ← n) downto 1 {
        loc ← i + 1;
        newItem ← A[i];
        while(loc <= n and newItem < A[loc]) {
            A[loc-1] ← A[loc];
            loc++;
        }
        A[loc-1] ← newItem;
    }
}
```