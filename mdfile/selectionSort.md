# SelectionSort [선택정렬]

## 1. Ascending SelectionSort( base : max index )

```
selectionSort(A[], n)
{
    for (last ← n) downto 2 {
        k ← theLarge(A, last);
        A[k] ↔ A[last];
    }
}

theLarge(A[], last) {
    largest ← 1;
    for (i = 2) to last {
        if(A[largest] < A[i]) then largest ← i;
    }
    return largest;
}
```

## 2. Descending SelectionSort ( base : max index )

```
selectionSort(A[], n)
{
    for (first ← 1) to n{
        k ← theLarge(A, first, n);
        A[k] ↔ A[first];
    }
}

theLarge(A[], first, n) {
    largest = n;
    for (i = first) to n-1 {
        if(A[largest] < A[i]) then largest ← i;
    }
    return largest;
}
```

## 3. Ascending SelectionSort( base : min index )

```
selectionSort(A[], n)
{
    for (first ← 1) to n {
        k ← theLeast(A, first, n);
        A[first] ↔ A[k];
    }
}

theLeast(A[], first, n)
{
    least ← n;
    for (i ← first) to n-1 {
        if(A[least] > A[i]) then least ← i;
    }
    return least;
}
```

## 4. Descending SelectionSort( base : min index )

```
selectionSort(A[], n)
{
    for (last ← n) downto 2 {
        k ← theLeast(A, last);
        A[last] ↔ A[k];
    }
}

theLeast(A[], n)
{
    least ← 1;
    for (i ← 2) to last {
        if(A[least] > A[i]) then least ← i;
    }
    return least;
}
```